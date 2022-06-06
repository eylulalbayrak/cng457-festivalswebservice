package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Festival;
import com.example.trncFestivals.repository.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for Festival
 */
@Service
public class FestivalService {

    /**
     * Variable used for the method operations
     */
    @Autowired
    private FestivalRepository festivalRepository;

    /**
     * Method for saving the festival into database
     * @param festival Festival
     * @return Festival
     */
    public Festival save(Festival festival) { return festivalRepository.save(festival); }

    /**
     * Method for getting all the festivals with a given ID
     * @return All festivals with a given ID
     */
    public List<Festival> getAllFestivals() { return festivalRepository.findAll(); }

    /**
     * Method for getting the festival with a specific ID
     * @param id ID of a festival
     * @return Festival with the given ID
     */
    public Festival getFestival(int id) { return festivalRepository.findById(id).orElse(null); }

    /**
     * Method for getting the festivals conducted in the given city
     * @param city City
     * @return All festivals with given city
     */
    public List<Festival> getFestivalsForACity(String city) { return festivalRepository.findAllByFestivalLocationContains(city);}


//    public List<Festival> getFestivalByName(String name) { return festivalRepository.findAllByFestivalNameNative(name);}
}
