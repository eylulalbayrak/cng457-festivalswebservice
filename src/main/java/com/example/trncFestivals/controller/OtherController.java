package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Other;
import com.example.trncFestivals.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for Other Class
 */
@RestController
public class OtherController {
    /**
     * Variable used for method operations.
     */
    @Autowired
    private OtherService otherService;

    /**
     * Method for adding other activities
     * @param other Other activity event
     * @return Other activity event
     */
    @PostMapping("/addotheractivity")
    public Other addOtherActivity(@RequestBody Other other){ return otherService.save(other);}
}
