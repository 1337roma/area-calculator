package org.areacalculator;

public class Triangle extends Figure {
    private final double[] corners;
    private final double[] sides;

    public Triangle(double[] corners, double[] sides) {
        if (corners.length != 3 || sides.length != 3)
            throw new RuntimeException("There should be 3 sides and 3 corners");

        double sum = corners[0] + corners[1] + corners[2];

        for (double corner : corners)
            if (corner <= 0)
                throw new RuntimeException("corners must be positive");


        if (sum != 180)
            throw new RuntimeException("Sum of corners must be 180 degree");

        for (double side : sides)
            if (side <= 0)
                throw new RuntimeException("Sides must be positive");

        this.corners = corners;
        this.sides = sides;
    }

    public double[] getCorners() {
        return corners;
    }

    public double[] getSides() {
        return sides;
    }

    @Override
    public double computePerimeter() {
        return sides[0] + sides[1] + sides[2];
    }

    @Override
    public double computeArea() {
        double semiPerimeter = computePerimeter() / 2;
        double a = semiPerimeter
                * (semiPerimeter - sides[0])
                * (semiPerimeter - sides[1])
                * (semiPerimeter - sides[2]);
        return Math.sqrt(a);
    }
}
