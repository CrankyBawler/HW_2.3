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
    public String plus(@RequestParam ("num1") int a,@RequestParam ("num2") int b) {
        if (a != 0 && b != 0) {
            return  a + " + " + b + " = " + calculatorService.plus(a, b);
        } else {
            return "Ошибка! Введите оба числа";
        }
    }
    @GetMapping (path = "/minus")
    public String minus (@RequestParam ("num1") int a, @RequestParam("num2")int b) {
        if (a != 0 && b != 0) {
            return a + " - " + b + " = " + calculatorService.minus(a, b);
        } else {
            return "Ошибка! Введите оба числа";
        }
    }

}

