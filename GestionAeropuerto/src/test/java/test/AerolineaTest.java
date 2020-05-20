package test;

import dominio.Aerolinea;
import exception.AerolineaDatoNuloException;
import exception.AerolineaErroneaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AerolineaTest {
    @Test
    void test01AerolineaNombreNulo(){
        try {
            Aerolinea a1 = new Aerolinea(null,"11/07/2000","28-34567887-9");
        }catch(AerolineaDatoNuloException ex){
            assertEquals("Ningun dato de la aerolinea debe ser nulo", ex.getMessage());
        }catch(AerolineaErroneaException ex) {
            fail("AerolineaErroneaException Esperado.");
        }
    }

    @Test
    void test02AerolineaFechaDeInicioNulo(){
        try {
            Aerolinea a1 = new Aerolinea("LATAM",null,"28-34567887-9");
        }catch(AerolineaDatoNuloException ex){
            assertEquals("Ningun dato de la aerolinea debe ser nulo", ex.getMessage());
        }catch(AerolineaErroneaException ex) {
            fail("AerolineaErroneaException Esperado.");
        }
    }

    @Test
    void test03AerolineaCuitNulo(){
        try {
            Aerolinea a1 = new Aerolinea("LATAM","11/07/2000",null);
        }catch(AerolineaDatoNuloException ex){
            assertEquals("Ningun dato de la aerolinea debe ser nulo", ex.getMessage());
        }catch(AerolineaErroneaException ex) {
            fail("AerolineaErroneaException Esperado.");
        }
    }




}