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

//    @Query(value = "SELECT * FROM Festival WHERE festival_name = :festivalName", nativeQuery = true)
//    List<Festival> findAllByFestivalNameNative(@Param("festivalName") String name);

}
