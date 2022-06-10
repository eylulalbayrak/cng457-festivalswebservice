package com.example.trncFestivals.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

/**
 * The Other Class
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Other extends Event{

    /**
     * Constructor for Other class
     * @param eventID Event ID
     * @param eventName Event Name
     * @param eventDescription Event Description
     * @param eventStartDateTime Event Start Date and Time
     * @param eventDuration Event Duration
     * @param festivalRun Festival Run
     */
    public Other(int eventID, String eventName, String eventDescription, Date eventStartDateTime, int eventDuration, FestivalRun festivalRun) {
        super(eventID, eventName, eventDescription, eventStartDateTime, eventDuration, festivalRun);
    }
}
