package com.example.trncFestivals.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

/**
 * The Concert Class
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Concert extends Event{

    /**
     * The name of the performer
     */
    private String performerName;

    /**
     * Constructor for Concert class
     * @param eventID Event ID
     * @param eventName Event Name
     * @param eventDescription Event Description
     * @param eventStartDateTime Event Start Date and Time
     * @param eventDuration Event Duration
     * @param festivalRun Festival Run
     * @param performerName Performer's Name
     */
    public Concert(int eventID, String eventName, String eventDescription, Date eventStartDateTime, int eventDuration, FestivalRun festivalRun, String performerName) {
        super(eventID, eventName, eventDescription, eventStartDateTime, eventDuration, festivalRun);
        this.performerName = performerName;
    }
}
