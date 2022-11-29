package com.taskman.mytasks.controller;

import com.taskman.mytasks.entity.Countries;
import com.taskman.mytasks.repository.CountriesRepository;
import com.taskman.mytasks.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CountriesController {
    @Autowired
    CountriesRepository countriesRepository;

    @Autowired
    CountriesService countriesService;

    @Value("${test.property.value}")
    private String propVal;

    @GetMapping("/countries")
    public ResponseEntity<List<Countries>> getAllCountries() {
        List<Countries> listOfCountries = new ArrayList<>();
        try {
            System.out.println("PROPERTY VALUE :: " + propVal);
            listOfCountries = countriesRepository.findAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(listOfCountries, HttpStatus.OK);
    }

    @GetMapping("/retrytest")
    public ResponseEntity<String> retryMethod(@RequestParam int val) {
        double result = countriesService.retryMethod(val);


        return new ResponseEntity<>(Double.toString(result), HttpStatus.OK);
    }
}