package com.example.trncFestivals.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FestivalRun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int festivalRunID;

    private Date festivalStartDate;

    private int festivalDuration;
    @ManyToOne(optional = false)
    private Festival festival;

    @OneToMany(mappedBy = "festivalRun", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Event> events;

    @ManyToMany(mappedBy = "festivalRuns", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Organizer> organizers;
}
