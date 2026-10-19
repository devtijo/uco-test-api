package co.edu.uco.ucotestapi.services.usecases;

public interface UseCaseWithoutReturn<I>{
    void execute(I data);
}
