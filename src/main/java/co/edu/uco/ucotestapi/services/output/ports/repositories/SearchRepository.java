package co.edu.uco.ucotestapi.services.output.ports.repositories;

import java.util.List;

public interface SearchRepository<ID, E> {

    E searchById(ID id);
    List<E> searchAll();
    List<E> searchByFilter(E entity);

}
