package gestor;

import dominio.Vuelo;

import java.util.ArrayList;


public class GestorVuelo {
    ArrayList<Vuelo> misVuelos;
    static private GestorVuelo gv;

    private GestorVuelo(ArrayList<Vuelo> arrayList){
        this.misVuelos = arrayList;
    }

    static public GestorVuelo getInstance(){
        if(gv == null){
            gv = new GestorVuelo(new ArrayList<Vuelo>());
        }
        return gv;
    }

    public boolean addVuelo(Vuelo datoVuelo){
        misVuelos.add(datoVuelo);
        return true;
    }

}
