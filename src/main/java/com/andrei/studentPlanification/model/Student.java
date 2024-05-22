package com.andrei.studentPlanification.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "students", schema = "public")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private int idStudent;

    @Column(name = "name")
    private String name;

    @Column(name = "group_id")
    private int groupId;

    @Column(name = "year_id")
    private int yearId;

    @Column(name = "grade")
    private double grade;

    @Column(name = "subject_id")
    private int subjectsId;

}

