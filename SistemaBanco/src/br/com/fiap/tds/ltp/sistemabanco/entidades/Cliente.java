package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class Cliente {
	private String nome; 
	private String cpf;
	private Endereço endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereço getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	} 
	
	
}
