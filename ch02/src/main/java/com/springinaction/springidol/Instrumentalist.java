package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;

public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

    public void setInstrument(Instrument instrument) { // Внедрение инструмента
        this.instrument = instrument;
    }
}
