package ru.task3.zoo.animal;

import ru.task3.zoo.actions.Huntable;
import ru.task3.zoo.actions.Voiceable;

public class Cat extends Animal implements Huntable, Voiceable {
  @Override
  public void hunt() {
    System.out.println("I AM HUNTING ON MOUSE");
  }

  @Override
  public void doVoice() {
    System.out.println("MYAW-MYAW-MYAW");
  }
}
