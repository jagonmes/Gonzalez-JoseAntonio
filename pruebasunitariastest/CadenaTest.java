package pruebasunitariastest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pruebasunitarias.Cadena;

public class CadenaTest {
	
	//Tests de getCadena()
	
	@Test
	public void getCadena01() {
		Cadena c = new Cadena("hola");
		assertEquals("hola",c.getCadena());
	}
	
	@Test
	public void getCadena02() {
		Cadena c = new Cadena("");
		assertEquals("",c.getCadena());
	}
	
	//Tests de cDelante(String delante)
	
	@Test
	public void cDelante01() {
		Cadena c = new Cadena("hola");
		c.cDelante("");
		assertEquals("hola",c.getCadena());
	}
	
	@Test
	public void cDelante02() {
		Cadena c = new Cadena("hola");
		c.cDelante("adios y ");
		assertEquals("adios y hola",c.getCadena());
	}
	
	//Tests de cDetras(String detras)
	
		@Test
		public void cDetras01() {
			Cadena c = new Cadena("hola");
			c.cDetras("");
			assertEquals("hola",c.getCadena());
		}
	
		@Test
		public void cDetras02() {
			Cadena c = new Cadena("hola");
			c.cDetras(" y adios");
			assertEquals("hola y adios",c.getCadena());
		}
		
		//Tests de quitar(char c)
		
			@Test
			public void quitar01() {
				Cadena c = new Cadena("AABBAA");
				c.quitar('B');
				assertEquals("AAAA",c.getCadena());
			}
			
			@Test
			public void quitar02() {
				Cadena c = new Cadena("AABBAA");
				c.quitar('A');
				assertEquals("BB",c.getCadena());
			}
			
			//Tests de quitar(char c, int n)
			
			@Test
			public void quitarN01() {
				Cadena c = new Cadena("AABBAA");
				c.quitar('B', 1);
				assertEquals("AABAA",c.getCadena());
			}
			
			@Test
			public void quitarN02() {
				Cadena c = new Cadena("AABBAA");
				c.quitar('B', 2);
				assertEquals("AAAA",c.getCadena());
			}
}
