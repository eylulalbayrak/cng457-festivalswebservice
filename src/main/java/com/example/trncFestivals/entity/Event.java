package com.example.trncFestivals.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int eventID;

    private String eventName;

    private String eventDescription;

    private Date eventStartDateTime;

    private int eventDuration;
    @ManyToOne(optional = false)
    private FestivalRun festivalRun;
}
