package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Individual;
import com.example.trncFestivals.repository.IndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for Individual
 */
@Service
public class IndividualService {

    /**
     * Variable used for method operations.
     */
    @Autowired
    private IndividualRepository individualRepository;

    /**
     * Method for saving the individual to the database
     * @param individual Individual
     * @return Individual
     */
    public Individual save(Individual individual) { return individualRepository.save(individual); }
}
