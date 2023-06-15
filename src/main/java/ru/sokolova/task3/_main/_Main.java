package ru.sokolova.task3._main;

import ru.sokolova.task3.model.Car;

public class _Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color="Синий ";
        car1.brand="BMW";


        Car car2 = new Car("Красный ", "Ferrari" );


        Car car3 = new Car();
        car3.color="Темно-зеленый ";
        car3.brand="Suzuki";

        System.out.print(car1.color + car1.brand + " ");
        car1.drive();
        System.out.print(car2.color + car2.brand + " ");
        car2.drive();
        System.out.print(car3.color + car3.brand + " ");
        car3.brake();
    }
}
