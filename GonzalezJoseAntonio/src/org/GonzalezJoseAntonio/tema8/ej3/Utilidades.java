package org.GonzalezJoseAntonio.tema8.ej3;

public class Utilidades {
	public static boolean esPrimo(int numero) throws NumeroException {
		if (numero < 0 || numero > 1000000) {
			throw new NumeroException();
		} else {
			int contador = 2;
			boolean primo = true;
			while ((primo) && (contador != numero)) {
				if (numero % contador == 0)
					primo = false;
				contador++;
			}
			return primo;
		}
	}

}
