package com.hpamp.eventnotificationms.service;

import com.hpamp.eventnotificationms.entity.Event;
import com.hpamp.eventnotificationms.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    EventRepository eventRepository;
    @Override
    public Event createEvent(Event event) throws Exception {
        return eventRepository.save(event);
    }

    @Override
    public String updateEvent(String eventId, Event event) throws Exception {
        return eventRepository.update(eventId, event);
    }

    @Override
    public Event retrieveEventDetails(String eventId) throws Exception {
        return eventRepository.getEventById(eventId);
    }
}
