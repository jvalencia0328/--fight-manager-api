package com.jeanlucavalencia.ufcmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.time.LocalDate;
import java.time.LocalTime;


@Entity
public class Event {
    //fields:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    //getters and setters
    //getters and setters
    private String name;
    private String venue;
    private String city;
    private String country;
    private LocalDate eventDate;
    private LocalTime eventTime;

    //constructors
    public Event() {

    }

    public Event(String name, String venue, String city, String country, LocalDate eventDate,
                 LocalTime eventTime) {
        this.name = name;
        this.venue = venue;
        this.city = city;
        this.country = country;
        this.eventDate = eventDate;
        this.eventTime = eventTime;

    }

    //getters and setters:
    public String getName() {
        return this.name;
    }

    public String getVenue() {
        return this.venue;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public LocalDate getEventDate() {
        return this.eventDate;
    }

    public LocalTime getEventTime() {
        return this.eventTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }
}
