package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentEntityJPA {
    private UUID id;
}
