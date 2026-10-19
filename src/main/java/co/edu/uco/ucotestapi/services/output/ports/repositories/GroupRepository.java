package co.edu.uco.ucotestapi.services.output.ports.repositories;

import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.GroupEntity;

import java.util.UUID;

public interface GroupRepository
        extends CreateRepository<GroupEntity>,UpdateRepository<UUID, GroupEntity>,
        DeleteRepository<UUID>, SearchRepository<UUID, GroupEntity>{
}
