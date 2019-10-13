package Masodik;

/**
 *
 * @author Anastasia
 */
public class Teszt {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println("Triangle area: " + triangle.getArea() + ", perimeter: " + triangle.getPerimeter() + "\ncolor: " + triangle.getColor() + " and filled: " + triangle.isFilled());
    }
}
