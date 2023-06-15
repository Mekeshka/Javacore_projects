package ru.sokolova.task3.model;

public class Car {
    public String color;
    public String brand;

    public Car() {
    }

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void brake() {
        System.out.println("тормозит");
    }

    public void drive() {
        System.out.println("едет");
    }
}
