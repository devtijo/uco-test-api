package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa;

import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities.GroupEntityJPA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroupJPARepository extends JpaRepository<GroupEntityJPA, UUID> {
}
