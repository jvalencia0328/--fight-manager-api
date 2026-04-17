package com.jeanlucavalencia.ufcmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import com.jeanlucavalencia.ufcmanager.service.FighterService;
import com.jeanlucavalencia.ufcmanager.entity.Fighter;
@RestController
public class FighterController {
    private final FighterService fighterService;

    public FighterController(FighterService fighterService){
        this.fighterService = fighterService;
    }

    @GetMapping("/fighters")
    public List<Fighter> getAllFighters(){
        return fighterService.getAllFighters();
    }

    @GetMapping("/fighters/{id}")
    public Optional<Fighter> getFighterById(@PathVariable Long id){
        return fighterService.getFighterById(id);
    }

    @PostMapping("/fighters")
    public Fighter createFighter(@RequestBody Fighter fighter){
        return fighterService.createFighter(fighter);
    }

    @DeleteMapping("fighters/{id}")
    public void deleteFighter(@PathVariable Long id){
        fighterService.deleteFighter(id);
    }

    @PutMapping("/fighters/{id}")
    public Fighter update(@PathVariable Long id, @RequestBody Fighter updatedFighter){
        return fighterService.updateFighter(id, updatedFighter);
    }





}
