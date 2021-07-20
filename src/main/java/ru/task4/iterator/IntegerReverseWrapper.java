package ru.task4.iterator;

import java.util.Iterator;

public class IntegerReverseWrapper implements Iterable<Integer> {
  private final int number;
  private final boolean flag;
  private int stepNumber;

  public IntegerReverseWrapper(Integer number) {
    this.number = number;
    stepNumber = number;
    flag = true;
  }

  public static void main(String[] args) {
    IntegerReverseWrapper wrapper = new IntegerReverseWrapper(123456789);
    for (Integer num : wrapper) {
      System.out.print(num);
    }
  }

  @Override
  public Iterator<Integer> iterator() {
    return new ReverseNumIterator();
  }

  public class ReverseNumIterator implements Iterator<Integer> {

    @Override
    public boolean hasNext() {
      return stepNumber != 0;
    }

    @Override
    public Integer next() {
      int numberToReturn = stepNumber % 10;
      stepNumber /= 10;
      return numberToReturn;
    }
  }
}
