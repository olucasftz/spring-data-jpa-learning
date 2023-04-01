package me.dio.digitalgym.service.impl;

import me.dio.digitalgym.entity.PhysicalEvaluation;
import me.dio.digitalgym.entity.Student;
import me.dio.digitalgym.entity.form.StudentForm;
import me.dio.digitalgym.entity.form.StudentUpdateForm;
import me.dio.digitalgym.repository.StudentRepository;
import me.dio.digitalgym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(StudentForm form) {

        Student student = new Student();
        student.setName(form.getName());
        student.setCpf(form.getCpf());
        student.setNeighborhood(form.getNeighborhood());
        student.setBirthDate(form.getBirthDate());
        return repository.save(student);
    }

    @Override
    public Student get(Long id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Student update(Long id, StudentUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PhysicalEvaluation> getAllPhysicalEvaluationId(Long id) {
        return null;
    }
}
