package ru.sokolova.jungleSimulator._main;

import ru.sokolova.jungleSimulator.model.Parrot;
import ru.sokolova.jungleSimulator.util.EventSimulator;

public class _Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        EventSimulator eventSimulator = new EventSimulator();
        eventSimulator.startSimulation(parrot);
    }
}
