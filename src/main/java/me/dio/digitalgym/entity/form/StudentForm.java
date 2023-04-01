package me.dio.digitalgym.entity.form;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class StudentForm {
    private String name;
    private String cpf;
    private String neighborhood;
    private LocalDate birthDate;
}
