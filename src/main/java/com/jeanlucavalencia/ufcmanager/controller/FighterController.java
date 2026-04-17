package com.jeanlucavalencia.ufcmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jeanlucavalencia.ufcmanager.service.FighterService;
@RestController
public class FighterController {
    private final FighterService fighterService;

    public FighterController(FighterService fighterService){
        this.fighterService = fighterService;
    }
}
