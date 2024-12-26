package com.example.uitschedulecreator.repository;


import com.example.uitschedulecreator.entity.AvailabilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvailabilityRepository extends JpaRepository<AvailabilityEntity, Integer> {

    //@Query("SELECT s FROM PtStudentEntity s WHERE s.studentID = :studentId")
   // List<AvailabilityEntity> findByStudentId(@Param("studentId") String studentId);
    List<AvailabilityEntity> findByStudentId_StudentID(String studentID);


}