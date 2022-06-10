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
        Set<String> performers = new HashSet<>();

        performers.add("Performer 1");
        performers.add("Performer 2");
        performers.add("Performer 3");

        shows.add(new Show(1, "Show 1", "First Show", new Date(2022, Calendar.JUNE, 3), 2, null, performers));
        shows.add(new Show(2, "Show 2", "Second Show", new Date(2022, Calendar.JUNE, 3), 2, null, performers));


        when(showRepository.findAll()).thenReturn(shows);

        List<Show> showList = showService.getShowsWithMaxPerformers();
        assertEquals(2, showList.size());
        assertEquals("Show 1", showList.get(0).getEventName());

    }
}
