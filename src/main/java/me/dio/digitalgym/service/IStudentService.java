package me.dio.digitalgym.service;

import me.dio.digitalgym.entity.PhysicalEvaluation;
import me.dio.digitalgym.entity.Student;
import me.dio.digitalgym.entity.form.StudentForm;
import me.dio.digitalgym.entity.form.StudentUpdateForm;

import java.util.List;

public interface IStudentService {

    Student create(StudentForm form);

    Student get(Long id);

    List<Student> getAll();

    Student update(Long id, StudentUpdateForm formUpdate);

    void delete(Long id);

    List<PhysicalEvaluation> getAllPhysicalEvaluationId(Long id);

}