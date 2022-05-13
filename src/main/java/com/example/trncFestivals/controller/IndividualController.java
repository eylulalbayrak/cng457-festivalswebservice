package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Individual;
import com.example.trncFestivals.service.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
