package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository for Show
 */
public interface ShowRepository extends JpaRepository<Show,Integer> {

    /**
     * Method for finding all the shows whose duration is between given numbers
     * @param start Lower limit for duration
     * @param end Upper limit for duration
     * @return All shows given in the limit
     */
    List<Show> findAllByEventDurationBetween(int start, int end);


}
