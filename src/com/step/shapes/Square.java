package com.step.shapes;

import com.step.exception.InvalidDimensionException;

public class Square extends Rectangle {
    private Square(double side) {
        super(side, side);
    }
    
    public static Square create(double side) throws InvalidDimensionException {
        if (side <= 0) {
            throw new InvalidDimensionException();
        }
        return new Square(side);
    }
}
