package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Individual;
import com.example.trncFestivals.repository.IndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * Method for finding list of individual organizers with given either first name, last name or phone number
     * @param key First name, last name or phone number
     * @return All individuals containing the given key
     */
    public List<Individual> getIndividualByFirstNameOrLastNameOrPhoneNumber(String key) {return individualRepository.findAllByIndividualFirstNameContainsOrIndividualLastNameContainsOrIndividualPhoneNumberContains(key, key, key);}


    /**
     * Method for getting all the individuals with multiple festival runs
     * @return Individuals with multiple festival runs
     */
    public List<Individual> getIndividualsWithMultipleFestivalRuns() { return individualRepository.findAllIndividualsWithMultipleFestivalRuns();}

}
