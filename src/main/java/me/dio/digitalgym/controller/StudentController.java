package me.dio.digitalgym.controller;


import me.dio.digitalgym.entity.PhysicalEvaluation;
import me.dio.digitalgym.entity.Student;
import me.dio.digitalgym.entity.form.StudentForm;
import me.dio.digitalgym.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl service;

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Student create(@RequestBody StudentForm form) {
        return service.create(form);
    }

    @GetMapping("evaluations/{id}")
    public List<PhysicalEvaluation> getAllPhysicalEvaluationId(@PathVariable Long id) {
        return service.getAllPhysicalEvaluationId(id);
    }


}
