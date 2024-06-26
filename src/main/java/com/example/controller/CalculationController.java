package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/calculation")
public class CalculationController {

    @Autowired
    CalculationService calculationService;
    
    @GetMapping("/run")
    public void getAllThr() {
        
        Runnable[] threads = {
            calculationService.squareTask,
            calculationService.cubeTask,
            calculationService.evenTask,
            calculationService.primeTask,
            calculationService.armstrongTask,
            calculationService.palindromeTask,
            calculationService.factorialTask,
            calculationService.reverseTask
        };

        for (Runnable threadStart : threads) {
            Thread thread = new Thread(threadStart);
            thread.start();
        }
    }
}
