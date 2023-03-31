package me.dio.digitalgym.service;

import me.dio.digitalgym.entity.Registration;
import me.dio.digitalgym.entity.form.RegistrationForm;

import java.util.List;

public interface IRegistrationService {

    Registration create(RegistrationForm form);

    Registration get(Long id);

    List<Registration> getAll (String neighborhood);

    void delete(Long id);
}
