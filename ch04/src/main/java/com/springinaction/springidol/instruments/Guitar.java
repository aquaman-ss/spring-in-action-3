package com.springinaction.springidol.instruments;

public class Guitar implements Instrument {

    public Guitar() {
    }

    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
/*Когда фреймворк будет просматривать пакет com.springinaction.springidol,
он обнаружит, что класс Guitar отмечен аннотацией @Component,
и автоматически зарегистрирует его как компонент.

По умолчанию идентификатор компонента генерируется из имени класса,
где первый символ имени замещается этим же символом в нижнем регистре.

В случае с классом Guitar компонент получит идентификатор guitar.*/
