package co.edu.uco.ucotestapi.domain.gradestudent.registerstudentgrade;

import co.edu.uco.ucotestapi.services.output.ports.repositories.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class GradeDomain {
    private UUID id;
    private StudentRepository studentRepository;

    public GradeDomain(UUID id, StudentRepository studentRepository) {
        this.id = id;
        this.studentRepository = studentRepository;
        validateStudentExists();
        validateStudentIsActive();
    }

    private void validateStudentExists(){
        //Ojo a esta comparación con nulo!!!!
        if(studentRepository.searchById(id) == null){
            //Reporto problema de que no existe
        }
    }

    private void validateStudentIsActive(){

    }
}
