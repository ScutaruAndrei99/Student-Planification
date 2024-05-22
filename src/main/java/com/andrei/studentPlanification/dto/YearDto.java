package com.andrei.studentPlanification.dto;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class YearDto {

    private int id_year;

    private String cycle;

    private int academic_year;

    private int semester;

}
