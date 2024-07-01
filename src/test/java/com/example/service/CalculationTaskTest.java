package com.example.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationTaskTest {
    
    private CalculationTask calculationTask;

    @BeforeEach
    public void setUp() {
        calculationTask = new CalculationTask();
    }

    @Test
    public void testSquare() {
        assertEquals(25, calculationTask.square(5));
        assertEquals(144, calculationTask.square(12));
        assertEquals(0, calculationTask.square(0));
    }

    @Test
    public void testCube(){
        assertEquals(125, calculationTask.cube(5));
        assertEquals(3375, calculationTask.cube(15));
        assertEquals(0, calculationTask.cube(0));
    }

    @Test
    public void testIsEven() {
        assertTrue(calculationTask.isEven(2));
        assertTrue(calculationTask.isEven(0));
        assertFalse(calculationTask.isEven(1));
        assertFalse(calculationTask.isEven(7));
    }

    @Test
    public void testIsPrimeOrNot() {
        assertFalse(calculationTask.isPrimeOrNot(1));
        assertTrue(calculationTask.isPrimeOrNot(2));
        assertTrue(calculationTask.isPrimeOrNot(7));
        assertFalse(calculationTask.isPrimeOrNot(9));
        assertTrue(calculationTask.isPrimeOrNot(11));
    }

    @Test
    public void testIsArmstrong() {
        assertTrue(calculationTask.isArmstrong(153));
        assertTrue(calculationTask.isArmstrong(370));
        assertFalse(calculationTask.isArmstrong(123));
        assertTrue(calculationTask.isArmstrong(9474));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(calculationTask.isPalindrome(121));
        assertTrue(calculationTask.isPalindrome(1331));
        assertFalse(calculationTask.isPalindrome(123));
        assertFalse(calculationTask.isPalindrome(1234));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculationTask.factorial(5));
        assertEquals(1, calculationTask.factorial(0));
        assertEquals(1, calculationTask.factorial(1));
        assertEquals(720, calculationTask.factorial(6));
    }

    @Test
    public void testReverse() {
        assertEquals(321, calculationTask.reverse(123));
        assertEquals(0, calculationTask.reverse(0));
        assertEquals(54321, calculationTask.reverse(12345));
    }

}

