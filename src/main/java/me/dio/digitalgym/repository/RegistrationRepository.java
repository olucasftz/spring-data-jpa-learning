package me.dio.digitalgym.repository;

import me.dio.digitalgym.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    @Query(value = "SELECT * FROM tb_registrations m " +
            "INNER JOIN tb_students a ON m.student_id = a.id " +
            "WHERE a.neighborhood = :neighborhood", nativeQuery = true)

    List<Registration> findStudentRegistrationNeighborHood(String neighborhood);
}
