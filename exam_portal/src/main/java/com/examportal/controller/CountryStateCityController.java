package com.examportal.controller;

import com.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class CountryStateCityController {
    @Autowired
    private UserService userService;

    @GetMapping("/getCountries")
    public Map<Integer, String> getCountries() {
        return userService.getCountries();
    }

    @GetMapping("/getStates/{countryId}")
    public List<Object[]> getStates(@PathVariable Integer countryId) {
        return userService.getStates(countryId);
    }

    @GetMapping("/getCities/{stateId}")
    public List<Object[]> getCities(@PathVariable Integer stateId) {
        return userService.getCities(stateId);
    }
}
