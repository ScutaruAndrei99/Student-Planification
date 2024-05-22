package com.andrei.studentPlanification.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private int id_student;

    private String name;

    private int group_id;

    private int year_id;

    private double grade;

    private int subjects_id;
}
