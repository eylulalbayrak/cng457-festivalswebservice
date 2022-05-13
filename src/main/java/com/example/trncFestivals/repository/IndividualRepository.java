package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Individual
 */
public interface IndividualRepository extends JpaRepository<Individual, Integer> {
}
