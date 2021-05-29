package ru.task4.matrix;

public class SpiralMatrix {
  public static void main(String[] args) {
    Integer[][] twoDimArray = {
      {5, 7, 3, 17},
      {7, 9, 1, 12},
      {8, 1, 2, 3},
      {5, 7, 3, 17},
      {5, 7, 3, 17},
      {1, 9, 2, 17},
      {5, 5, 2, 2}
    };
    SpiralMatrix matrixPrinter = new SpiralMatrix();
    matrixPrinter.print(twoDimArray);
  }

  public void print(Object[][] matrix) {
    if (matrix == null) return;
    int right = matrix[0].length;
    int left = 0;
    int up = 0, down = matrix.length;

    long lastedElements = right * down;

    System.out.println(matrix.length);
    while (left < right || up < down) {
      for (int i = left; i < right; i++) {
        System.out.print(matrix[up][i] + " ");

        lastedElements--;
        if (lastedElements == 0L) {
          return;
        }
      }

      up++;
      for (int i = up; i < down; i++) {
        System.out.print(matrix[i][right - 1] + " ");

        lastedElements--;
        if (lastedElements == 0L) {
          return;
        }
      }

      right--;
      for (int i = right - 1; i >= left; i--) {
        System.out.print(matrix[down - 1][i] + " ");

        lastedElements--;
        if (lastedElements == 0L) {
          return;
        }
      }

      down--;
      for (int i = down - 1; i >= up; i--) {
        System.out.print(matrix[i][left] + " ");

        lastedElements--;
        if (lastedElements == 0L) {
          return;
        }
      }

      left++;
    }
  }
}
