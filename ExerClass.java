import java.util.Scanner;

public class ExerClass {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Digite a sua idade:  ");
		int teste = entrada.nextInt();  
		System.out.println("Digite a sua grana: "); 
		double saldo = entrada.nextDouble();
		
		if (teste < 45) {
			System.out.println("Você é novo: ");
		} else {
			System.out.println("Velhaco");
		}
		System.out.println("A sua idade é: "); 
		System.out.println("A sua grana é: ");
		
	}

}
