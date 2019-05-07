package br.com.empresa.cadastro.entidades;

public class Cliente extends Pessoa {
	private String titulo;
	
	public void exibirNomeFormatado() {
		System.out.println(super.getNome().toUpperCase() + " - " + titulo.toUpperCase());
	}
	public Cliente(String titulo, String nome) {
		super(nome); 
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	} 
	
}
