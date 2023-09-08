package ru.sokolova.arrays2._main;

import ru.sokolova.arrays2.view.AscSortPrinter;

public class _Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, -3, 1, 1};
        AscSortPrinter ascSortPrinter = new AscSortPrinter();
        ascSortPrinter.printSortedArray(arr);
    }
}
