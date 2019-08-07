package com.telran.unittestsdemo;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sumPositive() {
        int expectedResult = 4;

        int sum = Calculator.sum(2, 2);
        Assert.assertEquals(expectedResult, sum);
    }

    @Test
    public void sumComplexPositive() {
        int expectedResult = 6;

        int result = Calculator.sum(2, 2 * 2); //2 + 2 * 2

        Assert.assertEquals(expectedResult, result);
    }
}
