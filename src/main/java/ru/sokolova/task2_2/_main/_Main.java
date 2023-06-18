package ru.sokolova.task2_2._main;

import ru.sokolova.task2_2.action.Calculator;
import ru.sokolova.task2_2.action.ConsoleWriter;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        /*int x = 42;
        int y = 32;*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Pick operation plz: + - *");
        String operation = sc.next();

        switch (operation) {
            case "+":
                Calculator.sum(x, y);
                int sumResult = Calculator.sum(x, y);
                ConsoleWriter.writeResult("Sum result: ", " + ", sumResult, x, y);
                break;
            case "-":
                Calculator.subtract(x, y);
                int subResult = Calculator.subtract(x, y);
                ConsoleWriter.writeResult("Subtraction result: ", " - ", subResult, x, y);
                break;
            case "*":
                Calculator.multiply(x, y);
                int multResult = Calculator.multiply(x, y);
                ConsoleWriter.writeResult("Multiplication result: ", " * ", multResult, x, y);
                break;
        }
    }
}
