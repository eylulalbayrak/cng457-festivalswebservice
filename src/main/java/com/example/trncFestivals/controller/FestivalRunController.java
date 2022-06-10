package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.FestivalRun;
import com.example.trncFestivals.service.FestivalRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for FestivalRun Class
 */
@RestController
public class FestivalRunController {
    /**
     * Variable used for method operations.
     */
    @Autowired
    private FestivalRunService festivalRunService;

    /**
     * Method for adding a festival run to a festival
     * @param festivalRun The festival run
     * @return The festival run
     */
    @PostMapping("/addfestivalrun")
    public FestivalRun addFestivalRun(@RequestBody FestivalRun festivalRun){ return festivalRunService.save(festivalRun);}

    /**
     * Method for getting the festival run with a specific ID
     * @param festivalrunid ID of the festival run
     * @return The festival run
     */
    @PostMapping("/getfestivalrun/{festivalrunid}")
    public FestivalRun getFestivalRun(@PathVariable int festivalrunid) { return festivalRunService.getFestivalRun(festivalrunid);}

    /**
     * Method for getting all the festival runs of a specific festival
     * @param festivalid ID of the festival
     * @return All the festival runs with the given ID
     */
    @PostMapping("getallfestivalruns/{festivalid}")
    public List<FestivalRun> getAllFestivalRuns(@PathVariable int festivalid) {return festivalRunService.getAllFestivalRuns(festivalid);}

    /**
     * Method for finding the festival runs which are shorter than a specific duration
     * @param duration Duration of the festival run
     * @return All the festival runs which are shorter than the given duration
     */
    @PostMapping("getshortfestivalrun/{duration}")
    public List<FestivalRun> getShortFestivalRun(@PathVariable int duration){return festivalRunService.getShortFestivalRun(duration);}

}
