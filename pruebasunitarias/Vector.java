package pruebasunitarias;

import java.util.Arrays;

public class Vector {
	public static int[] ordenar(int[] vector) throws InputDataException{
		if(vector==null||vector.length>5000) {
			throw new InputDataException();
		}else {
		Arrays.parallelSort(vector);
		return vector;
		}
	}
}
