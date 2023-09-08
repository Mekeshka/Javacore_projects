package ru.sokolova.arrays1.model.service;

public class ZeroNumbersCounter {
    public int countZeroNumbers(int arr[]) {
        int zeroCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCounter++;
            }
        }
        return zeroCounter;
    }
}
