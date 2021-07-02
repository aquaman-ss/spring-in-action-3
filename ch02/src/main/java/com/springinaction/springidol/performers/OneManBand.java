package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;

import java.util.Map;

public class OneManBand implements Performer {

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде отображения (Map)
    }

    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
