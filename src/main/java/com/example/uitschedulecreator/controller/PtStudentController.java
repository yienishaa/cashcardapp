package com.example.uitschedulecreator.controller;

import com.example.uitschedulecreator.entity.PtStudentEntity;
import com.example.uitschedulecreator.service.PtStudentService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PtStudentController implements PtStudentControllerInterface {
    Log log = LogFactory.getLog(PtStudentController.class);
    private final PtStudentService ptStudentService;

    @Autowired
    private PtStudentController(PtStudentService ptStudentService) {
        this.ptStudentService = ptStudentService;
    }

    @Override
    public Optional<PtStudentEntity> findById(String studentId) {

        return ptStudentService.getPtStudentByID(studentId);
    }

    @Override
    public ResponseEntity<PtStudentService> addPtStudent(PtStudentEntity ptStudentEntity) {
        System.out.println(ptStudentEntity);
        ptStudentService.createPtStudent(ptStudentEntity);

        return new ResponseEntity(ptStudentService.getPtStudentByID(ptStudentEntity.getStudentID()), HttpStatus.OK);

    }

    @Override
    public void deletePtStudent(Integer studentId) {
        ptStudentService.deletePtStudentById(studentId);
    }


    @Override
    public ResponseEntity<List<PtStudentEntity>> findAllPtStudent() {
        return new ResponseEntity(ptStudentService.getAllPtStudents(), HttpStatus.OK);
    }

}
