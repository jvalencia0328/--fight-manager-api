package com.jeanlucavalencia.ufcmanager.service;
import java.util.List;
import java.util.Optional;
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

      public List<Fighter> getAllFighters(){
          return fighterRepository.findAll();
      }

      public Optional<Fighter> getFighterById(Long id){
          return fighterRepository.findById(id);
      }

      public Fighter createFighter(Fighter fighter){
          return fighterRepository.save(fighter);
      }

      public void deleteFighter(Long id){
          fighterRepository.deleteById(id);
      }

      //update fighter:
        public Fighter updateFighter(Long id, Fighter updatedFighter){
          //Find fighter by id:
            Optional<Fighter> optionalFighter = fighterRepository.findById(id);

          //unwrap:
            Fighter oldFighter = optionalFighter.orElseThrow();

           //Update fighter fields:
            oldFighter.setName(updatedFighter.getName());
            oldFighter.setNickname(updatedFighter.getNickname());
            oldFighter.setWeightClass(updatedFighter.getWeightClass());
            oldFighter.setWins(updatedFighter.getWins());
            oldFighter.setLosses(updatedFighter.getLosses());
            oldFighter.setDraws(updatedFighter.getDraws());

            //save oldFighter
            return fighterRepository.save(oldFighter);

        }




}
