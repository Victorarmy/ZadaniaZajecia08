package com.example.exercisethree;

public class LineCalc {

    public double lineLength(Line2D line2D) {
        return Math.sqrt(Math.pow((line2D.getX2() - line2D.getX1()), 2) + Math.pow((line2D.getY2() - line2D.getY1()), 2));
    }
}
