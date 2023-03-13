package org.areacalculator;

public class Rectangle extends Figure {
    private final double[] sides;

    public Rectangle(double[] sides) {
        if (sides.length != 2)
            throw new RuntimeException("Only two sides allowed");

        for (int i = 0; i < sides.length; i++) {
            if (sides[i] <= 0)
                throw new RuntimeException("Sides must be positive");
        }

        this.sides = sides;
    }

    public double[] getSides() {
        return sides;
    }
    @Override
    public double computePerimeter() {
        return 2 * (sides[0] + sides[1]);
    }

    @Override
    public double computeArea() {
        return sides[0] * sides[1];
    }
}

