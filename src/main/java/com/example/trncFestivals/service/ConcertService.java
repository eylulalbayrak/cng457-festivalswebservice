package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Concert;
import com.example.trncFestivals.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for Concert
 */
@Service
public class ConcertService {
    /**
     * Variable used for the method operations
     */
    @Autowired
    private ConcertRepository concertRepository;

    /**
     * Method for saving the concert to database
     * @param concert Concert
     * @return Concert
     */
    public Concert save (Concert concert){return concertRepository.save(concert);}

    /**
     * Method for finding a concert with given string in the description
     * @param key String
     * @return All concerts containing the string
     */
    public List<Concert> getConcertByDescription(String key) {return concertRepository.findAllByEventDescriptionContains(key);}

}
