package ru.sokolova.jungle_simulator.util;

import ru.sokolova.jungle_simulator.model.Parrot;

public class EventSimulator {
    public void startSimulation(Parrot parrot) {
        while (checkStatus(parrot)) {
            int eventChoose = (int) (Math.random() * 100);
            if (eventChoose >= 0 && eventChoose < 8) {
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
            } else if (eventChoose >= 54 && eventChoose < 64) {
                sleepInNest(parrot);
            } else if (eventChoose >= 64 && eventChoose < 94) {
                restOnBranch(parrot);
            } else if (eventChoose >= 94 && eventChoose <= 100) {
                wetFromRain(parrot);
            }
        }
        System.out.println("Попугай погиб -_- очень жаль!");
    }

    private void eatNuts(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 15;
        health = health + (int) (parrot.getBeak() * 2);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай нашел орехи, расколол и съел их. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void eatBugs(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        setValueToHundred(parrot);
        energy = energy - 20;
        health = health + (int) (parrot.getBeak() * 2);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай поймал жука и съел его. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void eatBerries(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 15;
        health = health + (int) (parrot.getBeak() * 2);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай нашел ягоды и съел их. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void flyAwayFromCatcher(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 40;
        setValueToHundred(parrot);
        setValueToZero(parrot);
        parrot.setEnergy(energy);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай убежал от ловца. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void buildNest(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy - 45;
        setValueToZero(parrot);
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай постоил гнездо. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void fly(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy - 16;
        setValueToHundred(parrot);
        setValueToZero(parrot);
        parrot.setEnergy(energy);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай летает в поисках еды. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void fightOtherParrot(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy - 45;
        setValueToHundred(parrot);
        setValueToZero(parrot);
        parrot.setEnergy(energy);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай подрался с сородичем. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void sleepInNest(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy + 7;
        setValueToHundred(parrot);
        setValueToZero(parrot);
        parrot.setEnergy(energy);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай спит в гнезде. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void restOnBranch(Parrot parrot) {
        int energy = parrot.getEnergy();
        setValueToHundred(parrot);
        energy = energy + 3;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай отдохнул на ветке. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
        checkEnergy(parrot);
    }

    private void wetFromRain(Parrot parrot) {
        int energy = parrot.getEnergy();
        setValueToHundred(parrot);
        energy = energy - 13;
        setValueToHundred(parrot);
        parrot.setEnergy(energy);
        setValueToHundred(parrot);
        setValueToZero(parrot);
        System.out.println("Попугай промок под дождем. Текущая энергия: " + parrot.getEnergy() + " Текущее здоровье: " + parrot.getHealth());
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
            int energy = 100;
            parrot.setEnergy(energy);
        }
        if (parrot.getHealth() > 100) {
            int health = 100;
            parrot.setHealth(health);
        }
    }

    private void setValueToZero(Parrot parrot) {
        if (parrot.getEnergy() < 0) {
            int energy = 0;
            parrot.setEnergy(energy);
        }
        if (parrot.getHealth() < 0) {
            int health = 0;
            parrot.setHealth(health);
        }
    }
}

