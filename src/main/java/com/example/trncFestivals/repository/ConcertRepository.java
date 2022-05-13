package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Concert
 */
public interface ConcertRepository extends JpaRepository<Concert, Integer> {
}
