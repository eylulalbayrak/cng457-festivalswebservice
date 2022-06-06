package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Organizer;
import com.example.trncFestivals.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

//    public List<Organizer> getOrganizersWithMultipleFestivalRuns() { return organizerRepository.findAllOrganizersWithMultipleFestivalRuns();};

}
