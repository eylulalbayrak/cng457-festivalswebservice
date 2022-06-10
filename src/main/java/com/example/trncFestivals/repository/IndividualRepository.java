package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Repository for Individual
 */
public interface IndividualRepository extends JpaRepository<Individual, Integer> {

    /**
     * Method for finding list of individual organizers with given either first name, last name or phone number
     * @param key1 First name
     * @param key2 Last name
     * @param key3 Phone number
     * @return All individuals containing one of the given keys
     */
    List<Individual> findAllByIndividualFirstNameContainsOrIndividualLastNameContainsOrIndividualPhoneNumberContains(String key1, String key2, String key3);


    /**
     * Method for getting all the individuals with multiple festival runs
     * @return Individuals with multiple festival runs
     */
    @Query(value = "SELECT * FROM organizer g, festival_run_organizers o " +
            "WHERE g.organizerid = o.festival_runid AND g.dtype = 'Individual' " +
            "GROUP BY o.festival_runid " +
            "HAVING COUNT(o.festival_runid) > 1", nativeQuery = true)
    List<Individual> findAllIndividualsWithMultipleFestivalRuns();
}
