package com.example.demo.controller;

import com.example.repository.InimeseRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Uuskontroller {
    
    @GetMapping("/inimesed")
    public String getInimesed(Model model) {
        model.addAttribute("inimesed", InimeseRepository.buildInimesed());

        return "inimesed";
    }
}
