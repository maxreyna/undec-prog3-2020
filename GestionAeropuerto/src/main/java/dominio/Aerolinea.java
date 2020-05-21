package dominio;

import exception.AerolineaDatoNuloException;
import exception.AerolineaErroneaException;

import java.util.Objects;

public class Aerolinea {
    private String nombre;
    private String fechaDeInicio;
    private String cuit;

    public Aerolinea(String nombre, String fechaDeInicio,String cuit)throws AerolineaErroneaException {
        if(nombre == null || fechaDeInicio == null || cuit == null){
            throw new AerolineaDatoNuloException();
        }else {
            this.nombre = nombre;
            this.fechaDeInicio = fechaDeInicio;
            this.cuit = cuit;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aerolinea)) return false;
        Aerolinea aerolinea = (Aerolinea) o;
        return Objects.equals(nombre, aerolinea.nombre) &&
                Objects.equals(fechaDeInicio, aerolinea.fechaDeInicio) &&
                Objects.equals(cuit, aerolinea.cuit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaDeInicio, cuit);
    }

    @Override
    public String toString() {
        return "Aerolinea{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeInicio='" + fechaDeInicio + '\'' +
                ", cuit='" + cuit + '\'' +
                '}';
    }
}
