package test;

import dominio.Avion;
import exception.AvionDatoNuloException;
import exception.AvionErroneoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionTest {

    @Test
    void test01AvionNombreNulo(){
        try {
            Avion a1 = new Avion(null,"LV-BYY","747-400");
        }catch(AvionDatoNuloException ex){
            assertEquals("Ningun dato del avion debe ser nulo", ex.getMessage());
        }catch(AvionErroneoException ex) {
            fail("AerolineaErroneaException Esperado.");
        }
    }

    @Test
    void test02AvionMatriculaNulo(){
        try {
            Avion a1 = new Avion("Boeing",null,"747-400");
        }catch(AvionDatoNuloException ex){
            assertEquals("Ningun dato del avion debe ser nulo", ex.getMessage());
        }catch(AvionErroneoException ex) {
            fail("AerolineaErroneaException Esperado.");
        }
    }

    @Test
    void test03AvionModeloNulo(){
        try {
            Avion a1 = new Avion("Boeing","LV-BYY",null);
        }catch(AvionDatoNuloException ex){
            assertEquals("Ningun dato del avion debe ser nulo", ex.getMessage());
        }catch(AvionErroneoException ex) {
            fail("AerolineaErroneaException Esperado.");
        }
    }



}