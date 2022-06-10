package com.example.trncFestivals.controller;

import com.example.trncFestivals.TrncFestivalsApplication;
import com.example.trncFestivals.entity.Concert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration Testing of Concert
 */
@SpringBootTest(classes = TrncFestivalsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConcertControllerTest {

    /**
     * Injection of the rest template
     */
    @Autowired
    TestRestTemplate restTemplate;

    /**
     * Port Number
     */
    @LocalServerPort
    int port;

    /**
     * Test for getConcertByDescription()
     */
    @Test
    void getConcertByDescription() {
        assertEquals(this.restTemplate.getForObject("http://localhost:" + port + "/concertsbydescription/concert", Concert[].class).length, 2);
    }

}
