package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.inventory.Knife;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.HashSet;
import java.util.Set;

public class KnifeJuggler extends Juggler {

    @Inject
    private Set<Knife> knives;
    @Inject
    private Provider<Knife> knifeProvider;

    public KnifeJuggler() {
    }

    @Inject
    public KnifeJuggler(Provider<Knife> knifeProvider) {
        this.knifeProvider = knifeProvider;
        knives = new HashSet<Knife>();
        for (int i = 0; i < 5; i++) {
            knives.add(knifeProvider.get());
        }
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While spinning...");
        knives.forEach(Knife::show);
    }
}
/*Имеется класс KnifeJuggler, в экземпляр которого должен быть внедрен
один или более экземпляров класса Knife (нож).

Предположим, что компонент типа Knife объявлен как имеющий область действия prototype,
тогда следующий конструктор KnifeJuggler сможет получить пять компонентов типа Knife.

Вместо экземпляров класса Knife на этапе конструирования
экземпляр KnifeJuggler получит экземпляр Provider<Knife>.
На этом этапе будет внедрен только экземпляр объекта-посредника Provider.

Внедрение фактических объектов типа Knife будет отложено
до вызова метода get() объекта-посредника.

В данном случае метод get() вызывается пять раз.
А поскольку компонент типа Knife имеет область действия prototype,
во множестве knives будет сохранено пять различных объектов типа Knife.*/
