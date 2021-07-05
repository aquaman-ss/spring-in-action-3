package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.performers.Juggler;
import com.springinaction.springidol.performers.Performer;
import com.springinaction.springidol.performers.PoeticJuggler;
import com.springinaction.springidol.poems.Poem;
import com.springinaction.springidol.poems.Sonnet29;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformerMain {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-idol.xml");
        Performer duke = (Performer) context.getBean("duke");
        duke.perform();
        //
        Performer poeticDuke = (Performer) context.getBean("poeticDuke");
        poeticDuke.perform();
        //
        Performer dukeJuggler = new Juggler(5);
        Poem sonnet29 = new Sonnet29();
        Performer dukePoem = new PoeticJuggler(sonnet29);
        Performer dukePoeticJuggler = new PoeticJuggler(10, sonnet29);
        //
        Performer kenny2 = (Performer) context.getBean("kenny2");
        kenny2.perform();
        //
        Performer hank = (Performer) context.getBean("hank");
        hank.perform();
        //
        Performer hankProp = (Performer) context.getBean("hank-prop");
        hankProp.perform();
    }
}
