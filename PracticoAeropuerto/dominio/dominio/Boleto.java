package dominio;

public class Boleto {
	private String ciudadOrigen;
	private String ciudadDestino;
	private String fila;
	private String asiento;

	
	public Boleto(String origen, String destino, String fila, String asiento) {
		this.ciudadOrigen = origen;
		this.ciudadDestino = destino;
		this.fila = fila;
		this.asiento = asiento;
	}
	
	
	public  String  GetBoleto() {
		return"Boleto [origen=" + ciudadOrigen + ", destino=" + ciudadDestino + ", fila=" + fila + ", asiento=" + asiento + "]" ;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asiento == null) ? 0 : asiento.hashCode());
		result = prime * result + ((ciudadDestino == null) ? 0 : ciudadDestino.hashCode());
		result = prime * result + ((ciudadOrigen == null) ? 0 : ciudadOrigen.hashCode());
		result = prime * result + ((fila == null) ? 0 : fila.hashCode());
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
		Boleto other = (Boleto) obj;
		if (asiento == null) {
			if (other.asiento != null)
				return false;
		} else if (!asiento.equals(other.asiento))
			return false;
		if (ciudadDestino == null) {
			if (other.ciudadDestino != null)
				return false;
		} else if (!ciudadDestino.equals(other.ciudadDestino))
			return false;
		if (ciudadOrigen == null) {
			if (other.ciudadOrigen != null)
				return false;
		} else if (!ciudadOrigen.equals(other.ciudadOrigen))
			return false;
		if (fila == null) {
			if (other.fila != null)
				return false;
		} else if (!fila.equals(other.fila))
			return false;
		return true;
	}


}
