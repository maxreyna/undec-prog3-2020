package dominio;

public class Pasajero extends Persona{

	private int asiento;
	private String fila;
	
	
	public Pasajero(String apellido, String nombre) {
		super(apellido, nombre);
		this.asiento = 0;
		this.fila = "";
	}
	
	public Pasajero(String apellido, String nombre,int asiento,String fila) {
		super(apellido, nombre);
		this.asiento = asiento;
		this.fila = fila;
	}

	public int getAsiento() {
		return asiento;
	}


	public String getFila() {
		return fila;
	}

	@Override
	public String toString() {
		return super.toString()+" - "+asiento+fila;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + asiento;
		result = prime * result + ((fila == null) ? 0 : fila.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj) == false)
			return false;
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajero other = (Pasajero) obj;
		if (asiento != other.asiento)
			return false;
		if (fila == null) {
			if (other.fila != null)
				return false;
		} else if (!fila.equals(other.fila))
			return false;
		return true;
	}

	
	
	
	
	
	

}
