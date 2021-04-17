package ru.task3.animal;

import ru.task3.actions.Huntable;
import ru.task3.actions.Voiceable;

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
