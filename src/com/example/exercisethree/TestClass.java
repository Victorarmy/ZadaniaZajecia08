package com.example.exercisethree;

public class TestClass {
    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Line2D line2D = new Line2D(1, 3, 0, 4);
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 10);
        Ball ball = new Ball(10);
        Cube cube = new Cube(10);

        Shape[] shapes = {line2D, circle, rectangle, ball, cube};

        for (Shape shape : shapes) {
            if (shape instanceof Line2D) {
                System.out.print(shape);
                double length = shapeCalculator.lineLength((Line2D) shape);
                System.out.println(length);
            } else if (shape instanceof GeometricShape){
                System.out.print(shape);
                double area = shapeCalculator.shapeArea((GeometricShape) shape);
                System.out.println(area);
            } else {
                System.out.print(shape);
                double volume = shapeCalculator.volume((Shape3D) shape);
                System.out.println(volume);
            }
        }
    }
}
