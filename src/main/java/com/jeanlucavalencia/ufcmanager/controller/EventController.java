package com.jeanlucavalencia.ufcmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import com.jeanlucavalencia.ufcmanager.service.EventService;
import com.jeanlucavalencia.ufcmanager.entity.Event;

public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    //get All:
    @GetMapping("/events")
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    //get by id
    @GetMapping("/events/{id}")
    public Optional<Event> getEventById(@PathVariable Long id){
        return eventService.getEventById(id);
    }

    //create an event
    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event){
        return eventService.createEvent(event);
    }

    //delete event
    @DeleteMapping("/events/{id}")
    public void deleteEvent(@PathVariable Long id){
        eventService.deleteEvent(id);
    }
    //update event
    @PutMapping("/event/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event updatedEvent){
        return eventService.updateEvent(id, updatedEvent);
    }
}
