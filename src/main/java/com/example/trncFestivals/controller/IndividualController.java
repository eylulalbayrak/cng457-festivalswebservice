package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Individual;
import com.example.trncFestivals.service.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for Individual Class
 */
@RestController
public class IndividualController {

    /**
     * Variable used for method operations.
     */
    @Autowired
    private IndividualService individualService;

    /**
     * Method for adding an individual
     * @param individual Individual
     * @return Individual
     */
    @PostMapping("/addindividual")
    public Individual addIndividual(@RequestBody Individual individual){ return individualService.save(individual);}

    /**
     * Method for finding list of individual organizers with given either first name, last name or phone number
     * @param key First name, last name or phone number
     * @return return All individuals containing the given key
     */
    @GetMapping("/organisersearch")
    public List<Individual> getIndividualByNameOrSurnameOrPhoneNo(@RequestParam String key){ return individualService.getIndividualByFirstNameOrLastNameOrPhoneNumber(key);}
}
