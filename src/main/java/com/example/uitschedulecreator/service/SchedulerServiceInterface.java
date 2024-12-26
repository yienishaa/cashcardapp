package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.AvailabilityEntity;

public interface SchedulerServiceInterface {

    AvailabilityEntity createAvailability(AvailabilityEntity availabilityEntity);
    AvailabilityEntity getAvailability(Integer id);
    void deleteAvailability(AvailabilityEntity availabilityEntity);
    void deleteAllAvailabilities();
}

