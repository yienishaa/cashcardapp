package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.model.AvailabilityModel;

public interface SchedulerServiceInterface {

    AvailabilityModel createAvailability(AvailabilityModel availabilityModel);
    AvailabilityModel getAvailability(Integer id);
    void deleteAvailability(AvailabilityModel availabilityModel);
    void deleteAllAvailabilities();
}

