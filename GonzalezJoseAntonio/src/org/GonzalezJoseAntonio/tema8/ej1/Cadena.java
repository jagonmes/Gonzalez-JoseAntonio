package org.GonzalezJoseAntonio.tema8.ej1;

public class Cadena {
	private String cadena;
	
	public Cadena(String cadena) {
		super();
		this.cadena=cadena;
	}
	
	public String getCadena() {
		return this.cadena;
	}
	
	public void cDelante(String delante) {
		this.cadena=delante+this.cadena;
	}
	
	public void cDetras(String detras) {
		this.cadena=this.cadena+detras;
	}
	
	public void quitar(char c) {
		this.cadena=this.cadena.replaceAll(""+c, "");
	}
	
	public void quitar(char c, int n) {
		while(n>0) {
		this.cadena=this.cadena.replaceFirst(""+c, "");
		n--;
		}
	}
}
