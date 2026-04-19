package com.jeanlucavalencia.ufcmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fighter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;
    private String nickname;
    private int wins;
    private int losses;
    private int draws;
    private String weightClass;

    public Fighter() {

    }

    public Fighter(String name, String nickname, int wins, int losses, int draws, String weightClass) {
        this.name = name;
        this.nickname = nickname;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.weightClass = weightClass;
    }

    //Getters:
    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getWins() {

        return wins;
    }

    public int getLosses() {
        return losses;

    }

    public int getDraws() {
        return draws;

    }

    public String getWeightClass() {
        return weightClass;

    }

    //Setters:

    public void setName(String name) {
        this.name = name;

    }

    public void setNickname(String nickname) {
        this.nickname = nickname;

    }

    public void setWins(int wins) {
        this.wins = wins;

    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setDraws(int draws) {
        this.draws = draws;

    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;

    }

}