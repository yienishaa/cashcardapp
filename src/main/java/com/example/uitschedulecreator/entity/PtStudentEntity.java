package com.example.uitschedulecreator.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity //This annotation is to tell this class corresponds to a table in a DB
@Table(name = "PTSTUDENTS")
public class PtStudentEntity {

    @Id //To mention this is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "studentID" , unique = true)
    private String studentID;

    @Column(name = "name")
    private String name;

    @JsonProperty("phone_number") //This is to map the JSON key to the table column. So JSON key = course_number, and Table col = coursenum
    @Column(name = "phone")
    private String phone;

    @Column(name = "hoursAllowed") //This is to tell the variable coresponds to a column in the table, if the name is different set name with @Column(name = "column_name")
    @JsonProperty("hours_allowed")//This is to map the JSON key to the table column. So JSON key = hours_allowed, and Table col = hoursAllowed
    private Double hoursAllowed;

    @OneToMany(mappedBy = "studentId") //One student has Many availabilities, mappedBy='studentId' means in the AvailabilityModel class studentId is the foreign key
    @JsonIgnore
    private Set<AvailabilityEntity> availabilities;

}
