package ru.sokolova.segment_lenght._main;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input point A coordinates:");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            System.out.println("Input point B coordinates:");
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int length=(int) Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
            System.out.println("Your segment length is" + " " + length);
        }
    }

