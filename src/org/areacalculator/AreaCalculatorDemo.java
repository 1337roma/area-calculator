package org.areacalculator;

import java.util.Scanner;

public class AreaCalculatorDemo {
    public static void main(String[] args) {
        System.out.println("1 - Square" + "\n"
                + "2 - Triangle" + "\n"
                + "3 - Circle" + "\n"
                + "4 - Rectangle");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        if (a == 1) {
            Scanner sideSqr = new Scanner(System.in);
            double side = Double.parseDouble(sideSqr.next());

            Square square = new Square(side);
            System.out.println(square.showResult());
        }
        if (a == 2) {
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
        if (a == 3) {
            Scanner radiusCrl = new Scanner(System.in);
            double radius = Double.parseDouble(radiusCrl.next());
            Circle circle = new Circle(radius);
            System.out.println(circle.showResult());
        }
        if (a == 4) {
            double[] sides1 = new double[2];
            for (int i = 0; i < sides1.length; i++) {
                Scanner corner = new Scanner(System.in);
                sides1[i] = Double.parseDouble(corner.next());
            }
            Rectangle rectangle = new Rectangle(sides1);
            System.out.println(rectangle.showResult());
        }
        else
            System.out.println("Enter something else");
    }
}
