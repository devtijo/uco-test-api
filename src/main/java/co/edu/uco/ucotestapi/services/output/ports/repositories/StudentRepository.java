package co.edu.uco.ucotestapi.services.output.ports.repositories;

import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.StudentEntity;

import java.util.UUID;

public interface StudentRepository
extends CreateRepository<StudentEntity>,UpdateRepository<UUID, StudentEntity>,
        DeleteRepository<UUID>, SearchRepository<UUID, StudentEntity> {


}
