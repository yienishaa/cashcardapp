package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.PtStudentEntity;
import com.example.uitschedulecreator.repository.PtStudentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Service
public class PtStudentService implements PtStudentServiceInterface{

    @Autowired //since Autowired is used an instance of ptstudentrepo is created, we dont need to create one again in below methods
    private final PtStudentRepository ptStudentRepository;

    public PtStudentService(PtStudentRepository ptStudentRepository) {
        this.ptStudentRepository = ptStudentRepository;
    }

    @Override
    public PtStudentEntity createPtStudent(PtStudentEntity ptStudentEntity) {
        return ptStudentRepository.save(ptStudentEntity);
    }

    @Override
    public void deletePtStudentById(Integer studentId) {
        if(ptStudentRepository.existsById(studentId)) {
            ptStudentRepository.deleteById(studentId);
        }
    }

    @Override
    public List<PtStudentEntity> getAllPtStudents() {

        return ptStudentRepository.findAll();
    }

    @Override
    public Optional<PtStudentEntity> getPtStudentById(int id) {
        return ptStudentRepository.findById(id);
    }

}
