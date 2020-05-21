package dominio;

import exception.AvionDatoNuloException;
import exception.AvionErroneoException;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Avion)) return false;
        Avion avion = (Avion) o;
        return Objects.equals(vehiculo, avion.vehiculo) &&
                Objects.equals(matricula, avion.matricula) &&
                Objects.equals(modelo, avion.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehiculo, matricula, modelo);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "vehiculo='" + vehiculo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
