package test;

import dominio.Aerolinea;
import dominio.Vuelo;
import exception.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VueloTest {
    @Test
    void test01Vuelo_FechaDeSalidaNula(){

        try {
            Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
            Vuelo a1 = new Vuelo(null,"01/01/2020","14:00","16:00","LT4186",al1);
        }catch(VueloDatoNuloException ex){
            assertEquals("Ningun dato del vuelo debe ser nulo", ex.getMessage());
        }catch(AvionErroneoException ex) {
            fail("VueloErroneoException Esperado.");
        } catch (AerolineaErroneaException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test02Vuelo_FechaDeLlegadaNulo(){
        try {
            Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
            Vuelo a1 = new Vuelo("01/01/2020",null,"14:00","16:00","LT4186",al1);
        }catch(VueloDatoNuloException ex){
            assertEquals("Ningun dato del vuelo debe ser nulo", ex.getMessage());
        }catch(AvionErroneoException ex) {
            fail("VueloErroneoException Esperado.");
        } catch (AerolineaErroneaException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test03Vuelo_HoraDeSalidaNulo(){
        try {
            Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
            Vuelo a1 = new Vuelo("01/01/2020","01/01/2020",null,"16:00","LT4186",al1);
        }catch(VueloDatoNuloException ex){
            assertEquals("Ningun dato del vuelo debe ser nulo", ex.getMessage());
        }catch(AvionErroneoException ex) {
            fail("VueloErroneoException Esperado.");
        } catch (AerolineaDatoNuloException ex) {
            assertEquals("Ningun dato de la aerolinea debe ser nulo", ex.getMessage());
        }
        catch (AerolineaErroneaException e) {
        }
    }

    @Test
    void test04Vuelo_HoraDeLlegadaNulo(){
        try {
            Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
            Vuelo a1 = new Vuelo("01/01/2020","01/01/2020","14:00",null,"LT4186",al1);
        }catch(VueloDatoNuloException ex){
            assertEquals("Ningun dato del vuelo debe ser nulo", ex.getMessage());
        }catch(AvionErroneoException ex) {
            fail("VueloErroneoException Esperado.");
        } catch (AerolineaDatoNuloException ex) {
            assertEquals("Ningun dato de la aerolinea debe ser nulo", ex.getMessage());
        }
        catch (AerolineaErroneaException e) {
        }
    }

    @Test
    void test05Vuelo_CodigoDeVueloNulo(){
        try {
            Aerolinea al1 = new Aerolinea("LATAM","11/07/2000","28-34567887-9");
            Vuelo a1 = new Vuelo("01/01/2020","01/01/2020",null,"16:00","LT4186",al1);
        }catch(VueloDatoNuloException ex){
            assertEquals("Ningun dato del vuelo debe ser nulo", ex.getMessage());
        }catch(AvionErroneoException ex) {
            fail("VueloErroneoException Esperado.");
        } catch (AerolineaDatoNuloException ex) {
            assertEquals("Ningun dato de la aerolinea debe ser nulo", ex.getMessage());
        }
        catch (AerolineaErroneaException e) {
        }
    }


}