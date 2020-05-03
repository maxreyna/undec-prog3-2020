package dominio;

public class Persona {

	private String apellido;
	private String nombre;
	

	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		
		int i = 0;
		String [] cadena = nombre.split(" ");
		String nombreConFormato = "";
		
		for(i = 0;i<cadena.length;i++) 
			nombreConFormato += cadena[i].substring(0,1).toUpperCase()+cadena[i].substring(1).toLowerCase()+" ";
		
		return apellido.toUpperCase()+" "+nombreConFormato.substring(0, nombreConFormato.length()-1);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
