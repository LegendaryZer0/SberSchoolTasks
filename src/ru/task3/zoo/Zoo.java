package ru.task3.zoo;

import ru.task3.actions.Huntable;
import ru.task3.animal.Animal;
import ru.task3.animal.Bear;
import ru.task3.animal.Monkey;

public class Zoo {
    public static void main(String[] args) {
        Animal monkeyLikeAnimal = new Monkey();
        monkeyLikeAnimal.move();
        Huntable huntableBear = new Bear();
        huntableBear.hunt();
    }

}
