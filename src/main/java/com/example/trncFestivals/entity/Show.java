package com.example.trncFestivals.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

/**
 * The Show Class
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Show extends Event{

    /**
     * List of the performers
     */
    @ElementCollection
    Set<String> performersName;

    /**
     * Constructor for Show class
     * @param eventID Event ID
     * @param eventName Event Name
     * @param eventDescription Event Description
     * @param eventStartDateTime Event Start Date and Time
     * @param eventDuration Event Duration
     * @param festivalRun Festival Run
     * @param performersName Performers' Name
     */
    public Show(int eventID, String eventName, String eventDescription, Date eventStartDateTime, int eventDuration, FestivalRun festivalRun, Set<String> performersName) {
        super(eventID, eventName, eventDescription, eventStartDateTime, eventDuration, festivalRun);
        this.performersName = performersName;
    }
}
