package ru.sokolova.arrays2.model.service;

public class AscendingSort {


    public int[] sortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        return arr;
    }
}