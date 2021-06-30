package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformerMain {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-idol.xml");
        Performer performer = (Performer) context.getBean("duke");
        performer.perform();
    }
}
