package com.example.javarepublic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/backkom")
    @ResponseBody
    public String index() {
        return "made by backkom 2024";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}