package br.com.fiap.teste;


import br.com.fiap.beans.Volei;

public class Teste {

	public static void main(String[] args) {
		Volei vo = new Volei(); 
		vo.setNomeTimes("SESI");
		vo.setPontos(25);
		System.out.println(vo.exibirTudo());
	}

}
