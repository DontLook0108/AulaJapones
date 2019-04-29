package br.com.fiap.tds.ltp.jogo.personagem.humano;

import br.com.fiap.tds.ltp.jogo.personagem.Personagem;

public class Humano extends Personagem {
	private String classe;

	public String definirClasse() {
		return classe;
	}
	
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	} 
	
}
