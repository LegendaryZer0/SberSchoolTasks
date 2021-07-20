package ru.task6.util;

public class CountOfSimpleDelimFinderImpl implements CountOfDelimFinder<Integer> {
  private Eratosfen eratosfen;

  public CountOfSimpleDelimFinderImpl() {
    eratosfen = new Eratosfen();
  }

  @Override
  public Long findAllDelimeters(Integer number) {
    System.out.println(number);
    configureEratosfen(number);
    long countOfDelimeters = 0;
    for (int i = 0; i < eratosfen.getPrimes().length; i++) {
      if (eratosfen.getPrimes()[i] && number % i == 0) {
        countOfDelimeters++;
        System.out.println(i + "  simple delimeter of " + number);
      }
    }
    System.out.println("count of delimeters " + countOfDelimeters);
    return countOfDelimeters;
  }

  private void configureEratosfen(int number) {
    eratosfen.setPrimes(new boolean[number + 1]);
    eratosfen.fillSieve();
    ;
  }
}
