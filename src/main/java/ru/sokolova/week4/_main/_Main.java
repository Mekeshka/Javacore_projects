package ru.sokolova.week4._main;

import ru.sokolova.week4.model.Fish;
import ru.sokolova.week4.model.Ship;
import ru.sokolova.week4.service.FloatExecutor;

public class _Main {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        Ship ship1 = new Ship();
        FloatExecutor floatExecutor = new FloatExecutor();

        floatExecutor.makeFloat(fish1);
        floatExecutor.makeFloat(ship1);
    }

}

