package com.springinaction.springidol;

import com.springinaction.springidol.performers.Juggler;
import com.springinaction.springidol.performers.Performer;
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
}
