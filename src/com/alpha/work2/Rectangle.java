package com.alpha.work2;

public class Rectangle extends Shape {
    private double widthи;
    private double  height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.widthи = widthи;
        this.height = height;
    }
//    public Rectangle(){
//
//    }



    @Override
    public double calcArea() {
        return this.widthи*this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "widthи=" + widthи +
                ", height=" + height +
                '}';
    }
}
