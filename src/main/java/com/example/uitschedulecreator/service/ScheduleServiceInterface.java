package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.ScheduleEntity;

import java.util.List;
import java.util.Optional;

public interface ScheduleServiceInterface {

    List<ScheduleEntity> createSchedule();
    void deleteScheduleById(Integer scheduleId);
    Optional<ScheduleEntity> getScheduleById(int id);

}
