package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCallcenter {

	@Test
	public void queSePuedaCrearUnCallCenter() {
		Sistema callcenter = new Sistema("Oeste Cable Color");
		assertNotNull(callcenter);
	}
	
	@Test
	public void queSePuedaAgregarOperadoresAlCallCenter() {
		Sistema callcenter = new Sistema("Oeste Cable Color");
		Operador operador = new Operador(1,"Rocky");
		
		callcenter.agregarOperador(operador);
		
		Integer valEsp = 1;
		Integer valObt = callcenter.cantidadOperadores();
	}
}
