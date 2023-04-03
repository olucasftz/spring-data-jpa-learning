package me.dio.digitalgym.service;

import me.dio.digitalgym.entity.Registration;
import me.dio.digitalgym.entity.form.RegistrationForm;

import java.util.List;

public interface IRegistrationService {

    Registration create(RegistrationForm form);

    List<Registration> getAll (String neighborhood);
}
