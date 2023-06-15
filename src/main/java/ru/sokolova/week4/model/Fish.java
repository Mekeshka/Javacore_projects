package ru.sokolova.week4.model;

import ru.sokolova.week4.service.Floating;

public class Fish implements Floating {

    @Override
    public void floater() {
        hide();
        System.out.println("Рыба плавает в толще воды");

    }

    private void hide() {
        System.out.println("Рыба прячется от хищников");
    }
}
