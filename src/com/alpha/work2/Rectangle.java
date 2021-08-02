package com.alpha.work2;

public class Rectangle extends Shape {
    private double width;
    private double  height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
//    public Rectangle(){
//
//    }



    @Override
    public double calcArea() {
        return this.width*this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
