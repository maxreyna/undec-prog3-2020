package dominio;

import exception.PilotoErroneoException;
import exception.PilotoDatoNuloException;

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
}
