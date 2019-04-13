package br.com.fiap.pessoas;

import br.com.fiap.bens.Imóvel;
import br.com.fiap.bens.Veiculos;

public class PF {
	private String nome;
	private long cpf; 
	private Veiculos veiculos; 
	private Imóvel imovel;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public Veiculos getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}
	public Imóvel getImovel() {
		return imovel;
	}
	public void setImovel(Imóvel imovel) {
		this.imovel = imovel;
	} 
	
	
	
}
