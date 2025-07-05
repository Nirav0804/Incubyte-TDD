package com.spring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
        assertEquals(100,stringCalculator.add("99,1"));
    }

    @Test
    public void inputStringContainsUnknownAmountOfNumbers(){
        assertEquals(34,stringCalculator.add("1,2,4,8,7,5,3,4"));
        assertEquals(3,stringCalculator.add("1,2"));
        assertEquals(100,stringCalculator.add("100"));
        assertEquals(0,stringCalculator.add(""));
    }

    @Test
    public void inputStringContainsNewLineCharacterAsDelimiter(){
        assertEquals(6,stringCalculator.add("1\n2,3"));
        assertEquals(10,stringCalculator.add("1\n2\n3\n4"));
        assertEquals(3,stringCalculator.add("1\n2"));
    }

    @Test
    public void inputStringContainsUserDefinedDelimiter(){
        assertEquals(3,stringCalculator.add ("//;\n1;2"));
        assertEquals(8,stringCalculator.add ("//;\n2;2\n2,2"));
    }

    @Test
    public void inputStringContainingNegativeNumberShouldThrowAnException(){
        assertThrows(IllegalArgumentException.class,()->stringCalculator.add("-1"));
    }

    @Test
    public void inputStringContainingMultipleNegativeNumbersShouldThrowAnException(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, ()->stringCalculator.add("//;\n-1;-3\n-4;1"));
        assertEquals(illegalArgumentException.getMessage(),"negative numbers are not allowed [-1, -3, -4]");
    }
    @Test
    public void testToCountNumberOfTimesAddMethodCalled(){
        stringCalculator.add("1,2");
        stringCalculator.add("//;\n1;2,3\n4");
        assertEquals(2,stringCalculator.getAddCount());
    }
}