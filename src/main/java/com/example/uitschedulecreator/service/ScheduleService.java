package com.example.uitschedulecreator.service;

import com.example.uitschedulecreator.entity.AvailabilityEntity;
import com.example.uitschedulecreator.entity.PtStudentEntity;
import com.example.uitschedulecreator.entity.ScheduleEntity;
import com.example.uitschedulecreator.repository.AvailabilityRepository;
import com.example.uitschedulecreator.repository.PtStudentRepository;
import com.example.uitschedulecreator.repository.ScheduleRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.*;

@NoArgsConstructor
@Service
public class ScheduleService implements ScheduleServiceInterface{

    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private PtStudentRepository ptStudentRepository;

    @Autowired
    private AvailabilityRepository availabilityRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<ScheduleEntity> createSchedule() {

        LocalDate today = LocalDate.now();
        int week = today.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
        String weekValue = String.valueOf(week);
        List<PtStudentEntity> ptStudentEntities = ptStudentRepository.findAll();


        for (PtStudentEntity ptStudentEntity : ptStudentEntities) {
            List<AvailabilityEntity> availabilities = availabilityRepository.findByStudentId_StudentID(ptStudentEntity.getStudentID());
            Set<AvailabilityEntity> availabilitiesSet = new HashSet<>();
            availabilitiesSet.add(availabilities.get((int)(Math.random()*availabilities.size())));
            ScheduleEntity schedule = new ScheduleEntity(weekValue, availabilitiesSet);
            scheduleRepository.save(schedule);
        }

        return scheduleRepository.findAll();
    }

    @Override
    public void deleteScheduleById(Integer scheduleId) {
        scheduleRepository.deleteById(scheduleId);
    }

    @Override
    public Optional<ScheduleEntity> getScheduleById(int id) {
        return scheduleRepository.findById(id);
    }
}
