package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Show;
import com.example.trncFestivals.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for Show
 */
@Service
public class ShowService {

    /**
     * Variable used for the method operations
     */
    @Autowired
    private ShowRepository showRepository;

    /**
     * Method for saving the show activity into database
     * @param show Show
     * @return Show
     */
    public Show save(Show show) { return showRepository.save(show); }

    /**
     * Method for finding all the shows whose duration is between given numbers
     * @param start Lower limit for duration
     * @param end Upper limit for duration
     * @return All shows given in the limit
     */
    public List<Show> getShowsBetweenRange(int start, int end) {return showRepository.findAllByEventDurationBetween(start, end);}
}
