package com.example.trncFestivals.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * The FestivalRun Class
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FestivalRun {
    /**
     * ID of the festival run
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int festivalRunID;

    /**
     * Start date and time of the festival run
     */
    private Date festivalStartDate;

    /**
     * Duration of the festival run
     */
    private int festivalDuration;

    /**
     * Festival that the festival run that belongs to
     */
    @JsonBackReference
    @ManyToOne(optional = false)
    private Festival festival;

    /**
     * Events of the festival run
     */
    @JsonManagedReference
    @OneToMany(mappedBy = "festivalRun", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Event> events;

    /**
     * Organizers of the festival run
     */
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "organizerID")
    @ManyToMany(mappedBy = "festivalRuns", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Organizer> organizers;
}
