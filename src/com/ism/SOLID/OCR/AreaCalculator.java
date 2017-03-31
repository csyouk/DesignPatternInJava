package com.ism.SOLID.OCR;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by YOUK on 2017-03-26.
 */
public class AreaCalculator {

    public double getTotalArea(List<Shape> list){
        double sum = 0;
        for(Shape shape : list){
            sum += shape.getArea();
        }
        return sum;
    }

    public static void main(String[] args){
        AreaCalculator area = new AreaCalculator();


        Shape rec = new Rectangle(2, 3);
        Triangle tri = new Triangle(2, 3);
        Circle cir = new Circle(3);
        System.out.println(String.format("사각형의 넓이는 %f", rec.getArea()));
        System.out.println(String.format("삼각형의 넓이는 %f", tri.getArea()));
        System.out.println(String.format("원의 넓이는 %f", cir.getArea()));

        List<Shape> list = new LinkedList<Shape>();
        list.add(rec);
        list.add(tri);
        list.add(cir);
        System.out.println(String.format("총합은 %f", area.getTotalArea(list)));

    }
}
