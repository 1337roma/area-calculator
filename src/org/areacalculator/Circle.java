package org.areacalculator;

public class Circle extends Figure{
    private final double pi = Math.PI;

    private final double radius;
    public Circle(double radius){
        if (radius <= 0)
            throw new RuntimeException("radius must be positive");

        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double computePerimeter() {
        return 2 * pi * radius;
    }
    @Override
    public double computeArea() {
        return pi * (radius * radius);
    }
}
