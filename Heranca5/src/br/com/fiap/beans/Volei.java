package br.com.fiap.beans;

public class Volei extends Esporte {
	private int pontos; 
	private int tamanhoRede; 
	
	public String exibirTudo() {
		return (super.exibirTudo() + " - " + pontos + " - " + tamanhoRede).toUpperCase();
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getTamanhoRede() {
		return tamanhoRede;
	}

	public void setTamanhoRede(int tamanhoRede) {
		this.tamanhoRede = tamanhoRede;
	} 
}
