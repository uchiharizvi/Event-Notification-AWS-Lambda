package com.hpamp.eventnotificationms.service;

import com.hpamp.eventnotificationms.entity.Event;

public interface EventService {
    Event createEvent(Event event) throws Exception;
    String updateEvent(String eventId, Event event) throws Exception;
    Event retrieveEventDetails(String eventId) throws Exception;

}
