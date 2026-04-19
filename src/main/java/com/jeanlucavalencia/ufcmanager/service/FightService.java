package com.jeanlucavalencia.ufcmanager.service;

import java.util.List;
import java.util.Optional;

import com.jeanlucavalencia.ufcmanager.entity.Fight;
import com.jeanlucavalencia.ufcmanager.repository.FightRepository;
import org.springframework.stereotype.Service;

@Service
public class FightService {

    private final FightRepository fightRepository;

    public FightService(FightRepository fightRepository) {
        this.fightRepository = fightRepository;
    }

    public List<Fight> getAllFights() {
        return fightRepository.findAll();
    }

    public Optional<Fight> getFightById(Long id) {
        return fightRepository.findById(id);
    }

    public Fight createFight(Fight fight) {
        return fightRepository.save(fight);
    }

    public void deleteFight(Long id) {
        fightRepository.deleteById(id);
    }

    public Fight updateFight(Long id, Fight updatedFight) {
        Fight oldFight = fightRepository.findById(id).orElseThrow();

        oldFight.setFighter1(updatedFight.getFighter1());
        oldFight.setFighter2(updatedFight.getFighter2());
        oldFight.setEvent(updatedFight.getEvent());
        oldFight.setWeightClass(updatedFight.getWeightClass());
        oldFight.setRounds(updatedFight.getRounds());
        oldFight.setWinner(updatedFight.getWinner());
        oldFight.setResultMethod(updatedFight.getResultMethod());
        oldFight.setFightStatus(updatedFight.getFightStatus());

        return fightRepository.save(oldFight);
    }
}
