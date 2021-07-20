package ru.task3.zoo.exception.aviary;

public class IdenticalAnimalsInAviaryExeption extends RuntimeException {
  public IdenticalAnimalsInAviaryExeption() {
    super("No two animals in the aviary are alike");
  }
}
