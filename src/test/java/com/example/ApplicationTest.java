package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    
    @Test
    public void testGreet() {
        String result = Application.greet("Jenkins");
        assertEquals("Hello, Jenkins!", result);
    }

    @Test
    public void testGreetMultipleNames() {
        assertEquals("Hello, World!", Application.greet("World"));
        assertEquals("Hello, Pipeline!", Application.greet("Pipeline"));
    }

    @Test
    public void testAdd() {
        assertEquals(5, Application.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-1, Application.add(-5, 4));
    }

    @Test
    public void testAddZero() {
        assertEquals(10, Application.add(10, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Application.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, Application.multiply(3, 5));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, Application.multiply(5, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreetWithNullName() {
        Application.greet(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreetWithEmptyName() {
        Application.greet("");
    }
}
