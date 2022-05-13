package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Concert;
import com.example.trncFestivals.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for Concert Class
 */
@RestController
public class ConcertController {
    /**
     * Variable used for method operations.
     */
    @Autowired
    private ConcertService concertService;

    /**
     * Method for adding a concert
     * @param concert Concert event
     * @return Concert event
     */
    @PostMapping("/addconcert")
    public Concert addConcert(@RequestBody Concert concert){return concertService.save(concert);}


}
