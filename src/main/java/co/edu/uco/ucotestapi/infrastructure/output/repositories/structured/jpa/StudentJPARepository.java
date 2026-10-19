package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa;

import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities.StudentEntityJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentJPARepository extends JpaRepository<StudentEntityJPA, UUID> {
}
