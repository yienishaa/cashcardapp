package com.example.uitschedulecreator.repository;

import com.example.uitschedulecreator.entity.PtStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PtStudentRepository extends JpaRepository<PtStudentEntity, Integer> {


    Optional<PtStudentEntity> findByStudentID(String studentID);
}
