package com.spring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpringCalculatorTest{

    public StringCalculator stringCalculator;

    @Before
    public void setUp() { // Call this method before any @Test annotated method is called.
        stringCalculator = new StringCalculator();
    }

    @Test
    public void inputIsEmptyString() {
        assertEquals(0,stringCalculator.add(""));
    }
}