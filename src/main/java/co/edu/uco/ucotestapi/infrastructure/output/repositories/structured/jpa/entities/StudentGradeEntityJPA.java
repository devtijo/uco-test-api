package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GradeStudent")
public class StudentGradeEntityJPA {
    @Id
    @Column(name = "id")
    private UUID id;
    private StudentGroupEntityJPA student;
    private GradeEntityJPA grade;
    private int value;
}
