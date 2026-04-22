package com.jeanlucavalencia.ufcmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String welcome() {
        return "WELCOME TO UFC MANAGER";
    }
}