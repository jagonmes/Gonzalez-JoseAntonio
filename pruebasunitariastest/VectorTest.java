package pruebasunitariastest;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
import pruebasunitarias.InputDataException;
import pruebasunitarias.Vector;

public class VectorTest {
	
	//Test de ordenar(int[] vector)
	
	@Test
	public void ordenar01() throws InputDataException {
		int vector[]= {3,2,1};
		int expected[]= {1,2,3};
		assertTrue(Arrays.equals(expected, Vector.ordenar(vector)));
	}
	
	@Test
	public void ordenar02() throws InputDataException {
		int vector[]= {3,2,14,5,8,1};
		int expected[]= {1,2,3,5,8,14};
		assertTrue(Arrays.equals(expected, Vector.ordenar(vector)));
	}
	
	@Test(expected = InputDataException.class)
	public void ordenar03() throws InputDataException {
		Vector.ordenar(null);
	}
	
	@Test(expected = InputDataException.class)
	public void ordenar04() throws InputDataException {
		int vector[]=new int[5001];
		Vector.ordenar(vector);
	}

}
