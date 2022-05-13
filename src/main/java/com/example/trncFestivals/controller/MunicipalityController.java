package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Municipality;
import com.example.trncFestivals.entity.Organizer;
import com.example.trncFestivals.service.MunicipalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for Municipality Class
 */
@RestController
public class MunicipalityController {

    /**
     * Variable used for method operations.
     */
    @Autowired
    private MunicipalityService municipalityService;

    /**
     * Method for adding a municipality
     * @param municipality Municipality
     * @return Municipality
     */
    @PostMapping("/addmunicipality")
    public Municipality addMunicipality(@RequestBody Municipality municipality){ return municipalityService.save(municipality);}

}
