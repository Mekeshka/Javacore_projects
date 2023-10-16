package ru.sokolova.state.model.util;

public class RandomIntGenerator {
    public static int generateRandInRange(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
