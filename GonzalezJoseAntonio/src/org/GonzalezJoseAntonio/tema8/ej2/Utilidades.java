package org.GonzalezJoseAntonio.tema8.ej2;

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

}
