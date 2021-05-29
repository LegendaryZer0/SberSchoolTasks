package ru.task3.zoo;

import ru.task3.zoo.actions.Huntable;
import ru.task3.zoo.animal.Animal;
import ru.task3.zoo.animal.Bear;
import ru.task3.zoo.animal.Monkey;
import ru.task3.zoo.aviary.Aviary;
import ru.task3.zoo.aviary.HashSetAviaryImpl;
import ru.task3.zoo.exception.HugeSpeedException;
import ru.task3.zoo.exception.NegativeSpeedException;

import java.util.ArrayList;
import java.util.List;

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

    List<Aviary> aviaries = new ArrayList<>();
    Aviary aviary = new HashSetAviaryImpl();
    aviary.addAnimal(monkeyLikeAnimal); // exception be here
    aviary.addAnimal(monkeyLikeAnimal);

    aviaries.add(aviary);
    try {
      aviaries.get(7).addAnimal(monkeyLikeAnimal); // exception be here
    } catch (IndexOutOfBoundsException e) {
      System.out.println("There no availible aviary");
    }
  }
}
