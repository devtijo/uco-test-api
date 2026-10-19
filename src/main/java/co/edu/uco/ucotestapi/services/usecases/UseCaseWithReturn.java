package co.edu.uco.ucotestapi.services.usecases;

public interface UseCaseWithReturn <I, O> {
    O execute(I data);
}
