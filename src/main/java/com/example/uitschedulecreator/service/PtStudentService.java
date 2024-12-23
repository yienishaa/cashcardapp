package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.model.PtStudentModel;
import com.example.uitschedulecreator.repository.PtStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PtStudentService implements PtStudentServiceInterface{

    @Autowired //since Autowired is used an instance of ptstudentrepo is created, we dont need to create one again in below methods
    private final PtStudentRepository ptStudentRepository;

    public PtStudentService(PtStudentRepository ptStudentRepository) {
        this.ptStudentRepository = ptStudentRepository;
    }

    @Override
    public PtStudentModel createPtStudent(PtStudentModel ptStudentModel) {
        return ptStudentRepository.save(ptStudentModel);
    }

    @Override
    public PtStudentModel updatePtStudent(PtStudentModel ptStudentModel) {
        return ptStudentRepository.save(ptStudentModel);
    }

    @Override
    public void deletePtStudent(PtStudentModel ptStudentModel) {
        ptStudentRepository.delete(ptStudentModel);
    }

    @Override
    public List<PtStudentModel> getAllPtStudents() {
        return List.of();
    }

    @Override
    public Optional<PtStudentModel> getPtStudentById(int id) {
        return ptStudentRepository.findById(id);
    }

}
