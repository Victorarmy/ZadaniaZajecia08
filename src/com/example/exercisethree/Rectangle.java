package com.example.exercisethree;

public class Rectangle extends GeometricShape{
    private double sideOne;
    private double sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    @Override
    public String toString() {
        return "Prostokąt o długościach boków " + sideOne + " " + sideTwo + " ma pole: ";
    }
}
