package br.com.fiap.excecao;

public class Excecao extends Exception {

	/*public Excecao(Exception e) {
		if (e.getClass().toString().equals("class java.lang.NullPointerException")) {
			System.out.println("Objeto nulo");
		} else if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Numero invalido");
		} else {
			System.out.println("Deu merda irmão");
		}
	}
	Não devo usar com construtor no am e nem na ps 
	o Humberto vai descontar nota
	*/ 
	
	public static String getExcecao(Exception e) {
		if (e.getClass().toString().equals("class java.lang.NullPointerException")) {
			return "Objeto nulo";
		} else if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			return "Numero invalido";
		} else {
			return "Deu merda irmão";
		}
	}
}
