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

    public KnifeJuggler() {}

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
