package com.example.uitschedulecreator.repository;


import com.example.uitschedulecreator.model.AvailabilityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailabilityRepository extends JpaRepository<AvailabilityModel, Integer> {
}
