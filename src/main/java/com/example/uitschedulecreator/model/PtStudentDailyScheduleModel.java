package com.example.uitschedulecreator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/**
 * This table holds info on which student is scheduled at which shift
 * each row = a specific shift of the day and a specific student
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "SCHEDULE")
public class PtStudentDailyScheduleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleId;

    private String day_of_week;

    // One scheduled shift can match several rows in availability table
    @OneToMany(mappedBy = "scheduleId")
    private Set<AvailabilityModel> availability;

}
