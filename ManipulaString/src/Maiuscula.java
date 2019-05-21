import java.util.Scanner;

public class Maiuscula {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String maiu; 
		
		System.out.println("Digite uma palavra: ");
		maiu = s.next(); 
		
		System.out.println(maiu.toUpperCase());
		
		s.close();
	}

}
