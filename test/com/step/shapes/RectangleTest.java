package com.step.shapes;

import com.sun.tools.corba.se.idl.InvalidArgument;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    
    @Test
    public void shouldThrowExceptionWhenLengthIsNegative() {
        assertThrows(InvalidArgument.class, () -> Rectangle.create(-2, -3));
    }
    
    @Test
    public void shouldGetAreaOfGivenRectangle() throws InvalidArgument {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(6, rectangle.calculateArea(), 0);
    }
    
    @Test
    public void shouldGetAreaOfRectangleHavingDecimalDimension()throws InvalidArgument  {
        Rectangle rectangle = Rectangle.create(2, 3.2);
        assertEquals(6.4, rectangle.calculateArea(), 0);
    }
    
    @Test
    public void shouldGetPerimeterOfGivenRectangle() throws InvalidArgument {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(10, rectangle.calculatePerimeter(), 0);
    }
}
