package ru.sokolova.jungle_simulator._main;

import ru.sokolova.jungle_simulator.model.Parrot;
import ru.sokolova.jungle_simulator.util.EventSimulator;

public class _Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        EventSimulator eventSimulator = new EventSimulator();
        eventSimulator.startSimulation(parrot);
    }
}
