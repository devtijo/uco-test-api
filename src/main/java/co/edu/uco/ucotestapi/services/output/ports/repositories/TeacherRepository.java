package co.edu.uco.ucotestapi.services.output.ports.repositories;

import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.TeacherEntity;

import java.util.UUID;

public interface TeacherRepository extends CreateRepository<TeacherEntity>,UpdateRepository<UUID, TeacherEntity>,
        DeleteRepository<UUID>, SearchRepository<UUID, TeacherEntity>{
}
