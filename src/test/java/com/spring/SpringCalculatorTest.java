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

    @Test
    public void inputStringContainsOneNumberAndItShouldReturnNumberItself(){
        assertEquals(1,stringCalculator.add("1"));
        assertEquals(100,stringCalculator.add("100"));
    }

    @Test
    public void inputStringContainsTwoNumbersAndItShouldReturnSumOfTwoNumbers(){
        assertEquals(3,stringCalculator.add("1,2"));
    }
}