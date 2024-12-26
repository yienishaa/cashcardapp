package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.AvailabilityEntity;

import java.util.List;
import java.util.Optional;

public interface AvailabilityServiceInterface {

    AvailabilityEntity addAvaliability(AvailabilityEntity availabilityEntity);
    void deleteAvaliabilityById(Integer studentId);
    List<AvailabilityEntity> getAllAvaliabilities();
    Optional<AvailabilityEntity> getAvaliabilityById(int id);
}
