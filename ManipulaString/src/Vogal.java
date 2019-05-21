import java.util.Scanner;

public class Vogal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String vogal; 
		
		System.out.println("Digite uma palavra: ");
		vogal = s.next(); 
		
		
		String vogalCerto = vogal.replace("a", "*").replace("e", "*").replace("i", "*").replace("o","*").replace("u","*"); 
		
		System.out.println(vogalCerto);
		
		s.close();
	}

}
