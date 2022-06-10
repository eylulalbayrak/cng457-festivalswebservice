package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Repository for Municipality
 */
public interface MunicipalityRepository extends JpaRepository<Municipality, Integer> {

    /**
     * Method for getting all the municipalities with multiple festival runs
     * @return Municipalities with multiple festival runs
     */
    @Query(value = "SELECT * FROM organizer g, festival_run_organizers o " +
            "WHERE g.organizerid = o.festival_runid AND g.dtype = 'Municipality' " +
            "GROUP BY o.festival_runid " +
            "HAVING COUNT(o.festival_runid) > 1", nativeQuery = true)
    List<Municipality> findAllMunicipalitiesWithMultipleFestivalRuns();

}
