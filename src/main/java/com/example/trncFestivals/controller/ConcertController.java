package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Concert;
import com.example.trncFestivals.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    /**
     * Method for finding a concert with given string in the description
     * @param key String
     * @return All concerts containing the string
     */
    @GetMapping("/concertsbydescription/{key}")
    public List<Concert> getConcertByDescription(@PathVariable String key){return concertService.getConcertByDescription(key);}


    /**
     * Method for finding all the concerts with the longest duration
     * @return Concerts with the longest duration
     */
    @GetMapping("/longestconcerts")
    public List<Concert> getConcertWithLongestDuration(){return concertService.getConcertWithLongestDuration();}

}
