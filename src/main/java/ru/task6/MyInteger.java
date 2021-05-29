package ru.task6;

import ru.task6.util.CountOfDelimFinder;
import ru.task6.util.CountOfSimpleDelimFinderImpl;

import java.util.Objects;

public class MyInteger implements Comparable<MyInteger> {
  private Integer integer;
  private CountOfDelimFinder<Integer> countOfSimpleDelFinder;

  public MyInteger(Integer integer) {
    this.integer = integer;
    countOfSimpleDelFinder = new CountOfSimpleDelimFinderImpl();
  }

  public int compareTo(MyInteger anotherInteger) {

    if (countOfSimpleDelFinder.findAllDelimeters(integer)
            - countOfSimpleDelFinder.findAllDelimeters(anotherInteger.getInteger())
        == 0) {
      System.out.println("have equally count of delimeters");
      return 0;
    } else if (countOfSimpleDelFinder.findAllDelimeters(integer)
            - countOfSimpleDelFinder.findAllDelimeters(anotherInteger.getInteger())
        > 0) {
      return 1;
    } else {
      return -1;
    }
  }

  public Integer getInteger() {
    return integer;
  }

  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  public CountOfDelimFinder<Integer> getCountOfSimpleDelFinder() {
    return countOfSimpleDelFinder;
  }

  public void setCountOfSimpleDelFinder(CountOfDelimFinder<Integer> countOfSimpleDelFinder) {
    this.countOfSimpleDelFinder = countOfSimpleDelFinder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MyInteger)) return false;
    MyInteger integer1 = (MyInteger) o;
    return compareTo(integer1) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getInteger(), getCountOfSimpleDelFinder());
  }

  @Override
  public String toString() {
    return "MyInteger{" + "integer=" + integer + '}';
  }
}
