package pruebasunitarias;

import java.util.Calendar;

public class Utilidades {
	public static boolean esFinDeSemana(int dia, int mes, int anyo) throws FechaException {
		Calendar fecha = Calendar.getInstance();
		fecha.set(anyo, mes, dia);
		if (anyo < 1900 || anyo > 3000) {
			throw new FechaException();
		} else {
			if (fecha.get(Calendar.DAY_OF_WEEK) == 1 || fecha.get(Calendar.DAY_OF_WEEK) == 7) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public static boolean esPrimo(int numero) throws NumeroException {
		if (numero<0||numero>1000000) {
			throw new NumeroException();
		}else {
			 int contador = 2;
			  boolean primo=true;
			  while ((primo) && (contador!=numero)){
			    if (numero % contador == 0)
			      primo = false;
			    contador++;
			  }
			  return primo;
		}
	}

}
