package com.springinaction.springidol.instruments;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("stringed")//квалифицирует компонент guitar как струнный (stringed) инструмент
public class Guitar implements Instrument {

    public Guitar() {
    }

    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
