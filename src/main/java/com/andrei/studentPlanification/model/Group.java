package com.andrei.studentPlanification.model;

import lombok.*;
import jakarta.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_group")
    private int id_group;

    @Column(name = "name")
    private String name;
}

