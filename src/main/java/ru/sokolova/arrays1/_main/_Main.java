package ru.sokolova.arrays1._main;

import ru.sokolova.arrays1.model.service.EvenNumbersFinder;
import ru.sokolova.arrays1.model.service.OddNumbersFinder;
//import ru.sokolova.arrays1.model.service.PrimeNumberFinder;
import ru.sokolova.arrays1.model.service.SumNumberFinder;

public class _Main {

    public static void main(String[] args) {
        int[]array = new int[]{5,3,2,4};
        OddNumbersFinder oddNumbersFinder = new OddNumbersFinder();
        oddNumbersFinder.findOddNumber(array);
        EvenNumbersFinder evenNumbersFinder= new EvenNumbersFinder();
        evenNumbersFinder.countEven(array);
//        PrimeNumberFinder primeNumberFinder=new PrimeNumberFinder();
//        primeNumberFinder.findPrimeNumber(array);
        SumNumberFinder sumNumberFinder=new SumNumberFinder();
        sumNumberFinder.findNumberSum(array);
    }
}
