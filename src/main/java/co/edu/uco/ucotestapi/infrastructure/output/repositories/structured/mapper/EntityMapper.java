package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.mapper;

import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities.StudentEntityJPA;
import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.StudentEntity;

public interface EntityMapper <E, JPA> {
    E convertToEntity(JPA entityJPA);
    JPA convertToEntityJPA(E entity);

    StudentEntityJPA convertToEntityJPA(StudentEntity entity);
}
