package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Show;
import com.example.trncFestivals.repository.ShowRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Class for Unit Testing of Show Class
 */
@ExtendWith(MockitoExtension.class)
public class ShowServiceTest {

    /**
     * Injection of Show Service
     */
    @InjectMocks
    ShowService showService;

    /**
     * Mocking of Show Repository
     */
    @Mock
    ShowRepository showRepository;

    /**
     * Testing of getShowsWithMaxPerformers() method
     */
    @Test
    void getShowsWithMaxPerformers(){

        ArrayList<Show> shows = new ArrayList<>();
        Set<String> performers1 = new HashSet<>();
        Set<String> performers2 = new HashSet<>();

        performers1.add("Performer 1");
        performers1.add("Performer 2");
        performers1.add("Performer 3");

        performers2.add("Performer 1");
        performers2.add("Performer 2");

        shows.add(new Show(1, "Show 1", "First Show", new Date(2022, Calendar.JUNE, 3), 2, null, performers1));
        shows.add(new Show(2, "Show 2", "Second Show", new Date(2022, Calendar.JUNE, 3), 2, null, performers2));


        when(showRepository.findAll()).thenReturn(shows);

        List<Show> showList = showService.getShowsWithMaxPerformers();
        assertEquals(1, showList.size());
        assertEquals("Show 1", showList.get(0).getEventName());

    }
}
