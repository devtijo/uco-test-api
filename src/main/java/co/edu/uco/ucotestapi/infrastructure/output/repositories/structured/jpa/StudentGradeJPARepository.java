package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa;

import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities.StudentGradeEntityJPA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentGradeJPARepository extends JpaRepository<StudentGradeEntityJPA, UUID> {
}
