package com.example.trncFestivals.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * The Concert Class
 */
@Getter
@Setter
@Entity
public class Concert extends Event{

    /**
     * The name of the performer
     */
    private String performerName;
}
