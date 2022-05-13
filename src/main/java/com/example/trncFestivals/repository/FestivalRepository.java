package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

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
}
