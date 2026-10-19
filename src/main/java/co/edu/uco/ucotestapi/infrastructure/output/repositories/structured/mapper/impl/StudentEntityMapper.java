package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.mapper.impl;

import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities.StudentEntityJPA;
import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.mapper.EntityMapper;
import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.StudentEntity;
import org.springframework.stereotype.Component;

@Component
public class StudentEntityMapper implements EntityMapper <StudentEntity, StudentEntityJPA> {
    @Override
    public StudentEntity convertToEntity(StudentEntityJPA entityJPA) {
        //TODO Use DataMapper orMapStruct
        return null;
    }

    @Override
    public StudentEntityJPA convertToEntityJPA(StudentEntity entity) {
        return null;
    }
}