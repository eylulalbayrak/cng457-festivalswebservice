package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Festival;
import com.example.trncFestivals.service.FestivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for Festival Class
 */
@RestController
public class FestivalController {
    /**
     * Variable used for method operations.
     */
    @Autowired
    private FestivalService festivalService;

    /**
     * Method for adding a festival
     * @param festival Festival object
     * @return Festival object
     */
    @PostMapping("/addfestival")
    public Festival addFestival(@RequestBody Festival festival){ return festivalService.save(festival); }

    /**
     * Method for getting all the festivals
     * @return All festivals
     */
    @GetMapping("/getallfestivals")
    public List<Festival> getAllFestivals(){ return festivalService.getAllFestivals(); }

    /**
     * Method for getting a festival using ID
     * @param id ID of the festival
     * @return The Festival
     */
    @GetMapping("/getfestival/{id}")
    public Festival getFestival(@PathVariable int id){ return festivalService.getFestival(id); }

    /**
     * Method for getting all the festivals in a specific city
     * @param city The city name
     * @return List of festivals in a given city
     */
    @GetMapping("/getfestivalsforacity/{city}")
    public List<Festival> getFestivalsForACity(@PathVariable String city){ return festivalService.getFestivalsForACity(city); }


    /**
     * Method for getting all the festivals with a given keyword
     * @param name Keyword
     * @return Festivals with a given keyword
     */
    @GetMapping("/festivalsbyname")
    public List<Festival> getFestivalByName(@RequestParam(name="festivalName") String name){ return festivalService.getFestivalByName(name);}


    /**
     * Method for getting all the festivals with the highest number of festival runs
     * @return Festivals with the highest number of festival runs
     */
    @GetMapping("/popularfestivals")
    public List<Festival> getFestivalsWithHighestRuns(){ return festivalService.getFestivalsWithHighestRuns();}
}
