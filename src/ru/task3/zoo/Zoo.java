package ru.task3.zoo;

import ru.task3.zoo.actions.Huntable;
import ru.task3.zoo.animal.Animal;
import ru.task3.zoo.animal.Bear;
import ru.task3.zoo.animal.Monkey;
import ru.task3.zoo.exception.HugeSpeedException;
import ru.task3.zoo.exception.NegativeSpeedException;

public class Zoo {
  public static void main(String[] args) {
    Animal monkeyLikeAnimal = new Monkey();
    monkeyLikeAnimal.move();

    try {
      monkeyLikeAnimal.move(5);
    } catch (NegativeSpeedException | HugeSpeedException e) {
      System.out.println(e.getMessage());
    }

    Huntable huntableBear = new Bear();
    huntableBear.hunt();
  }
}
