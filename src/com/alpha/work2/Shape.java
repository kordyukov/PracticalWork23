package com.alpha.work2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    // public Shape() {

  //  }

    public double calcArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "class= Shape " +
                "color='" + color + '\'' +
                '}';
    }


}
