package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;

public class Vocalist implements Performer {

    private String song;

    public Vocalist() {
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : \n");
    }
}
