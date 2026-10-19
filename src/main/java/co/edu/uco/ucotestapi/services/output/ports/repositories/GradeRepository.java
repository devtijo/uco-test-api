package co.edu.uco.ucotestapi.services.output.ports.repositories;

import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.GradeEntity;
import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.TeacherEntity;

import java.util.UUID;

public interface GradeRepository
extends CreateRepository<GradeEntity>, UpdateRepository<UUID, GradeEntity>,
DeleteRepository<UUID>, SearchRepository<UUID, TeacherEntity> {
}

