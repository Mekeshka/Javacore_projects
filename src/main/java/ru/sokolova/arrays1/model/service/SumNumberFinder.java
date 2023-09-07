package ru.sokolova.arrays1.model.service;

public class SumNumberFinder {
    public int findNumberSum(int arr[]) {
        int numberSum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            numberSum = arr[i] + arr[i + 1];
        }
        System.out.println(numberSum);
        return numberSum;
    }
}
