package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Other;
import com.example.trncFestivals.repository.OtherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for Other
 */
@Service
public class OtherService {

    /**
     * Variable used for the method operations
     */
    @Autowired
    private OtherRepository otherRepository;

    /**
     * Method for saving the other activity into database
     * @param other Other activity
     * @return Other activity
     */
    public Other save(Other other) { return otherRepository.save(other); }
}
