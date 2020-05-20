package test;

import dominio.Piloto;
import dominio.Rol;
import exception.PilotoErroneoException;
import exception.PilotoDatoNuloException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotoTest {

    @Test
    void test01RegistrarPiloto(){
        try {
            Piloto p1 = new Piloto("Rodrigo", "Olivera", "2915666543", "190263", Rol.Comandante);
            String apellidoYNombrePiloto = p1.getApellido() + " " + p1.getNombre();

            assertEquals("Olivera Rodrigo", apellidoYNombrePiloto);
        }catch(PilotoDatoNuloException ex){
            assertEquals("Ningun dato del piloto debe ser nulo", ex.getMessage());
        }catch(PilotoErroneoException ex) {
            fail("PilotoDatoNuloException Esperado.");
        }
    }

    @Test
    void test02Piloto_NombreNulo(){
        try{
            Piloto p = new Piloto(null,"Olivera","2915666543","190263",Rol.Comandante);
        }catch(PilotoDatoNuloException ex){
            assertEquals("Ningun dato del piloto debe ser nulo", ex.getMessage());
        }catch(PilotoErroneoException ex) {
            fail("PilotoDatoNuloException Esperado.");
        }
    }

    @Test
    void test03Piloto_ApellidoNulo(){
        try{
            Piloto p = new Piloto("Rodrigo",null,"2915666543","190263",Rol.Comandante);
        }catch(PilotoDatoNuloException ex){
            assertEquals("Ningun dato del piloto debe ser nulo", ex.getMessage());
        }catch(PilotoErroneoException ex) {
            fail("PilotoDatoNuloException Esperado.");
        }
    }

    @Test
    void test04Piloto_CuilNulo(){
        try{
            Piloto p = new Piloto("Rodrigo","Olivera",null,"190263",Rol.Comandante);
        }catch(PilotoDatoNuloException ex){
            assertEquals("Ningun dato del piloto debe ser nulo", ex.getMessage());
        }catch(PilotoErroneoException ex) {
            fail("PilotoDatoNuloException Esperado.");
        }
    }

    @Test
    void test05Piloto_LegajoNulo(){
        try{
            Piloto p = new Piloto("Rodrigo","Olivera","2915666543",null,Rol.Comandante);
        }catch(PilotoDatoNuloException ex){
            assertEquals("Ningun dato del piloto debe ser nulo", ex.getMessage());
        }catch(PilotoErroneoException ex) {
            fail("PilotoDatoNuloException Esperado.");
        }
    }


}