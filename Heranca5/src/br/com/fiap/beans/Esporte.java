package br.com.fiap.beans;

public class Esporte {
	private String nomeTimes; 
	private int quantJogadores; 
	private CorUni corUni;
	
	public String exibirTudo() {
		return(nomeTimes + " - " + quantJogadores + " - " + corUni).toUpperCase();
	}
	public CorUni getCorUni() {
		return corUni;
	}
	public void setCorUni(CorUni corUni) {
		this.corUni = corUni;
	}
	public String getNomeTimes() {
		return nomeTimes;
	}
	public void setNomeTimes(String nomeTimes) {
		this.nomeTimes = nomeTimes;
	}
	public int getQuantJogadores() {
		return quantJogadores;
	}
	public void setQuantJogadores(int quantJogadores) {
		this.quantJogadores = quantJogadores;
	}
}
