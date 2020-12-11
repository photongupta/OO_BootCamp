package com.step.shapes;

import com.step.exception.InvalidDimensionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RectangleTest {
    
    @Test
    public void shouldThrowExceptionWhenLengthIsNegative() {
        assertThrows(InvalidDimensionException.class, () -> Rectangle.create(-2, -3));
    }
    
    @Test
    public void shouldGetAreaOfGivenRectangle() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(6, rectangle.calculateArea(), 0);
    }
    
    @Test
    public void shouldGetAreaOfRectangleHavingDecimalDimension() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(2, 3.2);
        assertEquals(6.4, rectangle.calculateArea(), 0);
    }
    
    @Test
    public void shouldGetPerimeterOfGivenRectangle() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(10, rectangle.calculatePerimeter(), 0);
    }
}
