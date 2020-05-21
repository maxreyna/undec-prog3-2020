package test;

import dominio.Aerolinea;
import dominio.Vuelo;
import exception.AerolineaErroneaException;
import exception.AvionErroneoException;
import exception.VueloDatoNuloException;
import gestor.GestorVuelo;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GestorVueloTest {

    @Test
    @Order(1)
    void test01GestorVuelo_getInstance() {
        GestorVuelo gv = GestorVuelo.getInstance();
        GestorVuelo gv2 = GestorVuelo.getInstance();
        assertEquals(true,gv.equals(gv2));
    }
    @Order(2)
    @Test
    void test02GestorVueloAddVuelo() throws VueloDatoNuloException, AvionErroneoException, AerolineaErroneaException {
        GestorVuelo gv = GestorVuelo.getInstance();
        Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
        Vuelo v1 = new Vuelo("01/01/2020","01/01/2020","14:00","16:00","LT4186",al1);

        assertEquals(true,gv.addVuelo(v1));

    }
    @Order(3)
    @Test
    void test03GestorVueloEliminarVuelo() throws VueloDatoNuloException, AvionErroneoException, AerolineaErroneaException {
        GestorVuelo gv = GestorVuelo.getInstance();
        Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
        Vuelo v1 = new Vuelo("01/01/2020","01/01/2020","14:00","16:00","LT4186",al1);

        assertEquals(true,gv.addVuelo(v1));
        assertEquals(true,gv.eliminarVuelo(v1));

    }
    @Order(4)
    @Test
    void test04GestorVueloBuscarVueloPorCodigo() throws VueloDatoNuloException, AvionErroneoException, AerolineaErroneaException {
        GestorVuelo gv = GestorVuelo.getInstance();
        Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
        Vuelo v1 = new Vuelo("01/01/2020","01/01/2020","14:00","16:00","LT4186",al1);

        assertEquals("Vuelo no encontrado",gv.buscarPorCodigo("LT5186"));
        assertEquals(true,gv.addVuelo(v1));

        assertEquals(v1.toString(),gv.buscarPorCodigo("LT4186"));


    }
    @Order(5)
    @Test
    void test05GestorVueloBuscarVueloPorFechaDeSalida() throws VueloDatoNuloException, AvionErroneoException, AerolineaErroneaException {
        GestorVuelo gv = GestorVuelo.getInstance();
        Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
        Vuelo v1 = new Vuelo("02/01/2020","02/01/2020","14:00","16:00","LT4186",al1);

        Aerolinea al2 = new Aerolinea("AEROLINEAS ARGENTINAS","11/07/2002","28-34567887-9");
        Vuelo v2 = new Vuelo("02/01/2020","02/01/2020","14:00","18:00","LT5186",al2);

        gv.addVuelo(v1);
        gv.addVuelo(v2);

        ArrayList<Vuelo> vuelosMismoHorarioDeSalida =  gv.buscarVueloPorFechaDeSalida("02/01/2020");

        assertEquals(v1.toString(),vuelosMismoHorarioDeSalida.get(0).toString());
        assertEquals(v2.toString(),vuelosMismoHorarioDeSalida.get(1).toString());

    }
    @Order(6)
    @Test
    void test06GestorVueloCambiarFechaDeSalidaYLlegada() throws VueloDatoNuloException, AvionErroneoException, AerolineaErroneaException {
        GestorVuelo gv = GestorVuelo.getInstance();
        Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
        Vuelo v1 = new Vuelo("01/01/2020","01/01/2020","14:00","16:00","LT4186",al1);

        assertEquals(true,gv.addVuelo(v1));
        assertEquals(true,gv.cambiarFechaDeSalidaYLlegada(v1,"05/01/2020","05/01/2020"));

    }


}