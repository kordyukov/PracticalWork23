package com.alpha.work2;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.1415;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return this.PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
