import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		int a, b;
		boolean c = true;
		boolean d = false; 
		
		Scanner s = new Scanner(System.in); 
		System.out.println("Digite o valor de a: ");
		a = s.nextInt(); 
		System.out.println("Digite o valor de b: ");
		b = s.nextInt();
		
		System.out.println(a + " igual a " + b + " : " + (a==b));
		System.out.println(a + " maior " + b + " : " + (a>b));
		System.out.println(a + " menor " + b + " : " + (a<b));
		System.out.println(c + " && " + d + " = " + (c&&d));
		System.out.println(d + " && " + c + " = " + (d&&c));
		System.out.println(c + " || " + d + " = " + (c||d));
		
		

	}

}
