package ru.sokolova.arrays1._main;

import ru.sokolova.arrays1.model.service.EvenNumbersFinder;
import ru.sokolova.arrays1.model.service.OddNumbersFinder;
import ru.sokolova.arrays1.model.service.SumNumberFinder;
import ru.sokolova.arrays1.model.service.ZeroNumberFinder;

public class _Main {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 0, 4};
        OddNumbersFinder oddNumbersFinder = new OddNumbersFinder();
        oddNumbersFinder.findOddNumber(array);
        EvenNumbersFinder evenNumbersFinder = new EvenNumbersFinder();
        evenNumbersFinder.countEven(array);
//        PrimeNumberFinder primeNumberFinder=new PrimeNumberFinder();
//        primeNumberFinder.findPrimeNumber(array);
        SumNumberFinder sumNumberFinder = new SumNumberFinder();
        sumNumberFinder.findNumberSum(array);
        ZeroNumberFinder zeroNumberFinder = new ZeroNumberFinder();
        zeroNumberFinder.findZeroNumbers(array);
    }
}
