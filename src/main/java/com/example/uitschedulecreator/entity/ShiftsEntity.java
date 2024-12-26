package com.example.uitschedulecreator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "SHIFT")
public class ShiftsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shiftId")
    private Integer shiftId;

    @Column(name = "shiftDescription")
    private String shiftDescription;

    @Column(name = "hours")
    private Double hours;

    //One shift can have may availablilies
    @OneToMany(mappedBy = "shiftId")
    private Set<AvailabilityEntity> availabilities;

}
