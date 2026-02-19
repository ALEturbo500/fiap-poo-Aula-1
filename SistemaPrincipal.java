package br.com.fiapride.main;


import br.com.fiapride.model.ControlePs4;

public class SistemaPrincipal {
	
	public static void main(String[] args) {

	ControlePs4 meuControle = new ControlePs4();
	
	meuControle.cor = "Vermelho";
	meuControle.corDoLed = "Azul";
	meuControle.capacidadeTotalMah = 1000;

	ControlePs4 ControleDoAmigo = new ControlePs4();
	ControleDoAmigo.cor = "Preto";
	ControleDoAmigo.corDoLed = "Vermelho";
	ControleDoAmigo.capacidadeTotalMah = 1000;
	System.out.println("Meu Controle é: " + meuControle.cor);
	System.out.println("O do meu amigo é: " + ControleDoAmigo.cor);
	}
}