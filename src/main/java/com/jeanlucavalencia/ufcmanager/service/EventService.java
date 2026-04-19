package com.jeanlucavalencia.ufcmanager.service;
import java.util.List;
import java.util.Optional;

import com.jeanlucavalencia.ufcmanager.entity.Event;
import com.jeanlucavalencia.ufcmanager.repository.EventRepository;
import  org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    //get AllEvent
    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }
    //get event by id
    public Optional<Event> getEventById(Long id){
        return eventRepository.findById(id);
    }

    //create event
    public Event createEvent(Event event){
        return eventRepository.save(event);
    }

    //delete event
    public void deleteEvent(Long id){
        eventRepository.deleteById(id);
    }

    //update event
    public Event updateEvent(Long id, Event updateEvent){
        Optional<Event> optionalEvent = eventRepository.findById(id);

        Event oldEvent = optionalEvent.orElseThrow();

        //Update fields
        oldEvent.setName(updateEvent.getName());
        oldEvent.setVenue(updateEvent.getVenue());
        oldEvent.setCity(updateEvent.getCity());
        oldEvent.setCountry(updateEvent.getCountry());
        oldEvent.setEventDate(updateEvent.getEventDate());
        oldEvent.setEventTime(updateEvent.getEventTime());


        return eventRepository.save(oldEvent);
    }


}
