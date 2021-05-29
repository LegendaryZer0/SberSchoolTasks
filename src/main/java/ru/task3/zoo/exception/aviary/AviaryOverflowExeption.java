package ru.task3.zoo.exception.aviary;

public class AviaryOverflowExeption extends RuntimeException {
  public AviaryOverflowExeption() {
    super("The aviary is full!");
  }
}
