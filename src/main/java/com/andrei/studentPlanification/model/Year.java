package com.andrei.studentPlanification.model;

import lombok.*;
import jakarta.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "years")
public class Year {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_year")
    private int id_year;

    @Column(name = "cycle")
    private String cycle;

    @Column(name = "academic_year")
    private int academic_year;

    @Column(name = "semester")
    private int semester;

}
