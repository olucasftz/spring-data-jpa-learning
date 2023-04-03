package me.dio.digitalgym.entity.form;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class StudentForm {

    @NotEmpty(message = "Fill out the field correctly.")
    @Size(min = 3, max =50, message = "'${validatedValue}' must be between {min} and {max} characters.")
    private String name;

    @NotEmpty(message = "Fill out the field correctly.")
    private String cpf;

    @NotEmpty(message = "Fill out the field correctly.")
    @Size(min = 3, max =50, message = "'${validatedValue}' must be between {min} and {max} characters.")
    private String neighborhood;

    @NotNull(message = "Fill out the field correctly.")
    @Past(message = "Data '${validatedValue}' its invalid.")
    private LocalDate birthDate;
}
