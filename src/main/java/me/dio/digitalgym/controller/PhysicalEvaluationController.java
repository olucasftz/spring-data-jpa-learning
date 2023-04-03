package me.dio.digitalgym.controller;

import me.dio.digitalgym.entity.PhysicalEvaluation;
import me.dio.digitalgym.entity.form.PhysicalEvaluationForm;
import me.dio.digitalgym.service.impl.PhysicalEvaluationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluations")
public class PhysicalEvaluationController {

    @Autowired
    private PhysicalEvaluationServiceImpl service;


    @PostMapping
    public PhysicalEvaluation create(@RequestBody PhysicalEvaluationForm form) {
        return service.create(form);
    }
}
