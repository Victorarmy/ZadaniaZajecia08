package com.example.exercisethree;

public class Ball extends Shape3D{
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Kula o promieniu " + radius + " ma pojemność: ";
    }
}
