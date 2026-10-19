package co.edu.uco.ucotestapi.services.output.ports.repositories;

public interface UpdateRepository <ID, E> {
    void update(ID id, E entity);
}
