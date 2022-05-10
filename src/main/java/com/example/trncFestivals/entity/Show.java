package com.example.trncFestivals.entity;


import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Set;

@Entity
public class Show extends Event{

    @ElementCollection
    Set<String> performersName;

}
