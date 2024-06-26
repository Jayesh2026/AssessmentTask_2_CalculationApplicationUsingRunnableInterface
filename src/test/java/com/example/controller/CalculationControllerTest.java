package com.example.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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

    @Test
    public void testPostMethodName() throws Exception {
        // Given
        int number = 5;

        // When
        ResponseEntity<Void> response = calculationController.postMethodName(number);

        // Then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        verify(calculationService);

        // Verify that each task is started
        verify(calculationService).squareTask.run();
        verify(calculationService).cubeTask.run();
        verify(calculationService).evenTask.run();
        verify(calculationService).primeTask.run();
        verify(calculationService).armstrongTask.run();
        verify(calculationService).palindromeTask.run();
        verify(calculationService).factorialTask.run();
        verify(calculationService).reverseTask.run();
    }
    
}
