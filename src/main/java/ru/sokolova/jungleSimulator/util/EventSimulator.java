package ru.sokolova.jungleSimulator.util;

import ru.sokolova.jungleSimulator.model.Parrot;

public class EventProducer {
    public void activateEvent(Parrot parrot) {
        Math.random();
        while (checkStatus(parrot)) {
            int eventChoose = (int) (Math.random() * 100);
            if (eventChoose >= 0 && eventChoose < 8) ;
            {
                eatNuts(parrot);
            } else if (eventChoose >= 8 && eventChoose < 14) {
                eatBerries(parrot);
            } else if (eventChoose >= 14 && eventChoose < 24) {
                eatBugs(parrot);
            } else if (eventChoose >= 24 && eventChoose < 28) {
                flyAwayFromCatcher(parrot);
            } else if (eventChoose >= 28 && eventChoose < 30) {
                buildNest(parrot);
            } else if (eventChoose >= 30 && eventChoose < 50) {
                fly(parrot);
            } else if (eventChoose >= 50 && eventChoose < 54) {
                fightOtherParrot(parrot);
            }else if (eventChoose >= 54 && eventChoose < 64) {
                sleepInNest(parrot);
            } else if (eventChoose >= 64 && eventChoose < 94) {
                restOnBranch(parrot);
            } else if (eventChoose >= 94 && eventChoose <= 100) {
                wetFromRain(parrot);
            }
        }
        System.out.println("Попугай погиб -_- очень жаль!);
    }

    private void eatNuts(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 3;
        health = health + (int) (parrot.getBeak() * 3);
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        checkEnergy(parrot);

    }

    private void eatBugs(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 2;
        health = health + (int) (parrot.getBeak() * 2);
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private void eatBerries(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 1;
        health = health + (int) (parrot.getBeak() * 2);
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private void flyAwayFromCatcher(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 5;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private void buildNest(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy - 2;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private void fly(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy - 1;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private void fightOtherParrot(Parrot parrot) {
        int energy = parrot.getEnergy();
        // int health = parrot.getHealth();
        energy = energy - 7;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private void sleepInNest(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy + 5;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private void restOnBranch(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy + 4;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private void wetFromRain(Parrot parrot) {
        int energy = parrot.getEnergy();
        //int health = parrot.getHealth();
        energy = energy - 1;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        //parrot.setHealth(health);
        checkEnergy(parrot);
    }

    private boolean checkStatus(Parrot parrot) {
        if (parrot.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }

    }

    private void checkEnergy(Parrot parrot) {
        if (parrot.getEnergy() <= 0) {
            int health = parrot.getHealth();
            health = health - 7;
            if (health < 0) {
                health = 0;
            }
            parrot.setHealth(health);
        }

    }

    private void setValueToHundred(Parrot parrot) {
        if (parrot.getEnergy() > 100) {
            int energy = parrot.getEnergy();
        }
        parrot.setEnergy() = 100;

        if (parrot.getHealth() > 100) {
            int health = parrot.getHealth();
        }
        parrot.setHealth() = 100;
    }
}

