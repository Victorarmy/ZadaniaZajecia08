package com.example.exercisethree;

public class Cube extends Shape3D  {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Sześcian o długości krawędzi wynoszącej " + side + " ma pojemność :";
    }
}
