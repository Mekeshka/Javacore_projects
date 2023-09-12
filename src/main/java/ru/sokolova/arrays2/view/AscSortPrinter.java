package ru.sokolova.arrays2.view;

import ru.sokolova.arrays2.model.service.AscendingSort;

import java.util.Arrays;

public class AscSortPrinter {
    public void printSortedArray(int arr[]) {
        AscendingSort ascendingSort = new AscendingSort();
        System.out.println(Arrays.toString(ascendingSort.sortAsc(arr)));
    }
}
