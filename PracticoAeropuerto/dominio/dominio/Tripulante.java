package dominio;

public class Tripulante extends Persona{

	private Rol cargo;

	//Metodos
	public Tripulante(String apellido, String nombre,Rol cargo) {
		super(apellido, nombre);
		this.cargo = cargo;
	}

	public Rol getCargo() {
		return cargo;
	}

	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj) == false)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " -> " + cargo;
	}

	

	
}
