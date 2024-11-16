package it.marcodemartino.fluentbotapi.utils;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import java.util.List;
import java.util.regex.Pattern;

public class ParserUtils {

  public static String snakeToCamelCase(String snake) {
    return Pattern.compile("_([a-z])")
        .matcher(snake)
        .replaceAll(m -> m.group(1).toUpperCase());
  }

  public static TypeName parseType(String field) {
    if (field.startsWith("Array of ")) {
      // Count the number of "Array of " occurrences to determine the depth of nesting
      int depth = 0;
      while (field.startsWith("Array of ")) {
        depth++;
        field = field.substring(9);
      }

      // Build nested parameterized types, starting from the innermost type
      TypeName type = ClassName.get("it.marcodemartino.fluentbotapi.entities", field.replaceAll("Integer", "Long"));
      for (int i = 0; i < depth; i++) {
        type = ParameterizedTypeName.get(ClassName.get(List.class), type);
      }
      return type;
    }

    String fieldType = field.replaceAll("Integer", "long").replaceAll("Float", "float");
    return ClassName.get("it.marcodemartino.fluentbotapi.entities", fieldType);
  }

}