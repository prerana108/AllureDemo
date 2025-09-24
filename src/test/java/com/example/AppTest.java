package com.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class AppTest {

    @Test
    @Description("Simple test to check addition")
    public void testAddition() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        assertEquals(sum, 15, "Sum should be 15");
    }
     @Test
    @Description("Simple test to check subtraction")
    public void testsub() {
        int a = 20;
        int b = 5;
        int diff = a - b;
        assertEquals(diff, 15, "sub should be 15");
}
    @Test
    @Description("Simple test to check Multiplication")
    public void testmulti() {
        int a = 5;
        int b = 10;
        int multiplied = a * b;
        assertEquals(multiplied, 50, "Sum should be 50");
    }
     @Test
    @Description("Simple test to check divide")
    public void testdivide() {
        int a = 10;
        int b = 2;
        int divide = a / b;
        assertEquals(divide, 5, "Sum should be 5");
    }
}
