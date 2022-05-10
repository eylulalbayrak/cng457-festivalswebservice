package com.example.trncFestivals.entity;

import javax.persistence.Entity;

@Entity
public class Individual extends Organizer{

    private String individualFirstName;
    private String individualLastName;
    private String individualAddress;
    private String individualEmail;
    private String individualPhoneNumber;

}
