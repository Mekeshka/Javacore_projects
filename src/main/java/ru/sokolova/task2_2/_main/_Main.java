package ru.sokolova.task2_2._Main;

import ru.sokolova.task2_2.action.Calculator;

public class _Main {
    public static void main(String[] args) {
        int x = 42;
        int y = 32;
        int sumResult = Calculator.sum (x, y);
        System.out.println("Sum result: " + x + " + " + y + " = " + sumResult);

        int subResult = Calculator.subtract(x, y);
        System.out.println("Subtraction result: " + x + " - " + y + " = " + subResult);

        int multResult = Calculator.multiply(x, y);
        System.out.println("Multiplication result: " + x + " * " + y + " = " + multResult);
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Pick operation plz: + - *");
        String operation = sc.next();

        switch(operation) {
            case "+":
                Calculator.sum()
                break;
            case "-":
                Calculator.subtract()
                break;
            case "*":
                Calculator.multiply()
                break;*/
    }
}

