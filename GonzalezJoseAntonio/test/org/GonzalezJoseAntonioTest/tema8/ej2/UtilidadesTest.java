package org.GonzalezJoseAntonioTest.tema8.ej2;

import static org.junit.Assert.assertEquals;

import org.GonzalezJoseAntonio.tema8.ej2.FechaException;
import org.GonzalezJoseAntonio.tema8.ej2.Utilidades;
import org.junit.Test;

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
	
}
