package br.com.dominio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.dominio.model.Modelo;
import br.com.dominio.view.Visao;

/*
 *  A class responsável em intermediar o Model e a View
 * */
public class Controlador {

	private Visao visao;
	private Modelo modelo;
	
	/*
	 * O controlador (Controller) é a camada do MVC responsável pelo processamento dos dados 
	 * 
	 * É ela que pega os dados do Model e mostra na tela do usuário camada View (Visao) e do usuário (View) para a camada Model
	 * */
	public Controlador(Visao visao, Modelo modelo) {
		
		this.visao = visao;
		this.modelo = modelo;
		
		this.visao.adicionaListener(new Listener());
	}
	
	class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			int numero1, numero2 = 0;
			
			try {
				
				numero1 = visao.getPrimeiroNumero();
				numero2 = visao.getSegundoNumero();
				
				modelo.somaNumeros(numero1, numero2);
				
				visao.setResultado(modelo.getValor());
				
			} catch (Exception e) {
				visao.mensagemError("Insira dois números inteiros");
			}
			
		}
		
	}	
	
}
