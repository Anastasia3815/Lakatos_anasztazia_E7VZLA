/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Masodik;

/**
 *
 * @author Anastasia
 */
public class Triangle extends GeometricShape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    public double getArea() {
        double S = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(S * (S - side1) * (S - side2) * (S - side3));
        return area;
    }
    
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle: " + "side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
    
    
}
