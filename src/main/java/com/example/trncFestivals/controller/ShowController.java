package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Show;
import com.example.trncFestivals.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for Other Class
 */
@RestController
public class ShowController {
    /**
     * Variable used for method operations.
     */
    @Autowired
    private ShowService showService;

    /**
     * Methdd for adding a show
     * @param show Show event
     * @return Show event
     */
    @PostMapping("/addshow")
    public Show addShow(@RequestBody Show show){ return showService.save(show); }
}
