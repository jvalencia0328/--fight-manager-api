package com.jeanlucavalencia.ufcmanager.service;

import com.jeanlucavalencia.ufcmanager.entity.Fighter;
import com.jeanlucavalencia.ufcmanager.repository.FighterRepository;
import  org.springframework.stereotype.Service;

@Service
public class FighterService {
    private final FighterRepository fighterRepository;

    //constructor
      public FighterService(FighterRepository fighterRepository){
          this.fighterRepository = fighterRepository;
      }
}
