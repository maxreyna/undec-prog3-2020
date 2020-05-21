package test;

import dominio.Avion;
import exception.AvionErroneoException;
import gestor.GestorAvion;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GestorAvionTest {

    @Test
    @Order(1)
    void test01GestorAvion_addAvion() throws AvionErroneoException {
        GestorAvion ga =  GestorAvion.getInstance();
        Avion a1 = new Avion("Boeing","LV-BYY","747-400");

        assertEquals(true,ga.addAvion(a1));
    }

    @Test
    @Order(2)
    void test02GestorAvion_eliminarAvion() throws AvionErroneoException {
        GestorAvion ga =  GestorAvion.getInstance();
        ga.clear();
        Avion a1 = new Avion("Boeing","LV-BYY","747-400");

        assertEquals(0,ga.getCantidadDeAviones());

        assertEquals(true,ga.addAvion(a1));
        assertEquals(1,ga.getCantidadDeAviones());

        assertEquals(true,ga.eliminarAvion(a1));
        assertEquals(0,ga.getCantidadDeAviones());
    }

    @Test
    @Order(3)
    void test03GestorAvion_buscarAvion() throws AvionErroneoException {
        GestorAvion ga =  GestorAvion.getInstance();
        ga.clear();

        Avion a1 = new Avion("Boeing","LV-BYY","747-400");

        assertEquals("No se encontraron resultados del avion buscado",ga.buscarAvion(a1.getVehiculo()));
        assertEquals(true,ga.addAvion(a1));
        assertEquals(a1.toString(),ga.buscarAvion(a1.getVehiculo()));
    }

    @Test
    @Order(4)
    void test04GestorAvion_actualizarAvion() throws AvionErroneoException {
        GestorAvion ga =  GestorAvion.getInstance();
        ga.clear();
        Avion a1 = new Avion("Boeing","LV-BYY","747-400");
        Avion a2 = new Avion("Airbus","LV-FNI","A330-200");

        assertEquals(true,ga.addAvion(a1));
        assertEquals(true,ga.actualizarAvion(a1,a2));
    }
}