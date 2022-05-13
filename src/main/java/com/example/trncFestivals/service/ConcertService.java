package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Concert;
import com.example.trncFestivals.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Concert save (Concert concert){return concertRepository.save(concert);};

}
