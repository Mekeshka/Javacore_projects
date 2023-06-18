package ru.sokolova.jungleSimulator.util;

import ru.sokolova.jungleSimulator.model.Parrot;

public class EventProducer {
    public void activateEvent() {

    }

    private void eatNuts(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 3;
        health = health + (int) (parrot.getBeak()*3);
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        energyChecker(parrot);

    }

    private void eatBugs(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 2;
        health = health + (int) (parrot.getBeak()*2);
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        energyChecker(parrot);
    }
    private void eatBerries(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 1;
        health = health + (int) (parrot.getBeak()*2);
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void flyAwayFromCatcher(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 5;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void buildNest(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy - 2;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void fly(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy - 1;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void fightOtherParrot(Parrot parrot) {
        int energy = parrot.getEnergy();
       // int health = parrot.getHealth();
        energy = energy - 7;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void sleepInNest(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy + 5;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void restOnBranch(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy + 4;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void wetFromRain(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy - 1;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        energyChecker(parrot);
    }

    private boolean statusChecker(Parrot parrot) {
        if(parrot.getHealth()<=0)
        return false;

    }else {
        return true;
    }
    private void energyChecker(Parrot parrot) {
        if (parrot.getEnergy() <=0){
            int health=parrot.getHealth();
            health=health-7;
            if (health <0){
                health=0;
            }
            parrot.setHealth(health);
        }

    }
    private void setValueToHundred(Parrot parrot) {
        if(parrot.getEnergy() >100){
            int energy = parrot.getEnergy();
            } parrot.setEnergy()=100;

        if (parrot.getHealth()>100){
            int health = parrot.getHealth();
            } parrot.setHealth()=100;
        }
    }

