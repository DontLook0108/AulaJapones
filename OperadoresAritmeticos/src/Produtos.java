import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		double preco1, desc1, qtds1, preco2 ,desc2 ,qtds2 ,preco3, desc3, qtds3, precoFinal1, precoFinal2, precoFinal3; 
		String prod1, prod2, prod3; 
		Scanner s = new Scanner(System.in);
		System.out.println("Nome do produto 1: ");
		prod1 = s.next();
		System.out.println("Digite o pre�o do " + prod1 + ":");
		preco1 = s.nextDouble();
		System.out.println("Digite o desconto do " + prod1 + ":");
		desc1 = s.nextDouble();
		System.out.println("Digite a quantidade do " + prod1 + ":");
		qtds1 = s.nextDouble();
		System.out.println("Nome do produto 2: ");
		prod2 = s.next(); 
		System.out.println("Digite o pre�o do " + prod2 + ": ");
		preco2 = s.nextDouble();
		System.out.println("Digite o desconto do " + prod2 + ": ");
		desc2 = s.nextDouble();
		System.out.println("Digite a quantidade do " + prod2 + ": ");
		qtds2 = s.nextDouble(); 
		System.out.println("Nome do produto 3: ");
		prod3 = s.next();  
		System.out.println("Digite o pre�o do " + prod3 + ":");
		preco3 =s.nextDouble();
		System.out.println("Digite o desconto do " + prod3 + ":");
		desc3 = s.nextDouble(); 
		System.out.println("Digite a quantidade do " + prod3 + ":" );
		qtds3 = s.nextDouble();
		precoFinal1 = preco1 * qtds1 - desc1;
		precoFinal2 = preco2 * qtds2 - desc2; 
		precoFinal3 = preco3 * qtds3 - desc3;
		
		System.out.println("O pre�o final do " +prod1+ " �: " +precoFinal1);
		System.out.println("O pre�o final do " +prod2+ " �: " +precoFinal2);
		System.out.println("O pre�o final do " +prod3+ " �: " +precoFinal3);
		
		

	}

}
