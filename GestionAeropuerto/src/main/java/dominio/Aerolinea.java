package dominio;

import exception.AerolineaDatoNuloException;
import exception.AerolineaErroneaException;

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
}
