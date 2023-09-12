package ru.sokolova.arrays1.view;

import ru.sokolova.arrays1.model.service.EvenNumbersCounter;
import ru.sokolova.arrays1.model.service.OddNumbersCounter;
import ru.sokolova.arrays1.model.service.ZeroNumbersCounter;

public class ResultPrinter {
    public void printResult(int arr[]){
        OddNumbersCounter oddNumbersCounter = new OddNumbersCounter();
        EvenNumbersCounter evenNumbersCounter = new EvenNumbersCounter();
        /*PrimeNumberCounter primeNumberCounter=new PrimeNumberCounter();
        SumNumberCounter sumNumberCounter=new SumNumberCounter();
        DifferenceNumberCounter differenceNumberCounter = new DifferenceNumberCounter
         */
        ZeroNumbersCounter zeroNumbersCounter = new ZeroNumbersCounter();
        System.out.println(oddNumbersCounter.countOddNumber(arr));
        System.out.println(evenNumbersCounter.countEvenNumber(arr));
        System.out.println(zeroNumbersCounter.countZeroNumbers(arr));
    }
}
