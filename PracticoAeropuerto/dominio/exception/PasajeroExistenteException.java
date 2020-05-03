package exception;

@SuppressWarnings("serial")
public class PasajeroExistenteException extends PasajeroMalFormadoException {

	public PasajeroExistenteException(String msg) {
		super(msg);
	}
}
