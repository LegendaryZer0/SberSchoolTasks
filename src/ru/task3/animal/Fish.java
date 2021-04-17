package ru.task3.animal;

import ru.task3.actions.Huntable;
import ru.task3.actions.Voiceable;

public class Fish extends Animal implements Huntable, Voiceable {
    @Override
    public void hunt() {
        System.out.println("I HUNT ON WORMES");
    }

    @Override
    public void doVoice() {
        System.out.println("BULK-BULK");
    }
}
