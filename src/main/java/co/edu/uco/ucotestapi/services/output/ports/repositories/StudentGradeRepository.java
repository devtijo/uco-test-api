package co.edu.uco.ucotestapi.services.output.ports.repositories;

import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.StudentGradeEntity;
import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.StudentEntity;

import java.util.UUID;

public interface StudentGradeRepository
        extends CreateRepository<StudentGradeEntity>,UpdateRepository<UUID, StudentEntity>,
        DeleteRepository<UUID>, SearchRepository<UUID, StudentGradeEntity> {
}

