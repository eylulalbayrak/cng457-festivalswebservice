package com.example.trncFestivals.repository;

import com.example.trncFestivals.entity.Individual;
import com.example.trncFestivals.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {

//
//    @Query("SELECT g.individual_first_name, g.individual_last_name, g.municipality_name, COUNT(o.organizerid) " +
//            "AS NoOfFestivalRuns " +
//            "FROM organizer g, festival_run_organizers o " +
//            "WHERE g.organizerid = o.festival_runid " +
//            "GROUP BY o.festival_runid " +
//            "HAVING COUNT(o.festival_runid) > 1")
//    List<Organizer> findAllOrganizersWithMultipleFestivalRuns();
}
