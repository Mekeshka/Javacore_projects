package ru.sokolova.print_number._main;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int x = sc.nextInt();
        int num = 0;
        while (num < x) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num = num + 3;
        }
        Scanner zero2y = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int y = zero2y.nextInt();
        int num2 = 0;
        while (num2 < y) {
            System.out.println(++num2);
        }
        Scanner z2zero = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int z = z2zero.nextInt();
        int num3 = 0;
        while (z > num3) {
            System.out.println(--z);
        }
        Scanner a2zero = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int a = a2zero.nextInt();
        int num4 = 0;
        while (a > num4) {
            a = a - 2;
            System.out.println(a);
        }
    }
}
