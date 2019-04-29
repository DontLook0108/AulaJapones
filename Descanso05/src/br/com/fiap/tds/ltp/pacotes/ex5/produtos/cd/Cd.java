package br.com.fiap.tds.ltp.pacotes.ex5.produtos.cd;

import br.com.fiap.tds.ltp.pacotes.ex5.produtos.Produto;

public class Cd extends Produto {
	private String album; 
	private String artista;
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
}
