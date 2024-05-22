package com.andrei.studentPlanification.model;

import lombok.*;
import jakarta.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "subjects", schema = "public")
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subject")
    private int idSubject;

    @Column(name = "name_subject")
    private String nameSubject;

    @Column(name = "year_id")
    private int yearId;

}

