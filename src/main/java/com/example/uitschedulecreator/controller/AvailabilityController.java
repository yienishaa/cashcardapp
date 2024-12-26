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

    private final AvailabilityService availabilityService;

    @Autowired
    private AvailabilityController(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    @Override
    public List<AvailabilityEntity> findById(String studentId) {
        return availabilityService.getAvailabilityByStudentId(studentId);
    }

    @Override
    public ResponseEntity<AvailabilityEntity> add(AvailabilityEntity availabilityEntity) {
        System.out.println(availabilityEntity.getAvailabilityId());
        AvailabilityEntity availabilityEntity1 = availabilityService.addAvailability(availabilityEntity);
        return new ResponseEntity<>(availabilityEntity1,HttpStatus.OK);

    }

    @Override
    public void delete(Integer studentId) {
        availabilityService.deleteAvailabilityById(studentId);
    }

    @Override
    public ResponseEntity<List<AvailabilityEntity>> findAllPtStudent() {
        System.out.println("findAllPtStudent "+availabilityService.getAllAvailabilities());
        return new ResponseEntity<>(availabilityService.getAllAvailabilities(), HttpStatus.OK);
    }
}
