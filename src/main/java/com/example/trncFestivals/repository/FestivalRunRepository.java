package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository for FestivalRun
 */
public interface FestivalRunRepository extends JpaRepository<FestivalRun, Integer> {
    /**
     * Method for finding all the festival runs of a festival
     * @param festivalid ID of the festival
     * @return List of festival runs with given ID
     */
    List<FestivalRun> findFestivalRunsByFestival_FestivalID(int festivalid);

    /**
     * Method for finding festival runs shorter than given duration
     * @param duration Duration of the festival run
     * @return List of festival runs shorter than a given duration
     */
    List<FestivalRun> findByFestivalDurationLessThan(int duration);
}
