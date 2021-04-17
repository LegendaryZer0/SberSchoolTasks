package ru.task3.animal;


import ru.task3.actions.Huntable;
import ru.task3.actions.Voiceable;

public class Bear extends Animal implements Huntable, Voiceable {
    @Override
    public void hunt() {
        System.out.println("COME HERE BEES ");
    }

    @Override
    public void doVoice() {
        System.out.println("ROOAR");
    }
}
