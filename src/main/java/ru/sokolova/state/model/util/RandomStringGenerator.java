package ru.sokolova.state.model.util;

import static ru.sokolova.state.model.util.RandomIntGenerator.generateRandInRange;

public class RandomStringGenerator {
    public static String generateRandString() {
        final int minChar = 97; // Минимальное число для диапазона букв
        final int maxChar = 122; // Максимальное число для диапазона букв
        final int minLength = 5; // Минимальное число для длинны строки
        final int maxLength = 10; // Максимальное число для длинны строки
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < (generateRandInRange(minLength, maxLength)); i++) {
            int randomInt = generateRandInRange(minChar, maxChar);
            char charFromInt = (char) randomInt;
            randomString.append(charFromInt);
        }
        return String.valueOf(randomString);
    }
}
