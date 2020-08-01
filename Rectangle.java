package com.dmdev.oop.HW;

public class Rectangle {

    private Point leftCorner;
    private Point rightCorner;

    public Rectangle (Point leftCorner, Point rightCorner ){
        this.leftCorner = leftCorner;
        this.rightCorner = rightCorner;
    }

   public double diagonalLength(){
        return leftCorner.distance(rightCorner);
    }

    public double areaRectangle(){
        return (leftCorner.getX() - rightCorner.getX()) * (leftCorner.getY() - rightCorner.getY());

    }
}
