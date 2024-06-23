package com.example2._HW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) int a, @RequestParam(value = "num2", required =
            false) int b) {

        return a + " + " + b + " = " + calculatorService.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) int a, @RequestParam(value = "num2", required =
            false) int b) {

        return a + " - " + b + " = " + calculatorService.minus(a, b);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) int a, @RequestParam(value = "num2", required =
            false) int b) {

        return a + " * " + b + " = " + calculatorService.multiply(a, b);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) int a, @RequestParam(value = "num2", required =
            false) int b) {
        return a + " / " + b + " = " + calculatorService.divide(a, b);
    }
}

