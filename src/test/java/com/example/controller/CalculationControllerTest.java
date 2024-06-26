package com.example.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.service.CalculationService;

@ExtendWith(MockitoExtension.class)
public class CalculationControllerTest {

    @InjectMocks
    CalculationController calculationController;

    @Mock
    private CalculationService calculationService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    
}
