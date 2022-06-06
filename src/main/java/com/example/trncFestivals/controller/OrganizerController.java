package com.example.trncFestivals.controller;

import com.example.trncFestivals.entity.Organizer;
import com.example.trncFestivals.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizerController {

    @Autowired
    private OrganizerService organizerService;

//    @GetMapping("/organiserswithmultipleruns")
//    public List<Organizer> getOrganizersWithMultipleFestivalRuns() {return organizerService.getOrganizersWithMultipleFestivalRuns();};
}
