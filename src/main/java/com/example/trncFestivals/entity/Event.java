package com.example.trncFestivals.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * The Event Class
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {

    /**
     * ID of the event
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int eventID;

    /**
     * Name of the event
     */
    private String eventName;

    /**
     * Description of the event
     */
    private String eventDescription;

    /**
     * Start date and time of the event
     */
    private Date eventStartDateTime;

    /**
     * Duration of the event
     */
    private int eventDuration;

    /**
     * Festival run of the event
     */
    @JsonBackReference
    @ManyToOne(optional = false)
    private FestivalRun festivalRun;
}
