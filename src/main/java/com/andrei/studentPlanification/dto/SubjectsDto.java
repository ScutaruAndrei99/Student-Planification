package com.andrei.studentPlanification.dto;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubjectsDto {

    private int id_subjects;

    private String name_subjects;

    private int year_id;

}
