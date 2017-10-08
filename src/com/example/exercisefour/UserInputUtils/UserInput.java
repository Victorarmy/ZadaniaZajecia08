package com.example.exercisefour.UserInputUtils;

import java.util.Scanner;

public class UserInput {

    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public String newLine() {
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }
}
