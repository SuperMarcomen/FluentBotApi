package it.marcodemartino.fluentbotapi;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.lang.model.element.Modifier;

public class Main {

  public static void main(String[] args) throws URISyntaxException, IOException {

    MethodSpec main = MethodSpec.methodBuilder("main")
        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
        .returns(void.class)
        .addParameter(String[].class, "args")
        .addStatement("$T.out.println($S)", System.class, "Hello test, JavaPoet!")
        .build();

    TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
        .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
        .addMethod(main)
        .build();

    JavaFile javaFile = JavaFile.builder("it.marcodemartino", helloWorld)
        .build();

    Path path = Paths.get("./fluent-bot-api-library/src/main/java/it/marcodemartino/HelloWorld.java");

    try {
      String string = javaFile.toString();
      Files.writeString(path, string);
    } catch (java.lang.Exception e) {
      throw new RuntimeException(e);
    }
  }
}

