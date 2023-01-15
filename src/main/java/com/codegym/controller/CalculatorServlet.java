package com.codegym.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorServlet {

    @GetMapping("")
    public String getCalculatorView(ModelMap modelMap){
        return "index";
    }

    @GetMapping ("/calculator")
    public String getSubtractReturn(ModelMap model, @RequestParam(name = "number_B", required = false, defaultValue = "0") int A, @RequestParam(name = "number_B", required = false, defaultValue = "numB/0") int B, @RequestParam(name="operation", required = true) String operation) {

        int result = 0;

        switch (operation) {
            case "add":
                result = A + B;
                break;
            case "subtract":
                result = A - B;
                break;
            case "multiply":
                result = A * B;
                break;
            case "divide":
                result = A / B;
                break;
        }
        model.addAttribute("num_A", A);
        model.addAttribute("num_B", B);
        model.addAttribute("result", result);
        return "index";
    }

}
