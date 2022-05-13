package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Show;
import com.example.trncFestivals.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
