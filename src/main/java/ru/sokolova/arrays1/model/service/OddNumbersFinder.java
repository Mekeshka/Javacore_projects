package ru.sokolova.arrays1.model.service;

import java.sql.SQLOutput;

public class OddNumbersFinder {
    public int findOddNumber(int[] arr) {
        int oddCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 & arr[i]!=0) {
                oddCounter++;

            }
        }
        System.out.println(oddCounter);
        return oddCounter;
    }
}