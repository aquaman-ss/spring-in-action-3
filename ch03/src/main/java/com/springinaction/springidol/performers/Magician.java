package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.inventory.MagicBox;

public class Magician implements Performer {

    private String magicWords;
    private MagicBox magicBox;

    public Magician() {
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox; // Внедрение волшебного ящика
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents()); // Исследует содержимое ящика
    }
}
