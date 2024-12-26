package com.example.uitschedulecreator.controller;

import com.example.uitschedulecreator.entity.AvailabilityEntity;
import com.example.uitschedulecreator.service.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class AvailabilityController implements AvailabilityControllerInterface {

    private AvailabilityService availabilityService;

    @Autowired
    private AvailabilityController(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    @Override
    public Optional<AvailabilityEntity> findById(Integer studentId) {
        return availabilityService.getAvaliabilityById(studentId);
    }

    @Override
    public ResponseEntity<AvailabilityService> add(AvailabilityEntity availabilityEntity) {
        System.out.println(availabilityEntity);
        availabilityService.addAvaliability(availabilityEntity);
        return new ResponseEntity(availabilityService.
                getAvaliabilityById(18),HttpStatus.OK);

    }

    @Override
    public void delete(Integer studentId) {
        availabilityService.deleteAvaliabilityById(studentId);
    }

    @Override
    public ResponseEntity<List<AvailabilityEntity>> findAllPtStudent() {
        return new ResponseEntity<>(availabilityService.getAllAvaliabilities(), HttpStatus.OK);
    }
}
