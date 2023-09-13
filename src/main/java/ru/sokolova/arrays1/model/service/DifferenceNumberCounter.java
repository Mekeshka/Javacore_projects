package ru.sokolova.arrays1.model.service;

public class DifferenceNumberCounter {
    public int countDifferenceNumber(int arr[]) {
        int oddIndexSum = 0;
        int evenIndexSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                oddIndexSum = arr[i] + oddIndexSum;
            }
            if (i % 2 != 0) {
                evenIndexSum = arr[i] + evenIndexSum;
            }
        }
        int difference = oddIndexSum - evenIndexSum;
        return difference;
    }
}
