package br.com.fiap.teste;
import br.com.fiap.entrada.Magica;
import br.com.fiap.excecao.Excecao;

public class TesteExce��o {

	public static void main(String[] args) {

		try {
			int x = Magica.i("N�mero: ");
			System.out.println(x); 
			
			String a = Magica.texto("Digite algo.."); 
			System.out.println(a); 
		}
		 catch (Exception e) {
			e.printStackTrace(); 
			System.out.println(Excecao.getExcecao(e));
		}
	}

}
