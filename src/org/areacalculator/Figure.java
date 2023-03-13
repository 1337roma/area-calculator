package org.areacalculator;

public abstract class Figure {
    public abstract double computePerimeter();

    public abstract double computeArea();

    public String showResult(){

        return "Perimeter of " + this.getClass().getName() + " = " + computePerimeter() + "\n"
                + "Area of " + this.getClass().getName() + " = " + computeArea();
    }
}
