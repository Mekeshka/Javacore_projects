package ru.sokolova.jungleSimulator.model;

public class Parrot {
    private int health = 100;
    private int energy = 100;

    private final double energyProductionCoefficient = 1.5;


    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public double getBeak() {
        return this.energyProductionCoefficient;
    }
}


