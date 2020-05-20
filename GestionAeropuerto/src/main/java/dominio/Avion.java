package dominio;

import exception.AvionDatoNuloException;
import exception.AvionErroneoException;

public class Avion {
    private String vehiculo;
    private String matricula;
    private String modelo;

    public Avion(String vehiculo, String matricula, String modelo) throws AvionErroneoException {
        if (vehiculo == null || matricula == null || modelo == null){
            throw new AvionDatoNuloException();
        }else {
            this.vehiculo = vehiculo;
            this.matricula = matricula;
            this.modelo = modelo;
        }
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
