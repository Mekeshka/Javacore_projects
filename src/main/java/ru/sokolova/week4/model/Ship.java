package ru.sokolova.week4.model;

import ru.sokolova.week4.service.Floating;

public class Ship implements Floating {
    @Override
    public void floater() {
        carry();
        System.out.println("Корабль плывет по поверхности воды");
    }

    private void carry() {
        System.out.println("Корабль перевозит грузы");
    }
}
