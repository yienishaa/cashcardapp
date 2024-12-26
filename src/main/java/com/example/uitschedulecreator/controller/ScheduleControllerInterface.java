package com.example.uitschedulecreator.controller;

import com.example.uitschedulecreator.entity.ScheduleEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ScheduleControllerInterface {

    @GetMapping("/csstaff/schedule/find")
    Optional<ScheduleEntity> findById(@RequestParam Integer scheduleId);

    @GetMapping("/csstaff/schedule/create")
    ResponseEntity<List<ScheduleEntity>> create();

    @DeleteMapping("/csstaff/schedule/delete")
    void delete(@RequestParam Integer scheduleId);

}
