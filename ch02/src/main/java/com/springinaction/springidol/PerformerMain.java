package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
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
    }
}
