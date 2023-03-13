package org.areacalculator;

public class Square extends Figure {
    private final double side;

    public Square(double side) {
        if (side <= 0)
            throw new RuntimeException("Side must be positive");

        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double computePerimeter() {
        return side * 4;
    }

    @Override
    public double computeArea() {
        return side * side;
    }
}
