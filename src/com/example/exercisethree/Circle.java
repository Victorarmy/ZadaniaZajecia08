package com.example.exercisethree;

public class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Koło o promieniu " + radius + " ma pole: ";
    }
}
