package com.jeanlucavalencia.ufcmanager.controller;

import java.util.List;
import java.util.Optional;

import com.jeanlucavalencia.ufcmanager.entity.Fight;
import com.jeanlucavalencia.ufcmanager.service.FightService;
import org.springframework.web.bind.annotation.*;

@RestController
public class FightController {

    private final FightService fightService;

    public FightController(FightService fightService) {
        this.fightService = fightService;
    }

    @GetMapping("/fights")
    public List<Fight> getAllFights() {
        return fightService.getAllFights();
    }

    @GetMapping("/fights/{id}")
    public Optional<Fight> getFightById(@PathVariable Long id) {
        return fightService.getFightById(id);
    }

    @PostMapping("/fights")
    public Fight createFight(@RequestBody Fight fight) {
        return fightService.createFight(fight);
    }

    @DeleteMapping("/fights/{id}")
    public void deleteFight(@PathVariable Long id) {
        fightService.deleteFight(id);
    }

    @PutMapping("/fights/{id}")
    public Fight updateFight(@PathVariable Long id, @RequestBody Fight updatedFight) {
        return fightService.updateFight(id, updatedFight);
    }
}
