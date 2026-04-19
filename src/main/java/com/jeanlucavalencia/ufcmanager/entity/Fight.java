package com.jeanlucavalencia.ufcmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Fight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Fighter fighter1;

    @ManyToOne
    private Fighter fighter2;

    @ManyToOne
    private Event event;

    private String weightClass;
    private int rounds;

    @ManyToOne
    private Fighter winner;

    private String resultMethod;
    private String fightStatus;

    public Fight() {
    }

    public Fight(Fighter fighter1, Fighter fighter2, Event event, String weightClass, int rounds, Fighter winner, String resultMethod, String fightStatus) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.event = event;
        this.weightClass = weightClass;
        this.rounds = rounds;
        this.winner = winner;
        this.resultMethod = resultMethod;
        this.fightStatus = fightStatus;
    }

    public Long getId() {
        return id;
    }

    public Fighter getFighter1() {
        return fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public Event getEvent() {
        return event;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public int getRounds() {
        return rounds;
    }

    public Fighter getWinner() {
        return winner;
    }

    public String getResultMethod() {
        return resultMethod;
    }

    public String getFightStatus() {
        return fightStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFighter1(Fighter fighter1) {
        this.fighter1 = fighter1;
    }

    public void setFighter2(Fighter fighter2) {
        this.fighter2 = fighter2;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setWinner(Fighter winner) {
        this.winner = winner;
    }

    public void setResultMethod(String resultMethod) {
        this.resultMethod = resultMethod;
    }

    public void setFightStatus(String fightStatus) {
        this.fightStatus = fightStatus;
    }
}
