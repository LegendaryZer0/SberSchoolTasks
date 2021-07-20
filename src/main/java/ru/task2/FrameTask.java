package ru.task2;

import java.util.Scanner;

public class FrameTask {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int height = scanner.nextInt(); // высота
    int width = scanner.nextInt(); // ширина
    scanner.nextLine();
    String word = scanner.nextLine();

    int freeHeightCapacity = height - 1;
    int freeWidthCapacity = width - word.length();

    int marginPaddingTop = freeHeightCapacity / 2;
    int marginPaddingLeft = freeWidthCapacity / 2;

    if ((marginPaddingLeft > 0) && (marginPaddingTop > 0)) {

      for (int i = 0; i < width; i++) {
        System.out.print("*");
      }
      System.out.println();
      for (int i = 0; i < height - 2; i++) {
        if (i == marginPaddingTop - 1) {
          System.out.print("*");
          for (int j = 0; j < marginPaddingLeft - 1; j++) {
            System.out.print(" ");
          }
          System.out.print(word);
          for (int j = 0; j < marginPaddingLeft - 1; j++) {
            System.out.print(" ");
          }
          if (!((word.length() % 2 == 0 && width % 2 == 0)
              || (word.length() % 2 == 1 && width % 2 == 1))) {
            System.out.print(" ");
          }
          System.out.print("*");
        } else {
          System.out.print("*");
          for (int j = 0; j < width - 2; j++) {
            System.out.print(" ");
          }
          System.out.print("*");
        }
        System.out.println();
      }
      for (int i = 0; i < width; i++) {
        System.out.print("*");
      }
    } else {
      System.out.println("Ошибка");
    }
  }
}
