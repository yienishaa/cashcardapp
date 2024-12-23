package com.example.uitschedulecreator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
@Entity //This annotation is to tell this class corresponds to a table in a DB
@Table(name = "PTSTUDENTS")
public class PtStudentModel {

    @Id //To mention this is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private String name;

    @JsonProperty("phone_number") //This is to map the JSON key to the table column. So JSON key = course_number, and Table col = coursenum
    private String phone;

    @Column //This is to tell the variable coresponds to a column in the table, if the name is different set name with @Column(name = "column_name")
    //@JsonProperty("hours_allowed")//This is to map the JSON key to the table column. So JSON key = hours_allowed, and Table col = hoursAllowed
    private Double hoursAllowed;

    @OneToMany(mappedBy = "studentId") //One student has Many availabilities, mappedBy='studentId' means in the AvailabilityModel class studentId is the foreign key
    private Set<AvailabilityModel> availabilities;

}
