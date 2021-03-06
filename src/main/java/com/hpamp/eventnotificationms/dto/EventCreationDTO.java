package com.hpamp.eventnotificationms.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "events")
public class EventCreationDTO {
    @DynamoDBHashKey(attributeName = "eventId")
    @DynamoDBAutoGeneratedKey
    private String eventId;
    @DynamoDBAttribute
    private String eventName;
    @DynamoDBAttribute
    private String eventDescription;
    @DynamoDBAttribute
    private String eventStatus;
}
