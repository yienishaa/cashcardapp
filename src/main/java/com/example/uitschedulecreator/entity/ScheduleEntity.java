package com.example.uitschedulecreator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * This table holds info on which student is scheduled at which shift
 * each row = a specific shift of the day and a specific student
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "SCHEDULE")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scheduleId")
    private Integer scheduleId;

    @Column(name = "weekId")
    private String weekId;

    // One scheduled shift can match several rows in availability table
    @OneToMany(mappedBy = "scheduleId")
    private Set<AvailabilityEntity> availabilityEntity;

    public ScheduleEntity(String weekId, Set<AvailabilityEntity> availabilityEntity) {
        this.weekId = weekId;
        this.availabilityEntity = availabilityEntity;
    }

}
