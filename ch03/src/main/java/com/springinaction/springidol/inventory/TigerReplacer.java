package com.springinaction.springidol.inventory;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class TigerReplacer implements MethodReplacer {
    /*Класс TigerReplacer реализует интерфейс MethodReplacer, требующий реализации единственного метода reimplement().
    Этот метод принимает три аргумента:
    объект, в котором будет производиться замещение метода,
    метод, подлежащий замещению,
    и массив аргументов, принимаемых методом.
    В нашем случае аргументы отсутствуют, но их можно передать при необходимости.
    Тело метода reimplement() фактически становится новой реализацией метода getContents() черного ящика.*/
    @Override
    public Object reimplement(Object target, Method method, Object[] args) throws Throwable {
        return "A ferocious tiger"; // Подмена метода. Помещает тигра в ящик
    }
}
