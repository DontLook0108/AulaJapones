package br.com.fiap.beans;

public class Futebol extends Esporte {
	private int gols; 
	private String campo; 
	
	public String exibirTudo() {
		return (super.exibirTudo() + " - " + gols + " - " + campo).toUpperCase();
	}
	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}
}
