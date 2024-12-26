package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.PtStudentEntity;

import java.util.List;
import java.util.Optional;

public interface PtStudentServiceInterface {

    PtStudentEntity createPtStudent(PtStudentEntity ptStudentEntity);
    void deletePtStudentById(Integer studentId);
    List<PtStudentEntity> getAllPtStudents();
    Optional<PtStudentEntity> getPtStudentByID(String studentID);

}
