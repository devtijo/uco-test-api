package co.edu.uco.ucotestapi.infrastructure.output.repositories.structured.jpa.entities;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "Group")
public class GroupEntityJPA {
    @Id
    @Column(name = "id")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "id")
    private TeacherEntityJPA teacher;
}
