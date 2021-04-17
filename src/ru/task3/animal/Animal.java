package ru.task3.animal;

import java.util.Objects;

public abstract class Animal {
    private String name;

    public void move(){
        System.out.println("Move with default speed");
    }
    public void move(String speed){
        System.out.println("Move with speed :" + speed);
    }
    public void grow(){
        System.out.println("I am Growing");
    }
    public void run(){
        System.out.println("I AM RUNNING");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
