package com.example.trncFestivals.controller;

import com.example.trncFestivals.TrncFestivalsApplication;
import com.example.trncFestivals.entity.Festival;
import com.example.trncFestivals.entity.Individual;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Integration Testing of Individual
 */
@SpringBootTest(classes = TrncFestivalsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndividualControllerTest {

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


    //This test is not properly working. Details are explained in project report.

    /**
     * Testing for getIndividualByNameOrSurnameOrPhoneNo()
     */
    @Test
    void getIndividualByNameOrSurnameOrPhoneNo() {
        assertEquals(this.restTemplate.getForObject("http://localhost:"  + port + "/organizersearch?key=Eylul", Individual[].class).length, 1);
    }

}
