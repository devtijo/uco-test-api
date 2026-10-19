package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa;

import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities.GradeEntityJPA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GradeJPARepository extends JpaRepository<GradeEntityJPA, UUID> {
}
