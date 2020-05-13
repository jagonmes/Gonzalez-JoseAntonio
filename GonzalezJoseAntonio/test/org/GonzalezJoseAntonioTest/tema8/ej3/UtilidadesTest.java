package org.GonzalezJoseAntonioTest.tema8.ej3;

import static org.junit.Assert.assertEquals;

import org.GonzalezJoseAntonio.tema8.ej3.Utilidades;
import org.GonzalezJoseAntonio.tema8.ej3.NumeroException;
import org.junit.Test;

public class UtilidadesTest {
	
	///Test esPrimo(int numero)
	
	@Test
	public void esPrimo01() throws NumeroException {
		assertEquals(true,!Utilidades.esPrimo(1));
	}
	
	@Test
	public void esPrimo02() throws NumeroException {
		assertEquals(true,Utilidades.esPrimo(2));
	}
	
	@Test
	public void esPrimo03() throws NumeroException {
		assertEquals(true,Utilidades.esPrimo(983));
	}
	
	@Test
	public void esPrimo04() throws NumeroException {
		assertEquals(true,!Utilidades.esPrimo(22));
	}
	
	@Test(expected = NumeroException.class)
	public void esPrimo05() throws NumeroException {
		assertEquals(true,!Utilidades.esPrimo(-2));
	}
	
	@Test(expected = NumeroException.class)
	public void esPrimo06() throws NumeroException {
		assertEquals(true,!Utilidades.esPrimo(1100000));
	}

}
