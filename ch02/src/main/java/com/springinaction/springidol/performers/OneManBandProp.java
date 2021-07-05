package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;

import java.util.*;

public class OneManBandProp implements Performer {

    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде отображения (Properties)
    }

    public void perform() throws PerformanceException {
        //01
        instruments.forEach((name, value) -> System.out.print("\n" + name + " : " + value + "\n"));
        //02
        for (String name : instruments.stringPropertyNames()) {
            String value = instruments.getProperty(name);
            System.out.print("\n" + name + " : " + value + "\n");
        }
    }
}
