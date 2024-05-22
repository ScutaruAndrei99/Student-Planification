package com.andrei.studentPlanification.repository;

import com.andrei.studentPlanification.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

}
