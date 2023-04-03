package me.dio.digitalgym.service.impl;

import me.dio.digitalgym.entity.Registration;
import me.dio.digitalgym.entity.Student;
import me.dio.digitalgym.entity.form.RegistrationForm;
import me.dio.digitalgym.repository.RegistrationRepository;
import me.dio.digitalgym.repository.StudentRepository;
import me.dio.digitalgym.service.IRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements IRegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Registration create(RegistrationForm form) {
        Registration registration = new Registration();
        Student student = studentRepository.findById(form.getStudentID()).get();

        registration.setStudent(student);

        return registrationRepository.save(registration);
    }

    @Override
    public Registration get(Long id) {
        return null;
    }

    @Override
    public List<Registration> getAll(String neighborhood) {

        if(neighborhood == null){
            return registrationRepository.findAll();
        } else{
            return registrationRepository.findStudentRegistrationNeighborHood(neighborhood);
        }
    }

    @Override
    public void delete(Long id) {

    }
}
