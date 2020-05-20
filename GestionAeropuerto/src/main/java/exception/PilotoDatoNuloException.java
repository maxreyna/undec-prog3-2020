package exception;

public class PilotoDatoNuloException extends PilotoErroneoException{
    public PilotoDatoNuloException() {
        super("Ningun dato del piloto debe ser nulo");
    }
}
