import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ContaCorrente cont = new ContaCorrente();
		
		System.out.println(cont.deposito(20));
		System.out.println(cont.deposito(100));
		System.out.println(cont.deposito(3));
		
		System.out.println("Digite seu nome: ");
		cont.setTitular(s.next() + s.nextLine());
		System.out.println(cont.saque(40));
		
	}

}
