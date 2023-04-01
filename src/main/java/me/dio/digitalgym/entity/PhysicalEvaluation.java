package me.dio.digitalgym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_evaluations")
public class PhysicalEvaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;
    private LocalDate evaluationDate = LocalDate.now();

    @Column(name = "weight_current")
    private double weight;

    @Column(name = "height_current")
    private double height;

}
