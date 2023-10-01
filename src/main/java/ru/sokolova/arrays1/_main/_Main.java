package ru.sokolova.arrays1._main;

import ru.sokolova.arrays1.model.service.ArrayService;
import ru.sokolova.arrays1.view.ResultPrinter;

public class _Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        ArrayService arrayService = new ArrayService();
        ResultPrinter resultPrinter = new ResultPrinter();
        int result = arrayService.countOddNumber(array);
        resultPrinter.printResult(result);
        result = arrayService.countEvenNumber(array);
        resultPrinter.printResult(result);
        result = arrayService.countPrimeNumber(array);
        resultPrinter.printResult(result);
        result = arrayService.countNumberSum(array);
        resultPrinter.printResult(result);
        result = arrayService.countDifferenceNumber(array);
        resultPrinter.printResult(result);
        result = arrayService.countZeroNumbers(array);
        resultPrinter.printResult(result);
    }
}
