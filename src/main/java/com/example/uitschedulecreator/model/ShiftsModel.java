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

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "SHIFT")
public class ShiftsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer shiftId;

    private String shiftDescription;

    private Double hours;

    //One shift can have may availablilies
    @OneToMany(mappedBy = "shiftId")
    private Set<AvailabilityModel> availabilities;

}
