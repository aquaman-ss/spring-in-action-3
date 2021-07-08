package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;

public abstract class InstrumentalistAbstract implements Performer {

    private String song;

    public InstrumentalistAbstract() {
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

    public abstract Instrument getInstrument(); // Внедряемый метод

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        getInstrument().play();
    }
}
