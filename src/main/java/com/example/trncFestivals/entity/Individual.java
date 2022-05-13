package com.example.trncFestivals.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * The Individual Class
 */
@Getter
@Setter
@Entity
public class Individual extends Organizer{

    /**
     * First name of the individual
     */
    private String individualFirstName;

    /**
     * Last name of the individual
     */
    private String individualLastName;

    /**
     * Address of the individual
     */
    private String individualAddress;

    /**
     * Email of the individual
     */
    private String individualEmail;

    /**
     * Phone number of the individual
     */
    private String individualPhoneNumber;

}
