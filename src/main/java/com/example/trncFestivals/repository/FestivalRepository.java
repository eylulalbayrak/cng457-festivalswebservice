package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Repository for Festival
 */
public interface FestivalRepository extends JpaRepository<Festival, Integer> {

    /**
     * Method for finding all the festivals in a specific city
     * @param city Name of the city
     * @return List of festivals in the specified city
     */
    List<Festival> findAllByFestivalLocationContains(String city);

    /**
     * Method for getting all the festivals with a given keyword
     * @param name Keyword
     * @return Festivals with a given keyword
     */
    @Query(value = "SELECT * FROM Festival WHERE festival_name LIKE CONCAT('%',:festivalName,'%')", nativeQuery = true)
    List<Festival> findAllByFestivalNameNative(@Param("festivalName") String name);


    /**
     * Method for getting all the festivals with the highest number of festival runs
     * @return Festivals with the highest number of festival runs
     */
    @Query(value = "SELECT *" +
            "FROM Festival f, festival_run r " +
            "WHERE f.festivalid = r.festival_festivalid " +
            "GROUP BY r.festival_festivalid " +
            "HAVING COUNT(r.festival_runid) > 1", nativeQuery = true)
    List<Festival> findAllFestivalsWithHighestRuns();

}
