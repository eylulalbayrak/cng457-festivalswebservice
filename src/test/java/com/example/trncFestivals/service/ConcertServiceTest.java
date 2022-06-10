package com.example.trncFestivals.service;

import com.example.trncFestivals.entity.Concert;
import com.example.trncFestivals.repository.ConcertRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * Class for Unit Testing of Concert Class
 */
@ExtendWith(MockitoExtension.class)
public class ConcertServiceTest {

    /**
     * Injection of Concert Service
     */
    @InjectMocks
    ConcertService concertService;

    /**
     * Mocking of Concert Repository
     */
    @Mock
    ConcertRepository concertRepository;

    /**
     * Testing of getConcertWithLongestDuration() method
     */
    @Test
    void getConcertWithLongestDuration(){
        ArrayList<Concert> concerts = new ArrayList<>();

        concerts.add(new Concert(1, "Concert 1", "First Concert", new Date(2022, Calendar.JUNE, 3), 2, null, "Tarkan"));
        concerts.add(new Concert(2, "Concert 2", "Second Concert", new Date(2021, Calendar.JUNE, 3), 2, null, "Murat Boz"));
        concerts.add(new Concert(3, "Concert 3", "Third Concert", new Date(2020, Calendar.JUNE, 3), 2, null, "Emel Sayın"));

        when(concertRepository.findAll()).thenReturn(concerts);

        List<Concert> concertList = concertService.getConcertWithLongestDuration();
        assertEquals(3, concertList.size());
        assertEquals("Concert 1", concertList.get(0).getEventName());

    }
}
