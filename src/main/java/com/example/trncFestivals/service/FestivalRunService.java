package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.FestivalRun;
import com.example.trncFestivals.repository.FestivalRunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for FestivalRun
 */
@Service
public class FestivalRunService {
    /**
     * Variable used for the method operations
     */
    @Autowired
    private FestivalRunRepository festivalRunRepository;

    /**
     * Method for saving the festival run into database
     * @param festivalRun Festival run
     * @return Festival run
     */
    public FestivalRun save(FestivalRun festivalRun) { return festivalRunRepository.save(festivalRun); }

    /**
     * Method for getting the festival run with a specific ID
     * @param festivalrunid ID of the festival run
     * @return Festival run with a specific ID
     */
    public FestivalRun getFestivalRun(int festivalrunid) { return festivalRunRepository.findById(festivalrunid).orElse(null);  }

    /**
     * Method for getting all the festival runs in a festival with a given ID
     * @param festivalid ID of the festival
     * @return List of all the festival runs in a specific festival
     */
    public List<FestivalRun> getAllFestivalRuns(int festivalid) { return festivalRunRepository.findAllFestivalsByFestivalRunID(festivalid); }

    /**
     * Method for getting the festival runs shorter than a specific duration
     * @param duration Duration of the festival run
     * @return List of the festivals shorter than the given duration
     */
    public List<FestivalRun> getShortFestivalRun(int duration) { return festivalRunRepository.findByFestivalDurationLessThan(duration); }
}
