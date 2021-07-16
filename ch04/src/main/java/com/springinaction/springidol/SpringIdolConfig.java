package com.springinaction.springidol;

import com.springinaction.springidol.performers.Instrumentalist;
import com.springinaction.springidol.performers.Juggler;
import com.springinaction.springidol.performers.Performer;
import com.springinaction.springidol.performers.PoeticJuggler;
import com.springinaction.springidol.poems.Poem;
import com.springinaction.springidol.poems.Sonnet29;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    /*В формате XML элемент <beans> играющим роль корневого элемента.
    Его эквивалентом на языке Java является класс , отмеченный аннотацией @Configuration.

    Здесь находятся методы, определяющие компоненты

    Аннотация @Configuration подсказывает фреймворку Spring,
    что данный класс содержит одно или более определений компонентов.

    Объявления компонентов – это обычные методы, отмеченные аннотацией @Bean.*/

    @Bean
    public Performer duke() {
        return new Juggler();
        /*Эквивалент элемента <bean>

        Аннотация @Bean сообщает фреймворку Spring, что данный метод вернет объект,
        который должен быть зарегистрирован в контексте приложения Spring как компонент.

        Компонент получит идентификатор, совпадающий с именем метода.

        Метод duke создает и возвращает экземпляр класса Juggler.
        Этот объект будет зарегистрирован фреймворком Spring в контексте приложения с идентификатором duke.*/
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
        //Внедрение значений в компонент
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
        //Внедрение через метод записи
    }

    @Bean
    Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
        //Внедрение ссылки на другой компонент
    }
}
