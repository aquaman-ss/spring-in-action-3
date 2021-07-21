package com.springinaction.springidol.performers;

import com.springinaction.springidol.poems.Poem;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PoeticJuggler extends Juggler {

    @Autowired
    @Qualifier("sonnet29")
    private Poem poem;

    public PoeticJuggler() {}

    public PoeticJuggler(Poem poem) { this.poem = poem; }

    public PoeticJuggler(int beanBags, Poem poem) {
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
