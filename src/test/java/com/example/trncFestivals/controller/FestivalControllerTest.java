package com.example.trncFestivals.controller;

import com.example.trncFestivals.TrncFestivalsApplication;
import com.example.trncFestivals.entity.Festival;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration Testing of Festival
 */
@SpringBootTest(classes = TrncFestivalsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FestivalControllerTest {

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
     * Testing for getFestivalByName()
     */
    @Test
    void getFestivalByName() {
        assertEquals(this.restTemplate.getForObject("http://localhost:" + port + "/festivalsbyname?festivalName=Orange", Festival[].class).length, 1);
    }


    //This test is not properly working. Details are explained in project report.

    /**
     * Testing for getFestivalsWithHighestRuns()
     */
    @Test
    void getFestivalsWithHighestRuns() {
        assertEquals(this.restTemplate.getForObject("http://localhost:" + port + "/popularfestivals", Festival[].class).length, 1);
    }

}
