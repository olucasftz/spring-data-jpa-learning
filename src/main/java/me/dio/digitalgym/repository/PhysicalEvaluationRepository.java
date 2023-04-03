package me.dio.digitalgym.repository;

import me.dio.digitalgym.entity.PhysicalEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalEvaluationRepository extends JpaRepository<PhysicalEvaluation, Long> {

}
