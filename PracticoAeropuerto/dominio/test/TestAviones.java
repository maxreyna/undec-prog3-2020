package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Boleto;
import dominio.Ciudad;
import dominio.Pasajero;
import dominio.Persona;
import dominio.Rol;
import dominio.Tripulante;

class TestAviones {

	@Test
	void test01_MetodoGetPersona() {
		
		Persona p1 = new Persona("Morales","Nancy Yesica");
		
		assertEquals("Morales", p1.getApellido());
		assertEquals("Nancy Yesica", p1.getNombre());
	}
	
	@Test
	void test001_MetodoSetPersona() {
		Persona p1 = new Persona("Morales","Nancy Yesica");
		
		p1.setApellido("MORALES");
		p1.setNombre("Nancy Yesica Belen");
		
		assertEquals("MORALES", p1.getApellido());
		assertEquals("Nancy Yesica Belen", p1.getNombre());
		
	}
	
	
	
	@Test
	void test02_Pasajero(){
		Pasajero pa1 = new Pasajero("Morales", "Nancy", "Turista");
		assertEquals("MORALES Nancy - Turista", pa1.toString());
		 
	}
	
	@Test
	void test03_Boleto() {
		Boleto b1 = new Boleto("Londres", "Madrid", "15A", "4");
		assertEquals("Boleto [origen=Londres, destino=Madrid, fila=15A, asiento=4]", b1.GetBoleto());
	}
	
	
//	@Test
//	void test03_MetodosdePasajero(){
//		
//		Pasajero p1 = new Pasajero("Reyna","Maximiliano");
//		Pasajero p2 = new Pasajero("Morales","Nancy",14,"E");
//		Pasajero p3 = new Pasajero("Reyna","Maximiliano",15,"E");
//		Pasajero p4 = new Pasajero("Morales","Nancy",14,"E");
//		Pasajero p5 = new Pasajero("Cerezo","Jose",12,"A");
//		
//		assertEquals(0, p1.getAsiento());
//		assertEquals(14, p2.getAsiento());
//		assertEquals(15, p3.getAsiento());
//		assertEquals(12, p5.getAsiento());
//		assertEquals("", p1.getFila());
//		assertEquals("E", p2.getFila());
//		assertEquals("E", p3.getFila());
//		assertEquals("A", p5.getFila());
//		assertEquals(false, p1.equals(p2));
//		assertEquals(false, p1.equals(p3));
//		assertEquals(true, p2.equals(p4));
//		assertEquals(false, p2.equals(p5));
//		assertEquals("MORALES Nancy - 14E", p2.toString());
//		assertEquals("REYNA Maximiliano - 15E", p3.toString());
//		assertEquals("CEREZO Jose - 12A", p5.toString());
//	}
//	
//	@Test
//	void test04_MetodosdeTripulante(){
//
//		Tripulante p1 = new Tripulante("Reyna","Maximiliano",Rol.PILOTO);
//		Tripulante p2 = new Tripulante("Morales","Nancy",Rol.AZAFATA);
//		Tripulante p3 = new Tripulante("Cerezo","Jose",Rol.COPILOTO);
//		Tripulante p4 = new Tripulante("Reyna","Maximiliano",Rol.COPILOTO);
//		
//		assertEquals(Rol.PILOTO, p1.getCargo());
//		assertEquals(Rol.AZAFATA, p2.getCargo());
//		assertEquals(Rol.COPILOTO, p3.getCargo());
//		assertEquals("REYNA Maximiliano -> PILOTO",p1.toString());
//		assertEquals("MORALES Nancy -> AZAFATA",p2.toString());
//		assertEquals("CEREZO Jose -> COPILOTO",p3.toString());
//		assertEquals(false, p1.equals(p2));
//		assertEquals(true, p1.equals(p4));
//	}
	


}
