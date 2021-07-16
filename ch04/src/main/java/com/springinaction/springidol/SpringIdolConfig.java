package com.springinaction.springidol;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    /*В формате XML элемент <beans> играющим роль корневого элемента.
    Его эквивалентом на языке Java является класс , отмеченный аннотацией @Configuration.

    Здесь находятся методы, определяющие компоненты

    Аннотация @Configuration подсказывает фреймворку Spring,
    что данный класс содержит одно или более определений компонентов.

    Объявления компонентов – это обычные методы, отмеченные аннотацией @Bean.*/
}
