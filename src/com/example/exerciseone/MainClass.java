package com.example.exerciseone;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(Direction.values()));
        System.out.println("Podaj kierunek geograficzny");
        System.out.println("1. Północ");
        System.out.println("2. Południe");
        System.out.println("3. Wschód");
        System.out.println("4. Zachód");

        Direction direction = Direction.convert(scanner.nextInt());

        if (direction != Direction.UNDEFINED) {
            System.out.println("Ok więc idziemy na " + direction.getDirectionInPolish());
        } else {
            System.out.println("Nie ma takiego kierunku");
        }
    }
}
