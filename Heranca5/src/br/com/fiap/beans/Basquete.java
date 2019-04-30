package br.com.fiap.beans;

public class Basquete extends Esporte {
	private int tamanhoCesta; 
	private int pontuacao; 
	
	public String exibirTudo() {
		return (super.exibirTudo() + " - " + tamanhoCesta + " - " + pontuacao).toUpperCase();
	}

	public int getTamanhoCesta() {
		return tamanhoCesta;
	}

	public void setTamanhoCesta(int tamanhoCesta) {
		this.tamanhoCesta = tamanhoCesta;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	} 
}
