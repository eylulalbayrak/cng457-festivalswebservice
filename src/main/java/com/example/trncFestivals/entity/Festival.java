package com.example.trncFestivals.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * The Festival Class
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "festivalID")
public class Festival {
    /**
     * ID of the festival
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int festivalID;

    /**
     * Name of the festival
     */
    private String festivalName;

    /**
     * Location of the festival
     */
    private String festivalLocation;

    /**
     * Festival runs of the festival
     */
    @JsonManagedReference
    @OneToMany(mappedBy = "festival", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<FestivalRun> festivalRuns;

}
