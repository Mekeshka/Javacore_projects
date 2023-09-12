package ru.sokolova.arrays1._main;

import ru.sokolova.arrays1.model.service.SumNumberCounter;
import ru.sokolova.arrays1.model.service.ZeroNumbersCounter;
import ru.sokolova.arrays1.view.ResultPrinter;

public class _Main {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 5};
//        OddNumbersFinder oddNumbersFinder = new OddNumbersFinder();
//        oddNumbersFinder.findOddNumber(array);
//        EvenNumbersFinder evenNumbersFinder = new EvenNumbersFinder();
//        evenNumbersFinder.countEven(array);
//        PrimeNumberFinder primeNumberFinder=new PrimeNumberFinder();
//        primeNumberFinder.findPrimeNumber(array);
        SumNumberCounter sumNumberCounter = new SumNumberCounter();
        sumNumberCounter.countNumberSum(array);
//        ZeroNumbersCounter zeroNumbersCounter = new ZeroNumbersCounter();
//        zeroNumbersCounter.countZeroNumbers(array);
//        ResultPrinter resultPrinter = new ResultPrinter();
//        resultPrinter.printResult(array);
    }
}
