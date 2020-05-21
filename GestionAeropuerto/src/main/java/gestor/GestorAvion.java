package gestor;

import dominio.Avion;

import java.util.ArrayList;
import java.util.List;

public class GestorAvion {
    static private GestorAvion ga;
    List<Avion> misAviones;

    private GestorAvion(){
        misAviones = new ArrayList<Avion>();
    }

    static public GestorAvion getInstance(){
        if(ga == null){
            ga = new GestorAvion();
        }
        return ga;
    }


    public boolean addAvion(Avion a1) {
        return misAviones.add(a1);
    }

    public int getCantidadDeAviones(){
        return misAviones.size();
    }

    public boolean eliminarAvion(Avion a1) {
        for (int i=0 ; i<misAviones.size() ; ++i){
            if(misAviones.get(i).equals(a1)){
                return misAviones.remove(misAviones.get(i));
            }
        }
        return false;
    }

    public String buscarAvion(String vehiculo) {
        for (int i=0 ; i<misAviones.size() ; ++i){
            if(misAviones.get(i).getVehiculo().equals(vehiculo)){
                return misAviones.get(i).toString();
            }
        }
        return "No se encontraron resultados del avion buscado";
    }

    public boolean actualizarAvion(Avion a1, Avion a2) {
        for (int i=0 ; i<misAviones.size() ; ++i){
            if(misAviones.get(i).equals(a1)){
                eliminarAvion(misAviones.get(i));
                return addAvion(a2);
            }
        }
        return false;
    }

    public void clear() {
        misAviones=new ArrayList<Avion>();
    }
}
