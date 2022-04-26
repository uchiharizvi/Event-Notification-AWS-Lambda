package com.hpamp.eventnotificationms.controller;

import com.hpamp.eventnotificationms.entity.Event;
import com.hpamp.eventnotificationms.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event) throws Exception {
        return eventService.createEvent(event);
    }

    @GetMapping("/retrieve/{eventId}")
    public Event getEvent(@PathVariable String eventId) throws Exception {
        return eventService.retrieveEventDetails(eventId);
    }

    @PutMapping("/update/{eventId}")
    public String updateEvent(@PathVariable String eventId, @RequestBody Event event) throws Exception {
        return eventService.updateEvent(eventId, event);
    }
}
