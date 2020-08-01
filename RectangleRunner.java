package com.dmdev.oop.HW;

public class RectangleRunner {

    public static void main(String[] args) {

        Point point1 = new Point(2,15);
        Point point2 = new Point(8, 2);
        System.out.println(point2.distance(point1));

        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println(rectangle.diagonalLength());
        System.out.println(rectangle.areaRectangle());

    }
}
