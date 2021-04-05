package br.com.dominio.model;

/*
 * Este é o nosso Java Bean do nosso projecto
 * */
public class Modelo {

	private int valor;
	
	public void somaNumeros(int numero1, int numero2) {
		this.valor = numero1 + numero2;
	}
	
	public int getValor() {
		return valor;
	}
}
