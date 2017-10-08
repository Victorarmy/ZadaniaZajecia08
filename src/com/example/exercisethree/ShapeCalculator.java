package com.example.exercisethree;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape instanceof Circle) {
            return Math.PI * Math.pow((((Circle) shape)).getRadius(), 2);
        } else {
            return ((Rectangle) shape).getSideOne() * ((Rectangle) shape).getSideTwo();
        }
    }

    @Override
    public double volume(Shape3D shape3D) {
        if (shape3D instanceof Ball) {
            return (4 * Math.PI * Math.pow(((Ball) shape3D).getRadius(), 3)) / 3;
        } else {
            return Math.pow(((Cube) shape3D).getSide(), 3);
        }
    }
}
