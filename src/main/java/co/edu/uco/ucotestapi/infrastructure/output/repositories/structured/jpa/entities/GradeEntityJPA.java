package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "GradeEntity")
public class GradeEntityJPA {
    private UUID id;
    private GroupEntityJPA group;
    private Instant RegistrationDateFrom;
    private Instant RegistrationDateUntil;
}
