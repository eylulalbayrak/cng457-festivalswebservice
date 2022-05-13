package com.example.trncFestivals.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * The Organizer Class
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Organizer {

    /**
     * Id of the organizer
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int organizerID;

    /**
     * Festival runs that organizer organizes
     */
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "festivalRunID")
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "FestivalRunOrganizers", joinColumns = @JoinColumn (name = "festivalRunID"), inverseJoinColumns = @JoinColumn(name = "organizerID"))
    Set<FestivalRun> festivalRuns;


}
