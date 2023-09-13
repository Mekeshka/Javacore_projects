package ru.sokolova.arrays1.model.service;

public class PrimeNumberCounter {
    public int countPrimeNumber(int arr[]) {
        int primeNumberCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2) {
                return primeNumberCounter;
            } else {
                for (int k = 2; k <= Math.sqrt(arr[i]); k++) {
                    if (arr[i] % k == 0) {
                        return primeNumberCounter;
                    }
                    primeNumberCounter++;
                }
            }
            System.out.println(primeNumberCounter);
        }
        return primeNumberCounter;
    }
}








