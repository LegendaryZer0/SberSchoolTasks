package ru.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxUnitCounterTest {

  @BeforeEach
  void setUp() {
    MaxUnitCounter.setLocalMax(0);
    MaxUnitCounter.setAnswer(0);
  }

  @Test
  @DisplayName("test on find unit length with max length : 2")
  void countMaxUnitsLengthZER0() {
    MaxUnitCounter.countMaxUnitsLength(new int[] {0, 0, 0, 0, 0, 0, 0, 0});
    assertEquals(0, MaxUnitCounter.getAnswer());
  }

  @Test
  @DisplayName("test on find unit length with max length : 1")
  void countMaxUnitsLengthONE() {
    MaxUnitCounter.countMaxUnitsLength(new int[] {1, 0, 0, 1, 0, 1, 0, 1});
    assertEquals(1L, MaxUnitCounter.getAnswer());
  }

  @Test
  @DisplayName("test on find unit length with max length : 2")
  void countMaxUnitsLengthTWO() {
    MaxUnitCounter.countMaxUnitsLength(new int[] {1, 0, 0, 1, 1, 0, 0, 1});
    assertEquals(2L, MaxUnitCounter.getAnswer());
  }

  @Test
  @DisplayName("test on find unit length with null array")
  void countMaxUnitsLengthWithNull() {
    MaxUnitCounter.countMaxUnitsLength(null);
    assertEquals(0, MaxUnitCounter.getAnswer());
  }
}
