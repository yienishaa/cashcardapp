package com.example.uitschedulecreator.controller;

import com.example.uitschedulecreator.model.PtStudentModel;
import com.example.uitschedulecreator.service.PtStudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface PtStudentControllerInterface {

    //GetMapping tells Spring to route only GET requests
    @GetMapping("/csstaff/ptstudent/find")
    public ResponseEntity<PtStudentService> findById(@RequestParam Integer studentId);

    @PostMapping("/csstaff/ptstudent/add")
    public ResponseEntity<String> addPtStudent(@RequestBody PtStudentModel ptStudentModel);



}
