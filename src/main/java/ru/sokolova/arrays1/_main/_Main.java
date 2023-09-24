package ru.sokolova.arrays1._main;

import ru.sokolova.arrays1.model.service.ArrayService;
import ru.sokolova.arrays1.view.ResultPrinter;

public class _Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 4, 6, 10, 0, -2, 3};
        ArrayService arrayService = new ArrayService();
        ResultPrinter resultPrinter = new ResultPrinter();
        arrayService.countOddNumber(array);
        resultPrinter.printResult(result);
        arrayService.countEvenNumber(array);
//        arrayService.countPrimeNumber(array);
        arrayService.countNumberSum(array);
        arrayService.countDifferenceNumber(array);
        arrayService.countZeroNumbers(array);
    }
}
