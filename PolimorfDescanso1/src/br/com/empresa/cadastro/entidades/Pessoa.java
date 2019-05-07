package br.com.empresa.cadastro.entidades;

public class Pessoa {
	private int id; 
	private String nome;
	
	public void exibirNomeFormatado() {	
		System.out.println(nome.toUpperCase());
	}
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
