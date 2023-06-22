package ru.sokolova.task2_2.action;

public class ConsoleWriter {
    public static void writeResult(String operation, String sign, int result, int x, int y) {
        System.out.println(operation + x + sign + y + " = " + result);
    }
}
