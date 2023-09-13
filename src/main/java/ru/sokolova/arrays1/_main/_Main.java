package ru.sokolova.arrays1._main;

import ru.sokolova.arrays1.view.ResultPrinter;

public class _Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.printResult(array);
    }
}
