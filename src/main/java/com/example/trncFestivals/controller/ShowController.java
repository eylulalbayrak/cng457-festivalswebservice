package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Show;
import com.example.trncFestivals.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * Method for adding a show
     * @param show Show event
     * @return Show event
     */
    @PostMapping("/addshow")
    public Show addShow(@RequestBody Show show){ return showService.save(show); }

    /**
     * Method for finding all the shows whose duration is between given numbers
     * @param start Lower limit for duration
     * @param end Upper limit for duration
     * @return All shows given in the limit
     */
    @GetMapping("/showsbyduration")
    public List<Show> getShowsBetweenRange(@RequestParam int start, @RequestParam int end) { return showService.getShowsBetweenRange(start, end);}
}
