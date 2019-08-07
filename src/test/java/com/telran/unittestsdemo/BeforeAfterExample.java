package com.telran.unittestsdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAfterExample {

    @Before
    public void before() {
        System.out.println("before");
    }

    @Test
    public void test_1() {
        System.out.println("test 1");
    }

    @Test
    public void test_2() {
        System.out.println("test 2");
    }


    @After
    public void after() {
        System.out.println("after");
    }
}
