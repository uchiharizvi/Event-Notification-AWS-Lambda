package com.hpamp.eventnotificationms.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.hpamp.eventnotificationms.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EventRepository {
    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Event save(Event event) {
        dynamoDBMapper.save(event);
        return event;
    }

    public Event getEventById(String eventId) {
        return dynamoDBMapper.load(Event.class, eventId);
    }

    public String delete(String eventId) {
        Event event = dynamoDBMapper.load(Event.class, eventId);
        dynamoDBMapper.delete(event);
        return "Event Deleted";
    }

    public String update(String eventId, Event event) {
        dynamoDBMapper.save(event, new DynamoDBSaveExpression()
                .withExpectedEntry(
                        "eventId",
                        new ExpectedAttributeValue(
                                new AttributeValue()
                                        .withS(
                                                eventId
                                        )
                        )
                )
        );
        return eventId;
    }
}
