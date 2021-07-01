package com.springinaction.springidol;

public class Stage {

    public Stage() {
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage(); // Создание экземпляра
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance; // Возвращает экземпляр
    }
}
