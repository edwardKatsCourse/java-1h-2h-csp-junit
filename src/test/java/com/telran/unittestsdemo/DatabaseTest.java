package com.telran.unittestsdemo;

import org.junit.*;

public class DatabaseTest {

    @BeforeClass
    public static void initialize() {
        System.out.println("connect to database");
    }

    @Before
    public void setUp() {
        System.out.println("create database");
    }


    @Test
    public void test_1() {
        System.out.println("database test 1");
    }

    @Test
    public void test_2() {
        System.out.println("database test 2");
    }

    @After
    public void cleanUp() {
        System.out.println("drop database\n");
    }

    @AfterClass
    public static void tearDown() { //"снести"
        System.out.println("close database connection");
    }
}
