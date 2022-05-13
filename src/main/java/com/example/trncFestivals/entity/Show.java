package com.example.trncFestivals.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Set;

/**
 * The Show Class
 */
@Getter
@Setter
@Entity
public class Show extends Event{

    /**
     * List of the performers
     */
    @ElementCollection
    Set<String> performersName;

}
