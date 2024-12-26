package com.example.uitschedulecreator.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "AVAILABILITY")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AvailabilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "availabilityId")
    private Integer availabilityId;

    //Many availabilities belong to One student
    //One availablity row beongs to one student
    @ManyToOne
    @JoinColumn(name = "studentId") //The join happence between Id col in PtStudent model and studentId in AvailabilityModel
    private PtStudentEntity studentId;

    @ManyToOne
    @JoinColumn(name = "shiftId")
    private ShiftsEntity shiftId;

    //One available row belongs to 1 row in schedule table
    @ManyToOne
    @JoinColumn(name = "scheduleId", nullable = true)
    private DailyScheduleEntity scheduleId;

}
