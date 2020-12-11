package com.step.shapes;

import com.step.exception.InvalidDimensionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SquareTest {
    @Test
    public void shouldThrowExceptionWhenGivenSideIsNegative() {
        assertThrows(InvalidDimensionException.class,()->Square.create(-3));
    }
    
    @Test
    public void shouldGetAreaOfGivenSquare() throws InvalidDimensionException {
        Square square = Square.create(3);
        assertEquals(9, square.calculateArea(),0);
    }
    
    @Test
    public void shouldGetAreaOfGivenSquareWithDecimalSide() throws InvalidDimensionException {
        Square square = Square.create(1.2);
        assertEquals(1.44, square.calculateArea(), 0);
    }
    
    @Test
    public void shouldGetPerimeterOfGivenSquare() throws InvalidDimensionException {
        Square square = Square.create(3);
        assertEquals(12, square.calculatePerimeter(),0);
    }
    
    @Test
    public void shouldGetPerimeterOfGivenSquareWithDecimalSide() throws InvalidDimensionException {
        Square square = Square.create(1.5);
        assertEquals(6, square.calculatePerimeter(),0);
    }
}
