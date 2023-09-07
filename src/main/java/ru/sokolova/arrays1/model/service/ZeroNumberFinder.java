package ru.sokolova.arrays1.model.service;

public class ZeroNumberFinder {
    public int findZeroNumbers(int arr[]) {
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        System.out.println(zeroCount);
        return zeroCount;
    }
}
