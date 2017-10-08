package com.example.exercisetwo;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class Test {
    public static final int MAX_CARS = 3;

    public static void main(String[] args) {
        Car[] cars = new Car[MAX_CARS];
        Scanner scanner = new Scanner(System.in);

        int carInCars = 0;
        while (carInCars < 3) {

            System.out.println("Podaj model: ");
            String model = scanner.nextLine();
            System.out.println("Podaj rok");
            int year = scanner.nextInt(); scanner.nextLine();

            Car car = new Car(model, year);

            if (!checkCars(cars, car, carInCars)) {
                cars[carInCars] = car;
                carInCars++;
            } else {
                System.out.println("Takie auto już znajduje się w bazie danych");
            }
        }
    }

    private static boolean checkCars(Car[] cars, Car car, int carInCars) {
        for (int i = 0; i < carInCars; i++) {
            if (cars[i].equals(car)) {
                return true;
            }
        }
        return false;
    }
}
