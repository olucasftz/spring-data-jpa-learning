package me.dio.digitalgym.service.impl;

import me.dio.digitalgym.entity.PhysicalEvaluation;
import me.dio.digitalgym.entity.Student;
import me.dio.digitalgym.entity.form.PhysicalEvaluationForm;
import me.dio.digitalgym.entity.form.PhysicalEvaluationUpdateForm;
import me.dio.digitalgym.repository.PhysicalEvaluationRepository;
import me.dio.digitalgym.repository.StudentRepository;
import me.dio.digitalgym.service.IPhysicalEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalEvaluationServiceImpl implements IPhysicalEvaluationService {

    @Autowired
    private PhysicalEvaluationRepository physicalEvaluationRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public PhysicalEvaluation create(PhysicalEvaluationForm form) {
        PhysicalEvaluation physicalEvaluation = new PhysicalEvaluation();
        Student student = studentRepository.findById(form.getStudentId()).get(); //student exists, if not = exception
        physicalEvaluation.setStudent(student);
        physicalEvaluation.setWeight(form.getWeight());
        physicalEvaluation.setHeight(form.getHeight());
        return physicalEvaluationRepository.save(physicalEvaluation);
    }
    
    @Override
    public List<PhysicalEvaluation> getAll() {
        return null;
    }

}
