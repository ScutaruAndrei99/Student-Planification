package com.andrei.studentPlanification.repository;

import com.andrei.studentPlanification.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    void deleteByName(String name);

}
