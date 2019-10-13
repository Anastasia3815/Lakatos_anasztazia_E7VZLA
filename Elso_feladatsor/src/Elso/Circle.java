package Elso;

/**
 *
 * @author Anastasia
 */
public class Circle extends GeometricShape{
     private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getPerimeter() {
        double perimeter = radius * Math.PI * 2;
        return perimeter;
    }
    
    public double getArea() {
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }
    
    public double getDiameter() {
        return 2 * radius;
    }
}
