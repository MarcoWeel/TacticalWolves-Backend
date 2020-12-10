package com.tacticalwolves.eventservice.controller;

import com.tacticalwolves.eventservice.entity.Event;
import com.tacticalwolves.eventservice.entity.EventImage;
import com.tacticalwolves.eventservice.service.EventImageService;
import com.tacticalwolves.eventservice.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventImageController {
        @Autowired
        private EventImageService service;

        @PostMapping("/image")
        public EventImage addImage(@RequestBody EventImage eventImage){return service.SaveEventImage(eventImage);}

        @GetMapping("/image/{Id}")
        public EventImage findImageById(@PathVariable int Id){return service.GetEventImageById(Id);}

        @GetMapping("/image")
        public List<EventImage> findAllImages(){return service.GetEventImages();}

        @PutMapping("/image")
        public EventImage updateImage(@RequestBody EventImage event){return service.UpdateEvent(event);}

        @DeleteMapping("/image/{Id}")
        public String deleteImage(@PathVariable int Id){return service.DeleteEventImageById(Id);}
}
