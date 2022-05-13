package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Municipality;
import com.example.trncFestivals.entity.Organizer;
import com.example.trncFestivals.repository.MunicipalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for Municipality
 */
@Service
public class MunicipalityService {

    /**
     * Variable used for method operations.
     */
    @Autowired
    private MunicipalityRepository municipalityRepository;

    /**
     * Method for saving the municipality to the database
     * @param municipality Municipality
     * @return Municipality
     */
    public Municipality save(Municipality municipality) { return municipalityRepository.save(municipality); }



}
