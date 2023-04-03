package me.dio.digitalgym.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalEvaluationForm {
    private Long studentId;
    private double weight;
    private double height;

}
