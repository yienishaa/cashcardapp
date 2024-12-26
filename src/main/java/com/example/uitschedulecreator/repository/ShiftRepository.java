package com.example.uitschedulecreator.repository;

import com.example.uitschedulecreator.entity.ShiftsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepository extends JpaRepository<ShiftsEntity, Integer> {
}
