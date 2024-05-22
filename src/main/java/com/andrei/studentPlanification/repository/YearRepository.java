package com.andrei.studentPlanification.repository;

import com.andrei.studentPlanification.model.Year;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearRepository extends JpaRepository<Year, Integer> {

}
