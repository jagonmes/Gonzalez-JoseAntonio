package org.GonzalezJoseAntonio.tema9.ej1;

public class Prueba {
	public static void main(String[] args) {
		new Prueba().f();
	}
	
	//Imprime un número dado de filas de un caracter repetido un número dado de veces
	//Se ha sacado fuera del codigo de f() como una función independiente debido a su repetición de manera continua
	private void separador(int numLineas, int numCaracteres, char c) {
		for (int i=0;i<numLineas;i++) {
			for(int j=0; j<numCaracteres;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}


	// Pintar título, cuerpo y final
	private void f() {
		
		// Raya encabezado superior
		separador(2,15,'=');
		
		System.out.println("TEMA 1. CONTROL de VERSIONES");
		
		// Raya encabezado inferior
		separador(2,15,'=');

		System.out.println("1. Conceptos generales");
		
		//Separador
		separador(1,7,'*');
		
		System.out.println("2. Repositorio centralizado. SVN");

		//Separador
		separador(1,7,'*');

		System.out.println("3. Repositorio distribuido. GIT");

		// Raya footer
		separador(2,15,'=');

		// =============================================
		separador(2,0,' ');
		// =============================================
		
		// Raya encabezado superior
		separador(2,20,'=');

		System.out.println("REFACTORIZACIÓN");
		
		// Raya encabezado inferior
		separador(2,20,'=');

		System.out.println("1. Bad smells");
		
		//Separador
		separador(1,7,'*');
		
		System.out.println("2. Refactorizaciones habituales");
		
		//Separador
		separador(1,7,'*');

		System.out.println("3. Refactorizando con Eclipse");

		// Raya footer
		separador(2,20,'=');		
	}
	
}
