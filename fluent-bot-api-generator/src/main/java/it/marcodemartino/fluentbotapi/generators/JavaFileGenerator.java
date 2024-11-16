package it.marcodemartino.fluentbotapi.generators;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;
import it.marcodemartino.fluentbotapi.utils.ParserUtils;
import it.marcodemartino.fluentbotapi.entities.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.lang.model.element.Modifier;

public class JavaFileGenerator {

  public static final String DEFAULT_PATH = "./fluent-bot-api-library/src/main/java/it/marcodemartino/fluentbotapi/entities/%s.java";
  private final String name;
  private Builder typeSpecBuilder;

  public JavaFileGenerator(String name) {
    this.name = name;
    typeSpecBuilder = TypeSpec.interfaceBuilder(name)
        .addModifiers(Modifier.PUBLIC);
  }

  public JavaFileGenerator(String name, List<Field> fields) {
    this.name = name;

    List<FieldSpec> classAttributes = new ArrayList<>();

    if (fields != null) {
      for (Field field : fields) {
        FieldSpec build = buildField(field.types().get(0), field.name())
            .addAnnotation(AnnotationSpec.builder(ClassName.get("com.google.gson.annotations", "SerializedName")).addMember("value", "$S", field.name()).build())
            .build();
        classAttributes.add(build);
      }
    }

    typeSpecBuilder = TypeSpec.classBuilder(name)
        .addFields(classAttributes)
        .addAnnotation(AnnotationSpec.builder(ClassName.get("lombok", "Setter")).build())
        .addAnnotation(AnnotationSpec.builder(ClassName.get("lombok", "Getter")).build())
        .addAnnotation(AnnotationSpec.builder(ClassName.get("lombok.experimental", "Accessors")).addMember("fluent", "$L", true).build())
        .addModifiers(Modifier.PUBLIC, Modifier.FINAL);
  }

  public JavaFileGenerator addField(String fieldType, String fieldName) {
    typeSpecBuilder.addField(buildField(fieldType, fieldName).build());
    return this;
  }

  public JavaFileGenerator addSuperInterface(String name) {
    typeSpecBuilder = typeSpecBuilder.addSuperinterface(ParserUtils.parseType(name));
    return this;
  }

  public JavaFileGenerator save() {
    JavaFile javaFile = JavaFile.builder("it.marcodemartino.fluentbotapi.entities", typeSpecBuilder.build())
        .build();

    Path path = Paths.get(DEFAULT_PATH.formatted(name));

    try {
      String string = javaFile.toString();
      Files.write(path, string.getBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

    return this;
  }

  private FieldSpec.Builder buildField(String fieldType, String fieldName) {
    TypeName typeName = ParserUtils.parseType(fieldType);
    String varName = ParserUtils.snakeToCamelCase(fieldName);
    return FieldSpec.builder(typeName, varName);
  }
}
