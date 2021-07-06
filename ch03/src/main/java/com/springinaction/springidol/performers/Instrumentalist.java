package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;

public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

    public void setInstrument(Instrument instrument) { // Внедрение инструмента
        this.instrument = instrument;
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}
