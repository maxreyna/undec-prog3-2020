package exception;

public class VueloDatoNuloException extends VueloErroneoException {
    public VueloDatoNuloException() {
        super("Ningun dato del vuelo debe ser nulo");
    }
}
