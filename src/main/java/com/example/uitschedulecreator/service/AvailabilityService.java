package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.AvailabilityEntity;
import com.example.uitschedulecreator.repository.AvailabilityRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public AvailabilityEntity addAvaliability(AvailabilityEntity availabilityEntity) {
        System.out.println(availabilityEntity.toString());
        System.out.println(availabilityEntity.getStudentId().toString());
        System.out.println(availabilityEntity.getShiftId().toString());
        return availabilityRepository.save(availabilityEntity);
    }

    @Override
    public void deleteAvaliabilityById(Integer studentId) {
        availabilityRepository.deleteById(studentId);
    }

    @Override
    public List<AvailabilityEntity> getAllAvaliabilities() {
        return availabilityRepository.findAll();
    }

    @Override
    public Optional<AvailabilityEntity> getAvaliabilityById(int id) {
        return availabilityRepository.findById(id);
    }
}
