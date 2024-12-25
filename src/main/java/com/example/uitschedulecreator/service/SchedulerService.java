package com.example.uitschedulecreator.service;


import com.example.uitschedulecreator.entity.AvailabilityEntity;
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
    public AvailabilityEntity getAvailability(Integer id) {
        return availability.findById(id).get();
    }

    @Override
    public void deleteAvailability(AvailabilityEntity availabilityEntity) {
        this.availability.delete(availabilityEntity);
    }

    @Override
    public void deleteAllAvailabilities() {
        availability.deleteAll();
    }

    @Override
    public AvailabilityEntity createAvailability(AvailabilityEntity availabilityEntity) {
        return this.availability.save(availabilityEntity);
    }


}
