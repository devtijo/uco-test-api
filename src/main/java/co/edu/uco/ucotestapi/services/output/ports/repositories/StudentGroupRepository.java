package co.edu.uco.ucotestapi.services.output.ports.repositories;

import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.StudentGroupEntity;

import java.util.UUID;

public interface StudentGroupRepository extends CreateRepository<StudentGroupEntity>,UpdateRepository<UUID, StudentGroupEntity>,
        DeleteRepository<UUID>, SearchRepository<UUID, StudentGroupEntity>{
}
