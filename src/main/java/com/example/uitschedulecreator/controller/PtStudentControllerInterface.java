package com.example.uitschedulecreator.controller;

import com.example.uitschedulecreator.entity.PtStudentEntity;
import com.example.uitschedulecreator.service.PtStudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface PtStudentControllerInterface {

    //GetMapping tells Spring to route only GET requests
    @GetMapping("/csstaff/ptstudent/find")
    public Optional<PtStudentEntity> findById(@RequestParam Integer studentId);

    @PostMapping("/csstaff/ptstudent/add")
    public ResponseEntity<PtStudentService> addPtStudent(@RequestBody PtStudentEntity ptStudentEntity);

    @DeleteMapping("/csstaff/ptstudent/delete")
    public void deletePtStudent(@RequestParam Integer studentId);

    @GetMapping("/csstaff/ptstudent/findAll")
    public ResponseEntity<List<PtStudentEntity>> findAllPtStudent();
}
