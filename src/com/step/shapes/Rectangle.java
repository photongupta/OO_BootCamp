package com.step.shapes;

import com.step.exception.InvalidDimensionException;

public class Rectangle {
    private final double length;
    private final double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public static Rectangle create(double length, double breadth) throws InvalidDimensionException {
        if (length <= 0 || breadth <= 0) {
            throw new InvalidDimensionException();
        }
        return new Rectangle(length, breadth);
    }
    
    public double calculateArea() {
        return this.length * this.breadth;
    }
    
    public double calculatePerimeter() {
        return 2 * (this.length + this.breadth);
    }
}
