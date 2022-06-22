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
    @Query(value = "select * from festival where festivalid in " +
            "(select festivalid from (select f.festivalid, count(festival_runid) cnt from festival f, festival_run f_r  where f.festivalid = f_r.festival_festivalid group by f.festivalid) as fc," +
            " (select max(c) maxcount from (select count(fr.festival_runid) c from festival f, festival_run fr where fr.festival_festivalid = f.festivalid group by festivalid) as festival_run_counts) as frcm " +
            "where cnt = maxcount);", nativeQuery = true)
    List<Festival> findAllFestivalsWithHighestRuns();

}
