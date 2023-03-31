package me.dio.digitalgym.entity;

import java.time.LocalDate;

public class PhysicalEvaluation {

    private Long id;
    private Student student;
    private LocalDate evaluationDate = LocalDate.now();

    private double weight;
    private double height;

}
