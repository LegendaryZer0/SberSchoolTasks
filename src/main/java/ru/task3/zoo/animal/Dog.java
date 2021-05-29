package ru.task3.zoo.animal;

import ru.task3.zoo.actions.Huntable;
import ru.task3.zoo.actions.Voiceable;

public class Dog extends Animal implements Huntable, Voiceable {
  @Override
  public void hunt() {
    System.out.println("I AM HUNTING ON CATS");
  }

  @Override
  public void doVoice() {
    System.out.println("GAV-GAV");
  }
}
