package com.alpha.work2;

import com.alpha.work1.Device;


import java.util.Scanner;

public class Runner {

    public void run() {

        WriteShapes(CreateShapes());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Выбраные фигуры");
        //CalcSumm(CreateShapes(),"Rectangle");

        CalcSummIstanseof(CreateShapes(),new Rectangle());
        System.out.println("---------------------------------------------------------------");
        CalcAllSumm(CreateShapes());
    }

    public Shape[] CreateShapes() {
        return new Shape[]{new Rectangle("Red", 2.0, 5.0),
                new Rectangle("White", 5.0, 6.0),
                new Rectangle("blue", 1.0, 2.0),
                new Rectangle("purple", 8.0, 5.0),
                new Circle("White", 5.0),
                new Circle("Red", 4.0),
                new Circle("blue", 3.0),
                new Triangle("White", 3.1, 5.5, 8.5),
                new Triangle("Red", 4, 5, 8)};
    }

    public void WriteShapes(Shape[] shape) {
        for (Shape shape1 : shape) {
            System.out.print(shape1 + " Площадь = ");
            System.out.printf("%.2f \n",shape1.calcArea());

        }
    }

    public void CalcAllSumm(Shape[] shapes){
        double SummAll = 0.0;
        for (Shape shape1: shapes) {
            System.out.print("Площадь "+shape1+ " = ");
            System.out.printf("%.2f \n",shape1.calcArea());
            SummAll+=shape1.calcArea();
        }
        System.out.println("--------------------------------------------------");
        System.out.print("Сумма всех площадей всех фигур = ");
        System.out.printf("%.2f \n",SummAll);
    }


    public void CalcSumm(Shape[] shape,String figure){

        //System.out.println(shape instanceof );
        for (Shape shape1:shape) {
            switch (figure){
                case "Rectangle":
                    if (shape1.getClass().getName()=="com.alpha.work2.Rectangle"){
                        System.out.print("Площадь прямоугольника = ");
                        System.out.printf("%.2f \n",shape1.calcArea());
                    }
                    break;

                case "Circle":
                    if (shape1.getClass().getName()=="com.alpha.work2.Circle") {
                        System.out.print("Площадь круга = ");
                        System.out.printf("%.2f \n", shape1.calcArea());
                    }
                    break;
                case "Triangle":
                    if (shape1.getClass().getName()=="com.alpha.work2.Triangle") {
                        System.out.print("Площадь треугольника = ");
                        System.out.printf("%.2f \n", shape1.calcArea());
                    }
                    break;
                default:
                    System.out.println("Не уазана фигура!");
                    break;

            }
        }
    }

    public void CalcSummIstanseof(Shape[] shape, Object o) {
        for (Shape s:
             shape) {
            if (o instanceof Rectangle){
                if (s.getClass().getName()=="com.alpha.work2.Rectangle")
                {
                    System.out.printf("%.2f Площадь прямоугольника \n", s.calcArea());
                }
            }else if(o instanceof Circle){
                if (s.getClass().getName()=="com.alpha.work2.Circle"){
                    System.out.printf("%.2f Площадь окружности \n", s.calcArea());
                }
            }
            else if (o instanceof Triangle){
                if (s.getClass().getName()=="com.alpha.work2.Triangle"){
                    System.out.printf("%.2f Площадь треугольника \n", s.calcArea());
                }
            } else {
                System.out.println("Неверный тип!!!");
            }
        }
    }
}


