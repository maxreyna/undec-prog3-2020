package dominio;

import exception.PilotoErroneoException;
import exception.PilotoDatoNuloException;

import java.util.Objects;

public class Piloto {
    private String nombre;
    private String apellido;
    private String cuil;
    private String legajo;
    private Rol miRol;

    public Piloto(String nombre, String apellido, String cuil, String legajo, Rol miRol) throws PilotoErroneoException {
        if(nombre == null || apellido == null || cuil == null || legajo == null){
            throw new PilotoDatoNuloException();
        }else {
            this.nombre = nombre;
            this.apellido = apellido;
            this.cuil = cuil;
            this.legajo = legajo;
            this.miRol = miRol;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Rol getMiRol() {
        return miRol;
    }

    public void setMiRol(Rol miRol) {
        this.miRol = miRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piloto)) return false;
        Piloto piloto = (Piloto) o;
        return Objects.equals(nombre, piloto.nombre) &&
                Objects.equals(apellido, piloto.apellido) &&
                Objects.equals(cuil, piloto.cuil) &&
                Objects.equals(legajo, piloto.legajo) &&
                miRol == piloto.miRol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, cuil, legajo, miRol);
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuil='" + cuil + '\'' +
                ", legajo='" + legajo + '\'' +
                ", miRol=" + miRol +
                '}';
    }
}
