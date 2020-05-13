package pruebasunitariastest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pruebasunitarias.FechaException;
import pruebasunitarias.NumeroException;
import pruebasunitarias.Utilidades;

public class UtilidadesTest {
	
	//Test de esFinDeSemana(int dia, int mes, int anyo)
	
	@Test
	public void esFinDeSemana01() throws FechaException {	
		assertEquals(true,Utilidades.esFinDeSemana(9,4,2020));
	}
	
	@Test
	public void esFinDeSemana02() throws FechaException {	
		assertEquals(true,Utilidades.esFinDeSemana(24,4,2020));
	}
	
	@Test
	public void esFinDeSemana03() throws FechaException {	
		assertEquals(true,!Utilidades.esFinDeSemana(26,4,2020));
	}
	
	@Test(expected = FechaException.class)
	public void esFinDeSemana04() throws FechaException {	
		Utilidades.esFinDeSemana(26,4,1885);
	}

	@Test(expected = FechaException.class)
	public void esFinDeSemana05() throws FechaException {	
		Utilidades.esFinDeSemana(26,4,3028);
	}
	
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
