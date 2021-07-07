package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformerMain {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-idol.xml");
        //
        Performer kenny = (Performer) context.getBean("kenny");
        kenny.perform();
        //
        Performer david = (Performer) context.getBean("david");
        david.perform();
        //
        Performer frank = (Performer) context.getBean("frank");
        frank.perform();
        //
        Performer taylor = (Performer) context.getBean("taylor");
        taylor.perform();
        //
        Performer stevie = (Performer) context.getBean("stevie");
        stevie.perform();
        //
        Performer magician = (Performer) context.getBean("harry");
        magician.perform();
    }
}
