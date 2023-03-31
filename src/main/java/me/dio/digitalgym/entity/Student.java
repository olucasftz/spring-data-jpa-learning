package me.dio.digitalgym.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private Long id;
    private String name;
    private String cpf;
    private String neighborhood;
    private LocalDate birthDate;

    private List<PhysicalEvaluation> evaluations = new ArrayList<>();

}
