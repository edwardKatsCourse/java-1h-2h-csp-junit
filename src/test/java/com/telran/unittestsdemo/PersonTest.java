package com.telran.unittestsdemo;

import com.telran.unittestsdemo.Person;
import org.junit.Test;

public class PersonTest {

    @Test
    public void test1() {
        Person person = new Person();
        person.method();
    }
}
