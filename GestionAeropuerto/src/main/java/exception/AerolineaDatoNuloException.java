package exception;

public class AerolineaDatoNuloException extends AerolineaErroneaException {
    public AerolineaDatoNuloException() {
        super("Ningun dato de la aerolinea debe ser nulo");
    }
}
