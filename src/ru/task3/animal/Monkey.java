package ru.task3.animal;

import ru.task3.actions.Huntable;
import ru.task3.actions.Voiceable;

public class Monkey extends Animal implements Huntable, Voiceable {
    @Override
    public void hunt() {
        System.out.println("BANANAS BANANAS BANANAS");
    }

    @Override
    public void doVoice() {
        System.out.println("<<Monkey Voices>>");
    }
}
