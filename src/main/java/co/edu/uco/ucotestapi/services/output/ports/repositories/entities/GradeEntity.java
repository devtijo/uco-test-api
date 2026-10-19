package co.edu.uco.ucotestapi.services.output.ports.repositories.entities;

import java.time.Instant;
import java.util.UUID;

public class GradeEntity {
    private UUID id;
    private GroupEntity group;
    private Instant RegistrationDateFrom;
    private Instant RegistrationDateUntil;
}
