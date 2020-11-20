package com.tacticalwolves.eventservice.controller;

import com.tacticalwolves.eventservice.entity.Event;
import com.tacticalwolves.eventservice.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventService service;

    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event){return service.SaveEvent(event);}

    @GetMapping("/events/{Id}")
    public Event findUserById(@PathVariable int Id){return service.GetEventById(Id);}

    @GetMapping("/events")
    public List<Event> findAllUsers(){return service.GetEvents();}

    @PutMapping("/events")
    public Event updateUser(@RequestBody Event event){return service.UpdateEvent(event);}

    @DeleteMapping("/events/{Id}")
    public String deleteUser(@PathVariable int Id){return service.DeleteEventById(Id);}
}
