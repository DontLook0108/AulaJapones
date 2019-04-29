import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		Carro carro = new Carro(); 
		carro.preco = 26000; 
		carro.modelo = "Palio"; 
		carro.fabricante = "Fiat"; 
		carro.anoFabricacao = 2012; 
		
		System.out.println(carro.preco);
		System.out.println(carro.modelo);
		System.out.println(carro.fabricante);
		System.out.println(carro.anoFabricacao);

	}

}
