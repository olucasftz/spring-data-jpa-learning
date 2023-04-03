package me.dio.digitalgym.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationForm {

    @NotNull(message = "Fill out the field correctly.")
    @Positive(message = "the student's id need be positive")
    private Long studentID;
}
