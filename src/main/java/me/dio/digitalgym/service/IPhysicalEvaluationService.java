package me.dio.digitalgym.service;

import me.dio.digitalgym.entity.PhysicalEvaluation;
import me.dio.digitalgym.entity.form.PhysicalEvaluationForm;
import me.dio.digitalgym.entity.form.PhysicalEvaluationUpdateForm;

import java.util.List;

public interface IPhysicalEvaluationService {

    PhysicalEvaluation create(PhysicalEvaluationForm form);

    PhysicalEvaluation get(Long id);

    List<PhysicalEvaluation> getAll();

    PhysicalEvaluation update(Long id, PhysicalEvaluationUpdateForm FormUpdate);

    void delete(Long id);
}
