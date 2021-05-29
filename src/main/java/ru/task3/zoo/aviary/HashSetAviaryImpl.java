package ru.task3.zoo.aviary;

import ru.task3.zoo.animal.Animal;
import ru.task3.zoo.exception.aviary.AviaryOverflowExeption;
import ru.task3.zoo.exception.aviary.IdenticalAnimalsInAviaryExeption;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class HashSetAviaryImpl implements Aviary {
  private static final int AVIARY_CAPACITY = 5;
  private HashSet<Animal> animals;

  public HashSetAviaryImpl() {
    animals = new HashSet<>();
  }

  @Override
  public void addAnimal(Animal animal) {
    if (size() == 5) {
      throw new AviaryOverflowExeption();
    } else if (!animals.add(animal)) {
      throw new IdenticalAnimalsInAviaryExeption();
    }
    ;
  }

  @Override
  public void deleteAnimal(Animal animal) {
    animals.remove(animal);
  }

  public Iterator<Animal> iterator() {
    return animals.iterator();
  }

  public int size() {
    return animals.size();
  }

  public boolean isEmpty() {
    return animals.isEmpty();
  }

  public boolean contains(Animal o) {
    return animals.contains(o);
  }

  public void forEach(Consumer<? super Animal> action) {
    animals.forEach(action);
  }
}
