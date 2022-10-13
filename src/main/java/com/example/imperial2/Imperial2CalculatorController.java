package com.example.imperial2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Imperial2CalculatorController {
    Imperial2Calculator a = new Imperial2Calculator();

    @RequestMapping("/gram")
    public double gram(double ounce){
        return a.gram(ounce);
    }
}
