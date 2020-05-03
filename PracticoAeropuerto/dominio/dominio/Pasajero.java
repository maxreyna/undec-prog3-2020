package dominio;

public class Pasajero extends Persona{

	private String visa;
	
	
	public Pasajero(String apellido, String nombre, String visa) {
		super(apellido, nombre);
		this.visa=visa;
	}
	


	@Override
	public String toString() {
		return super.toString()+" - "+visa;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((visa == null) ? 0 : visa.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajero other = (Pasajero) obj;
		if (visa == null) {
			if (other.visa != null)
				return false;
		} else if (!visa.equals(other.visa))
			return false;
		return true;
	}
	

}
