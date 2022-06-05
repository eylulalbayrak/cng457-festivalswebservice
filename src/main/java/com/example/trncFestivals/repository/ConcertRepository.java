package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository for Concert
 */
public interface ConcertRepository extends JpaRepository<Concert, Integer> {

    /**
     * Method for finding a concert with given string in the description
     * @param key String in the description
     * @return All concerts containing the string
     */
    List<Concert> findAllByEventDescriptionContains(String key);
}
