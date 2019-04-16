import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		double sal, horas, valorHrs;
		
		Scanner s = new Scanner(System.in); 
		System.out.println("Digite as horas trabalhadas: ");
		horas = s.nextDouble(); 
		System.out.println("Digite o valor das horas trabalhadas: ");
		valorHrs = s.nextDouble(); 
		
		sal = horas * valorHrs; 
		System.out.println("Seu salario por horas trabalhadas é: " +sal);

	}

}
