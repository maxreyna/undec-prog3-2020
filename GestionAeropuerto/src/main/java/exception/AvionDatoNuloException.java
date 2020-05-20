package exception;

public class AvionDatoNuloException extends AvionErroneoException{
    public AvionDatoNuloException() {
        super("Ningun dato del avion debe ser nulo");
    }
}
