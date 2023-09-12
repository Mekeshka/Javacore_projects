package ru.sokolova.arrays1.model.service;

public class SumNumberCounter {
    public int countNumberSum(int arr[]) {
        int numberSum=0;
        for (int i = 0; i < arr.length; i++) {
            numberSum=numberSum+arr[i];
        }
        return numberSum;
    }
}
