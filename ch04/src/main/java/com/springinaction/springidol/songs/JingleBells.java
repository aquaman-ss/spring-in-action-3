package com.springinaction.springidol.songs;

import java.util.Arrays;

public class JingleBells implements Song {

    private static String[] LINES = {
            "Jingle bells, jingle bells",
            "Jingle all the way",
            "Oh, what fun it is to ride",
            "In a one horse open sleigh",
            "Hey, jingle bells, jingle bells",
            "Jingle all the way",
            "Oh, what fun it is to ride",
            "In a one horse open sleigh",
            "Jingle bells, jingle bells",
            "Jingle all the way",
            "Oh, what fun it is to ride",
            "In a one horse open sleigh",
            "Hey, jingle bells, jingle bells",
            "Jingle all the way",
            "Oh, what fun it is to ride",
            "In a one horse open sleigh.\n"};

    public JingleBells() {}

    @Override
    public void announce() { System.out.println("Jingle Bells\n"); }

    @Override
    public void sing() { Arrays.stream(LINES).forEach(System.out::println); }
}
