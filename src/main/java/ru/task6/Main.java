package ru.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<MyInteger> myIntegers = new ArrayList<>();
    MyInteger integer = new MyInteger(16);
    myIntegers.add(new MyInteger(13));

    myIntegers.add(new MyInteger(56));
    myIntegers.add(new MyInteger(179));
    myIntegers.add(new MyInteger(15));
    myIntegers.add(integer);

    System.out.println(myIntegers.add(new MyInteger(17)));
    myIntegers.sort(MyInteger::compareTo);
    System.out.println(myIntegers.toString());
  }
}
