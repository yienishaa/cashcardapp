package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.AvailabilityEntity;
import com.example.uitschedulecreator.repository.AvailabilityRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Service
public class AvailabilityService implements AvailabilityServiceInterface {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    private AvailabilityService(AvailabilityRepository availabilityRepository) {
        this.availabilityRepository = availabilityRepository;
    }

    @Override
    public AvailabilityEntity addAvailability(AvailabilityEntity availabilityEntity) {
        return availabilityRepository.save(availabilityEntity);
    }

    @Override
    public void deleteAvailabilityById(Integer studentId) {
        availabilityRepository.deleteById(studentId);
    }

    @Override
    public List<AvailabilityEntity> getAllAvailabilities() {
        return availabilityRepository.findAll();
    }

    @Override
    public List<AvailabilityEntity> getAvailabilityByStudentId(String studentId) {
        return availabilityRepository.findByStudentId_StudentID(studentId);
    }
}
