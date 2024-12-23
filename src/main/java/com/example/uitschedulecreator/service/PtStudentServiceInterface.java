package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.model.PtStudentModel;

import java.util.List;
import java.util.Optional;

public interface PtStudentServiceInterface {

    PtStudentModel createPtStudent(PtStudentModel ptStudentModel);
    PtStudentModel updatePtStudent(PtStudentModel ptStudentModel);
    void deletePtStudent(PtStudentModel ptStudentModel);
    List<PtStudentModel> getAllPtStudents();
    Optional<PtStudentModel> getPtStudentById(int id);

}
