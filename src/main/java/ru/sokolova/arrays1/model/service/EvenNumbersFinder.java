package ru.sokolova.arrays1.model.service;

public class EvenNumbersFinder {
    public int countEven(int arr[]){
        int evenCounter=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2 !=0){
                evenCounter++;
            }
        }
        System.out.println(evenCounter);
        return evenCounter;
    }
}
