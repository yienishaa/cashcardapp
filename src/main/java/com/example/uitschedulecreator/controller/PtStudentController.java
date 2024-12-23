package com.example.uitschedulecreator.controller;

import com.example.uitschedulecreator.model.PtStudentModel;
import com.example.uitschedulecreator.service.PtStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PtStudentController implements PtStudentControllerInterface {

    private final PtStudentService ptStudentService;

    @Autowired
    private PtStudentController(PtStudentService ptStudentService) {
        this.ptStudentService = ptStudentService;
    }

    @Override
    public ResponseEntity<PtStudentService> findById(Integer studentId) {
        //the requestId variable name matches the one in URL so Spring knows to assign value

        Optional<PtStudentService> ptStudent = Optional.ofNullable(ptStudentService);
        //We're calling JpaRepository.findById, which returns an Optional.
        // This smart object might or might not contain the CashCard for which we're searching

        if (ptStudent.isPresent()) {
            return new ResponseEntity<>(ptStudent.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<String> addPtStudent(PtStudentModel ptStudentModel) {
        ptStudentService.createPtStudent(ptStudentModel);

        if(ptStudentService.getPtStudentById(ptStudentModel.getId()) != null){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

}
