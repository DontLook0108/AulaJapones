import java.util.Scanner;

public class TestarAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(); 
		Scanner e = new Scanner (System.in);
		aluno1.setNome(e.next()+e.nextLine());   
		aluno1.setPriMedia(e.nex); 
		aluno1.setSegMedia(6.1);
		aluno1.setQuantFaltas(12);

		System.out.println(aluno1);
		System.out.println("Aluno: " + aluno1.getNome());
		System.out.println("Media 1: " + aluno1.getPriMedia()); 
		System.out.println("Media 2: " + aluno1.getSegMedia());
		System.out.println("Faltas: " + aluno1.getQuantFaltas());
	}

}
