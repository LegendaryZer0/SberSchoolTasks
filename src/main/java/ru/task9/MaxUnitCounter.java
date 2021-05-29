package ru.task9;

import java.util.Arrays;

public class MaxUnitCounter {
  private static volatile long answer; // I'm not sure  "volatile" necessary.
  private static volatile long localMax;

  public static void countMaxUnitsLength(int[] binaryArray) {
    if (checkValid(binaryArray)) {
      Arrays.stream(binaryArray)
          .forEach(
              value -> {
                if (value == 1) {
                  localMax += 1;
                } else {
                  answer = Math.max(answer, localMax);
                  localMax = 0;
                }
              });
    }
  }

  private static boolean checkValid(int[] binaryArray) {
    return binaryArray != null;
  }

  public static void main(String[] args) {}

  public static long getAnswer() {
    return answer;
  }

  public static void setAnswer(long answer) {
    MaxUnitCounter.answer = answer;
  }

  public static long getLocalMax() {
    return localMax;
  }

  public static void setLocalMax(long localMax) {
    MaxUnitCounter.localMax = localMax;
  }
}
