package com.andrei.studentPlanification.dto;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupDto {

    private int id_group;

    private String name;
}
