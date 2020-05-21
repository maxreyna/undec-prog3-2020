package gestor;


import dominio.Vuelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class GestorVuelo {
    static private GestorVuelo gv;
    List<Vuelo> misVuelos ;

    private GestorVuelo(){
        this.misVuelos = new ArrayList<Vuelo>();
    }

    static public GestorVuelo getInstance(){
        if(gv == null){
            gv = new GestorVuelo();
        }
        return gv;
    }

    public boolean addVuelo(Vuelo datoVuelo){
        return misVuelos.add(datoVuelo);
    }

    public boolean eliminarVuelo(Vuelo v1) {
        for(int i=0 ; i<misVuelos.size() ; ++i){
            if (misVuelos.get(i).equals(v1)){
                return misVuelos.remove(misVuelos.get(i));
            }
        }
        return false;
    }

    public void mostrarArray(List<Vuelo> data){
        int i;
        for (i=0 ; i<+data.size() ; ++i)
            System.out.println(data.get(i));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestorVuelo that = (GestorVuelo) o;
        return Objects.equals(misVuelos, that.misVuelos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(misVuelos);
    }


    public String buscarPorCodigo(String codigoDeVuelo) {
        for(int i=0 ; i<misVuelos.size() ; ++i){
            if (misVuelos.get(i).getCodigoDeVuelo().equals(codigoDeVuelo)){
                return misVuelos.get(i).toString();
            }
        }
        return "Vuelo no encontrado";
    }

    public ArrayList<Vuelo> buscarVueloPorFechaDeSalida(String fechaDeSalida) {
        ArrayList<Vuelo> vuelosMismoHorarioDeSalida = new ArrayList<>();

        for(int i=0 ; i<misVuelos.size() ; ++i){
            if (misVuelos.get(i).getFechaDeSalida().equals(fechaDeSalida)){
                vuelosMismoHorarioDeSalida.add(misVuelos.get(i));
            }
        }
        return vuelosMismoHorarioDeSalida;
    }

    public boolean cambiarFechaDeSalidaYLlegada(Vuelo v1, String nuevaFechaDeSalida, String nuevaFechaDeLlegada) {
        for(int i=0 ; i<misVuelos.size() ; ++i){
            if (misVuelos.get(i).equals(v1)){
                misVuelos.get(i).setFechaDeSalida(nuevaFechaDeSalida);
                misVuelos.get(i).setFechaDeLlegada(nuevaFechaDeLlegada);
                return true;
            }
        }
        return false;
    }
}
