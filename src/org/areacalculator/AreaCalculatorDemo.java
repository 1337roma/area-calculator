package org.areacalculator;

import java.util.Scanner;

public class AreaCalculatorDemo {
    public static void main(String[] args) {
        System.out.println("""
                Square
                Triangle
                Circle
                Rectangle""");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();

        switch (shape) {
            case ("Square") -> {
                Scanner sideSqr = new Scanner(System.in);
                double side = Double.parseDouble(sideSqr.next());
                Square square = new Square(side);
                System.out.println(square.showResult());
            }
            case ("Triangle") -> {
                double[] sides = new double[3];
                double[] corners = new double[3];
                for (int i = 0; i < sides.length; i++) {
                    Scanner side1 = new Scanner(System.in);
                    sides[i] = Double.parseDouble(side1.next());
                }
                for (int i = 0; i < corners.length; i++) {
                    Scanner corner = new Scanner(System.in);
                    corners[i] = Double.parseDouble(corner.next());
                }
                Triangle triangle = new Triangle(corners, sides);
                System.out.println(triangle.showResult());
            }
            case ("Circle") -> {
                Scanner radiusCrl = new Scanner(System.in);
                double radius = Double.parseDouble(radiusCrl.next());
                Circle circle = new Circle(radius);
                System.out.println(circle.showResult());
            }
            case ("Rectangle") -> {
                double[] sides1 = new double[2];
                for (int i = 0; i < sides1.length; i++) {
                    Scanner corner = new Scanner(System.in);
                    sides1[i] = Double.parseDouble(corner.next());
                }
                Rectangle rectangle = new Rectangle(sides1);
                System.out.println(rectangle.showResult());
            }
            default -> System.out.println("Enter something else");
        }
    }
}
