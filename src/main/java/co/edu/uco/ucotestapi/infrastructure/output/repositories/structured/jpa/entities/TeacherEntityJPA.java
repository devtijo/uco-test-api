package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Teacher")
public class TeacherEntityJPA {
    private UUID id;
}
