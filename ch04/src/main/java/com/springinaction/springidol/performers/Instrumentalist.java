package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;
import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {

    private String song;
    //@Autowired//Аннотировать можно свойства (поля) и вообще избавиться от методов записи
    @Autowired(required = false)//необязательное автоматическое связывание
    /*Если свойство, отмеченное аннотацией @Autowired,
    не может быть связано с какимлибо компонентом,
    операция автоматического связывания терпит неудачу
    (NoSuchBeanDefinitionException).*/
    private Instrument instrument;

    public Instrumentalist() {
    }

    /*@Autowired
    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }*/

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

    //Аннотировать можно свойства (поля) и вообще избавиться от методов записи
    /*@Autowired
    public void setInstrument(Instrument instrument) { // Внедрение инструмента
        this.instrument = instrument;
    }*/

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}
