package com.example.javacicdapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("title", "Welcome to the app");
        model.addAttribute("message", "This Spring Boot app is ready for CI/CD with Jenkins, ArgoCD, Helm, and Kubernetes.");
        return "welcome";
    }

    @GetMapping("/health")
    public String health(Model model) {
        model.addAttribute("title", "Health Check");
        model.addAttribute("message", "Application is running!");
        return "welcome";
    }
} 