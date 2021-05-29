package ru.task3.zoo.animal;

import ru.task3.zoo.exception.HugeSpeedException;
import ru.task3.zoo.exception.NegativeSpeedException;

import java.util.Objects;

public abstract class Animal {
  private String name;
  private int speed;

  public Animal() {
    this.speed = 10;
  }

  public void move() {
    System.out.println("Move with default speed = " + speed);
  }

  public void move(int speed) throws NegativeSpeedException, HugeSpeedException {

    if (speed < 0) {
      throw new NegativeSpeedException("Speed cant be negative");
    } else if (speed > 10000) {
      throw new HugeSpeedException("Speed cant be too huge");
    }
    System.out.println("Move with speed :" + speed);
  }

  public void grow() {
    System.out.println("I am Growing");
  }

  public void run() {
    System.out.println("I AM RUNNING");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Animal{" + "name='" + name + '\'' + ", speed='" + speed + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Animal)) return false;
    Animal animal = (Animal) o;
    return Objects.equals(getName(), animal.getName()) && Objects.equals(speed, animal.speed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), speed);
  }
}
