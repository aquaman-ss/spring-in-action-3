package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;
import com.springinaction.springidol.songs.Song;

import javax.inject.Inject;
import javax.inject.Named;

public class InstrumentalistInject implements Performer {

    @Inject
    @Named("jingle-bells")
    private Song song;
    @Inject
    @Named("guitar")
    private Instrument instrument;

    public InstrumentalistInject() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing : ");
        song.announce();
        song.sing();
        instrument.play();
    }
}
/*Аннотация @Inject тоже может сопровождаться уточняющей аннотацией
@Named, подобной аннотации @Qualifier.

Аннотация @Qualifier помогает сузить круг компонентов, доступных для выбора
(используя идентификатор компонента как один из возможных квалификаторов),
тогда как аннотация @Named однозначно ссылается на идентификаторы компонентов.*/
