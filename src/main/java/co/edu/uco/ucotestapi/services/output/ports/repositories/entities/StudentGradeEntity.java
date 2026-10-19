package co.edu.uco.ucotestapi.services.output.ports.repositories.entities;

import java.util.UUID;

public class StudentGradeEntity {
    private UUID id;
    private StudentGroupEntity student;
    private GradeEntity grade;
    private int value;
}
