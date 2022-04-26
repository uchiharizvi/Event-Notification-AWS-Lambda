package com.hpamp.eventnotificationms.controller;

import com.hpamp.eventnotificationms.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public String createEvent(@RequestBody String eventRequest) throws Exception {
        return eventService.createEvent();
    }
}
