package ru.sokolova.arrays1.model.service;

public class EvenNumbersCounter {
    public int countEvenNumber(int arr[]) {
        int evenCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 & arr[i] != 0) {
                evenCounter++;
            }
        }
        return evenCounter;
    }
}
