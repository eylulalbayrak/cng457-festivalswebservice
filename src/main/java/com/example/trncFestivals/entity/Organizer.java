package com.example.trncFestivals.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int organizerID;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "FestivalRunOrganizers", joinColumns = @JoinColumn (name = "festivalRunID"), inverseJoinColumns = @JoinColumn(name = "organizerID"))
    Set<FestivalRun> festivalRuns;


}
