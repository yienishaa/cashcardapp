package com.example.uitschedulecreator.repository;

import com.example.uitschedulecreator.model.PtStudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PtStudentRepository extends JpaRepository<PtStudentModel, Integer> {
}
