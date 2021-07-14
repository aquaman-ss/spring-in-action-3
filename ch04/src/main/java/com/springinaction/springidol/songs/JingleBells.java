package com.springinaction.springidol.songs;

public class JingleBells implements Song {

    public JingleBells() {
    }

    @Override
    public void announce() {
        System.out.println("Jingle Bells\n");
    }

    @Override
    public void sing() {
        System.out.println("Jingle bells, jingle bells Jingle all the way\n");
    }
}
