import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		int n1, n2, m, i, r;
		double d;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = s.nextInt(); 
		System.out.println("Digite o segundo numero: ");
		n2 = s.nextInt();
		
		m = (n1 * n2);
		System.out.println("Multiplicando: " + m);
		d = n1 / n2; 
		System.out.println("Dividindo: " + d); 
		r = n1 % n2; 
		System.out.println("Resto da divisão: " + r);
		i = m++;
		System.out.println("Incrementando: " + m);
		
			

	}

}
