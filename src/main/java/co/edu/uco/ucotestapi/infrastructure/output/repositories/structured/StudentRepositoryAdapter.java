package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured;

import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.StudentJPARepository;
import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities.StudentEntityJPA;
import co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.mapper.EntityMapper;
import co.edu.uco.ucotestapi.services.output.ports.repositories.StudentRepository;
import co.edu.uco.ucotestapi.services.output.ports.repositories.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class StudentRepositoryAdapter implements StudentRepository {

    private StudentJPARepository repository;
    private EntityMapper<StudentEntity, StudentEntityJPA> mapper;


    public StudentRepositoryAdapter(StudentJPARepository repository, EntityMapper<StudentEntity, StudentEntityJPA> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void create(StudentEntity entity) {
        var entityJPA = mapper.convertToEntityJPA(entity);
        repository.save(entityJPA);

    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public StudentEntity searchById(UUID uuid) {
        return null;
    }

    @Override
    public List<StudentEntity> searchAll() {
        return List.of();
    }

    @Override
    public List<StudentEntity> searchByFilter(StudentEntity entity) {
        return List.of();
    }

    @Override
    public void update(UUID uuid, StudentEntity entity) {

    }
}
