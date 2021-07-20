package ru.task8.reader;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MySimpleFileCreator {
  private static final String CONSTANT_LOVE_JAVA = "Люблю Java";

  public static void main(String[] args) {
    try {
      Path path =
          Files.createFile(
              Paths.get("src/ru/task8/resources/FileCreatedByJava.txt")
                  .normalize()
                  .toAbsolutePath());

      if (path.toFile().canWrite()) {
        Files.writeString(path, CONSTANT_LOVE_JAVA);
      } else {
        System.out.println("Не могу записать файл");
      }

    } catch (FileAlreadyExistsException ex) {
      System.out.println("File already exists");
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }
}
