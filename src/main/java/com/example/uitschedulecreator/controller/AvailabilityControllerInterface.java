package com.example.uitschedulecreator.controller;

import com.example.uitschedulecreator.entity.AvailabilityEntity;

import com.example.uitschedulecreator.service.AvailabilityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface AvailabilityControllerInterface {

    //GetMapping tells Spring to route only GET requests
    @GetMapping("/csstaff/availablility/find")
    public Optional<AvailabilityEntity> findById(@RequestParam Integer availabilityId);

    @PostMapping("/csstaff/availablility/add")
    public ResponseEntity<AvailabilityService> add(@RequestBody AvailabilityEntity availabilityEntity);

    @DeleteMapping("/csstaff/availablility/delete")
    public void delete(@RequestParam Integer availabilityId);

    @GetMapping("/csstaff/availablility/findAll")
    public ResponseEntity<List<AvailabilityEntity>> findAllPtStudent();
}
