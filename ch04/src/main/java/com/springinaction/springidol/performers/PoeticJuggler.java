package com.springinaction.springidol.performers;

import com.springinaction.springidol.poems.Poem;
import com.springinaction.springidol.exceptions.PerformanceException;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) { // Внедрение поэмы
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) { // Внедрение количества мячиков и поэмы
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
