package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.AvailabilityEntity;

import java.util.List;

public interface AvailabilityServiceInterface {

    AvailabilityEntity addAvailability(AvailabilityEntity availabilityEntity);
    void deleteAvailabilityById(Integer studentId);
    List<AvailabilityEntity> getAllAvailabilities();
    List<AvailabilityEntity> getAvailabilityByStudentId(String studentId);
}
