package gestor;

import dominio.Avion;

import java.util.ArrayList;
import java.util.List;

public class GestorAvion {
    static private GestorAvion ga;
    List<Avion> misAviones = new ArrayList<Avion>();

    private GestorAvion(ArrayList<Avion> arrayList){
        misAviones = arrayList;
    }

    static public GestorAvion getInstance(){
        if(ga == null){
            ga = new GestorAvion(new ArrayList<Avion>());
        }
        return ga;
    }

}
