package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Show;
import com.example.trncFestivals.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * Method for finding all the shows whose duration is between given numbers
     * @param start Lower limit for duration
     * @param end Upper limit for duration
     * @return All shows given in the limit
     */
    public List<Show> getShowsBetweenRange(int start, int end) {return showRepository.findAllByEventDurationBetween(start, end);}


    /**
     * Method for getting a list of shows with maximum number of performers
     * @return Shows with maximum number of performers
     */
    public List<Show> getShowsWithMaxPerformers(){

        int maxPerformers = -1;
        int countPerformer = 0;

        ArrayList<Show> result = new ArrayList<>();
        List<Show> shows = showRepository.findAll();

        for(Show s: shows){
            for(int i = 0; i < s.getPerformersName().size(); i++)
                countPerformer++;

            if(maxPerformers < countPerformer)
                maxPerformers = countPerformer;

            countPerformer = 0;

        }

        for(Show s: shows){
            for(int i = 0; i < s.getPerformersName().size(); i++)
                countPerformer++;

            if(countPerformer == maxPerformers)
                result.add(s);

            countPerformer = 0;
        }

        return result;
    }


}
