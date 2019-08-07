package com.telran.unittestsdemo.validator;

public class LengthValidator {

    private int min = 3;
    private int max = 10;

    public boolean isValid(String value) {
        if (value == null) {
            return true;
        }

        if (value.length() >= min && value.length() <= max) {
            return true;
        }

        return false;
    }
}
