package ua.lviv.lgs;

import java.util.Locale;
import java.util.Scanner;

public class Circle {

	private double diameter;
    private double radius;
 
    public Circle(double radius) {
        this.diameter = 2 * radius;
        this.radius = radius;
    }
 
    public double getArea() {
        return radius * radius * Math.PI;
    }
 
    public double getLength() {
        return diameter * Math.PI;
    }
 
    public double getDiameter() {
        return diameter;
    }
 
    public double getRadius() {
        return radius;
    }
 
    @Override
    public String toString() {
        return "Circle {diameter = " + diameter +
                ", radius = " + radius + '}';
    }


	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.useLocale(Locale.US);
    System.out.print("Input radius: ");
    double radius = scan.nextDouble();

    Circle circle = new Circle(radius);
    System.out.println(circle);
    System.out.println("Area: " + circle.getArea());
    System.out.println("Length: " + circle.getLength());

    }

}


