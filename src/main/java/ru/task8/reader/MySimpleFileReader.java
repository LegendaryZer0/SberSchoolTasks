package ru.task8.reader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class MySimpleFileReader {
  public static void main(String[] args) {
    try (FileReader fileReader =
        new FileReader(
            Paths.get("src/ru/task8/resources/FileCreatedByMe.txt")
                .normalize()
                .toAbsolutePath()
                .toString())) {

      fileReader.skip(2);
      for (int i = 0; i < 4; i++) {
        System.out.println((char) fileReader.read());
      }
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }
}
