package ru.sokolova.arrays1.model.service;

public class SumNumberCounter {
    public int countNumberSum(int arr[]) {
        int sum1 = 0;
        int sum2=0;
        int numberSum=0;
        for (int i = 0; i < arr.length-1; i++) {
            numberSum = arr[i] + arr[i + 1]+numberSum;
        }
        System.out.println(numberSum);
        return numberSum;
    }
}
