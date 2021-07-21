package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;
import com.springinaction.springidol.songs.Song;

import javax.inject.Inject;
import javax.inject.Named;

public class InstrumentalistInject implements Performer {

    @Inject
    @Named("jingleBells")
    private Song song;
    @Inject
    @Named("guitar")
    private Instrument instrument;

    public InstrumentalistInject() {}

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing : ");
        song.announce();
        song.sing();
        instrument.play();
    }
}
