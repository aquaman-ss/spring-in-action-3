package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformerMain {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-idol.xml");
        //
        Performer duke = (Performer) context.getBean("duke");
        duke.perform();
        //
        Performer duke15 = (Performer) context.getBean("duke15");
        duke15.perform();
        //
        Performer poeticDuke = (Performer) context.getBean("poeticDuke");
        poeticDuke.perform();
        //
        Performer cuterDuke = (Performer) context.getBean("cuterDuke");
        cuterDuke.perform();
        //
        Performer kenny = (Performer) context.getBean("kenny");
        kenny.perform();
        //
        Performer eddie = (Performer) context.getBean("eddie");
        eddie.perform();
        //
    }
}
