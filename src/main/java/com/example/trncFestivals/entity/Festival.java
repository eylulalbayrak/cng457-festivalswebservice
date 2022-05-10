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
public class Festival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int festivalID;

    private String festivalName;

    private String festivalLocation;

    @OneToMany(mappedBy = "festival", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<FestivalRun> festivalRuns;

}
