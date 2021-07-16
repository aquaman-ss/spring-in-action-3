package com.springinaction.springidol;

import com.springinaction.springidol.inventory.Balisong;
import com.springinaction.springidol.performers.*;
import com.springinaction.springidol.poems.Sonnet29;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler();
    }

    @Bean
    public Performer poeticDukePoem() {
        return new PoeticJuggler(new Sonnet29());
    }

    @Bean
    public Performer poeticDukeBagsPoem() {
        return new PoeticJuggler(5, new Sonnet29());
    }

    @Bean
    public Performer KnifeJuggler() {
        return new KnifeJuggler();
    }

    @Bean
    public Performer cuterDuke() {
        return new KnifeJuggler(Balisong::new);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }

    @Bean
    public Performer eddie() {
        return new InstrumentalistInject();
    }
}
