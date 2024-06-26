package com.example.service;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public static final Logger logger = LoggerFactory.getLogger(CalculationService.class);
    
    @Autowired
    CalculationTask calculationTask;

    Scanner sc = new Scanner(System.in);
    static{
        System.out.println("Enter a  number: ");
    }
    public int number=sc.nextInt();

    // Runnable for square
    public Runnable squareTask = () -> {
        int square = calculationTask.square(number);
        logger.info("Square of {} is: {}", number, square);
    };

    // Runnable for cube
    public Runnable cubeTask = () -> {
        int cube = calculationTask.cube(number);
        logger.info("Cube of {} is: {}", number, cube);
    };

    // Runnable for even
    public Runnable evenTask = () -> {
        boolean even = calculationTask.isEven(number);
        logger.info(" {} is even: {}", number, even);
    };
    
    // Runnable for prime check
    public Runnable primeTask = () -> {
        boolean isPrime = calculationTask.isPrimeOrNot(number);
        logger.info("{} is prime: {}",number, isPrime);
    };

    // Runnable for Armstrong number check
    public Runnable armstrongTask = () -> {
        boolean armstrong = calculationTask.isArmstrong(number);
        logger.info("{} is Armstrong: {}", number, armstrong);
    };

    // Runnable for palindrome
    public Runnable palindromeTask = () -> {
        boolean isPalindrome = calculationTask.isPalindrome(number);
        logger.info("{} is palindrome: {}", number, isPalindrome);
    };

    // Runnable for factorial calculation
    public Runnable factorialTask = () -> {
        int factorialNum = calculationTask.factorial(number);
        logger.info("Factorial of {} is: {}", number, factorialNum);
    };


    // Runnable for reverse calculation
    public Runnable reverseTask = () -> {
        int reversedNum = calculationTask.reverse(number);
        logger.info("Reverse of {}", number, " is: {}", reversedNum);
    };
}


