package com.example.trncFestivals.controller;

import com.example.trncFestivals.TrncFestivalsApplication;
import com.example.trncFestivals.entity.Show;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration Testing of Show
 */
@SpringBootTest(classes = TrncFestivalsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShowControllerTest {

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
     * Testing for getShowsBetweenRange()
     */
    @Test
    void getShowsBetweenRange() {
        assertEquals(this.restTemplate.getForObject("http://localhost:" + port + "/showsbyduration?start=1&end=4", Show[].class).length, 1);
    }

}
