package com.example2._HW;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int a, int b) {
        return a + b;
    }
}
