package com.example.uitschedulecreator.controller;

import com.example.uitschedulecreator.entity.ScheduleEntity;
import com.example.uitschedulecreator.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ScheduleController implements ScheduleControllerInterface{

    private final ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @Override
    public Optional<ScheduleEntity> findById(Integer scheduleId) {
        return scheduleService.getScheduleById(scheduleId);
    }

    @Override
    public ResponseEntity<List<ScheduleEntity>> create() {
        List<ScheduleEntity> scheduleEntity1 = scheduleService.createSchedule();

        return new ResponseEntity<>(scheduleEntity1, HttpStatus.OK);
    }

    @Override
    public void delete(Integer scheduleId) {
        scheduleService.deleteScheduleById(scheduleId);
    }
}
