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

    /*Допустим, что имеются два компонента, реализующих интерфейс Instrument.
    В этом случае аннотация @Autowired не сможет определить,
    какой из них действительно требуется внедрить.

    Поэтому, вместо того чтобы пытаться угадать, фреймворк возбудит
    исключение NoSuchBeanDefinitionException.

    Чтобы помочь аннотации @Autowired выбрать требуемый компонент,
    можно добавить аннотацию @Qualifier.

    В этом примере, аннотация @Qualifier определяет,
    что для связывания должен использоваться компонент
    с идентификатором guitar.

    @Autowired
    @Qualifier("guitar")
    private Instrument instrument;*/
}
