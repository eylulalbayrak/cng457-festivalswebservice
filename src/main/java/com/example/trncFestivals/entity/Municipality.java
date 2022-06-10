package com.example.trncFestivals.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * The Municipality Class
 */
@Getter
@Setter
@Entity
public class Municipality extends Organizer{

    /**
     * Name of the municipality
     */
    private String municipalityName;
}
