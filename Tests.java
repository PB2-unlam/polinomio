import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

	@Test
	public void CalcularMonomio() {
		Monomio nuevoMonomio = new Monomio(4,2.0);
		Double x = 3.0;
		Double esperado = 162.0;
		Double obtenido = nuevoMonomio.evaluar(x);
		assertEquals(esperado,obtenido);
	}


	@Test
	public void CalcularPolinomio() {
		Monomio monomio1 = new Monomio(2,2.0);
		Monomio monomio2 = new Monomio(3,2.0);
		Polinomio poli = new Polinomio(monomio1,monomio2);
		Double x = 2.0;
		Double esperado = 24.0;
		Double obtenido = poli.resolver(x);
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	public void CalcularFuncionConstante() {
		FuncionConstante func = new FuncionConstante(2.0);
		Double x = 2.0;
		Double esperado = 2.0;
		Double obtenido = func.evaluar(x);
		assertEquals(esperado,obtenido);
		
	}

	@Test
	public void CalcularFuncionLineal() {
		FuncionLineal func = new FuncionLineal(2.0);
		Double x = 2.0;
		Double esperado = 4.0;
		Double obtenido = func.evaluar(x);
		assertEquals(esperado,obtenido);
		
	}
	@Test
	public void CalcularFuncionCuadratica() {
		FuncionCuadratica func = new FuncionCuadratica(2.0);
		Double x = 2.0;
		Double esperado = 8.0;
		Double obtenido = func.evaluar(x);
		assertEquals(esperado,obtenido);
		
	}
	
}