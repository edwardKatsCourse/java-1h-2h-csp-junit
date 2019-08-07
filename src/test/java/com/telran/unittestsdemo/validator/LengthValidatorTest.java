package com.telran.unittestsdemo.validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LengthValidatorTest {

    private static LengthValidator DEFAULT_LENGTH_VALIDATOR;

    @Before
    public void setUp() {
        DEFAULT_LENGTH_VALIDATOR = new LengthValidator();
    }

    @Test
    public void testNullPositive() {
        boolean result = DEFAULT_LENGTH_VALIDATOR.isValid(null);
        Assert.assertTrue(result);
    }

    @Test
    public void testPositive() {
        String correctValue = "123456";

        boolean result = DEFAULT_LENGTH_VALIDATOR.isValid(correctValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testEmptyStringNegative() {
        String value = "";

        Assert.assertFalse(DEFAULT_LENGTH_VALIDATOR.isValid(value));
    }

    @Test
    public void testWhitespacePositive() {
        //5 spaces
        String value = "     ";
        Assert.assertTrue(DEFAULT_LENGTH_VALIDATOR.isValid(value));
    }

    @Test
    public void testExceedMaxLengthNegative() {
        String value = "12345678901";
        Assert.assertFalse(DEFAULT_LENGTH_VALIDATOR.isValid(value));
    }

    @Test
    public void testExactMaxLengthValuePositive() {
        String value = "1234567890";
        Assert.assertTrue(DEFAULT_LENGTH_VALIDATOR.isValid(value));
    }

    @Test
    public void testExceedMinLengthNegative() {
        String value = "12";
        Assert.assertFalse(DEFAULT_LENGTH_VALIDATOR.isValid(value));
    }

    @Test
    public void testExactMinLengthValuePositive() {
        String value = "123";
        Assert.assertTrue(DEFAULT_LENGTH_VALIDATOR.isValid(value));
    }
}
