package com.alpha.work2;

public class Triangle extends Shape {
  private double a;
  private double b;
  private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calcArea() {
        double p = (this.a+this.b+this.c)/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
