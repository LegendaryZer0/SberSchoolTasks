package ru.task6.util;

@FunctionalInterface
public interface CountOfDelimFinder<T> {
  Long findAllDelimeters(T number);
}
