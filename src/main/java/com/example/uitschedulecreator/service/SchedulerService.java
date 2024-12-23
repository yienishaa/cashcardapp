package com.example.uitschedulecreator.service;


import com.example.uitschedulecreator.model.AvailabilityModel;
import com.example.uitschedulecreator.repository.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService implements SchedulerServiceInterface {

    private final AvailabilityRepository availability;

    @Autowired
    public SchedulerService(AvailabilityRepository availability) {
        this.availability = availability;
    }

    @Override
    public AvailabilityModel getAvailability(Integer id) {
        return availability.findById(id).get();
    }

    @Override
    public void deleteAvailability(AvailabilityModel availabilityModel) {
        availability.delete(availabilityModel);
    }

    @Override
    public void deleteAllAvailabilities() {
        availability.deleteAll();
    }

    @Override
    public AvailabilityModel createAvailability(AvailabilityModel availabilityModel) {
        return availability.save(availabilityModel);
    }


}
