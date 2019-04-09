import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(); 
		Scanner s = new Scanner (System.in); 
		System.out.println("Nome: ");
		cliente.setNome(s.next()+s.nextLine()); 
		System.out.println("Email: ");
		cliente.setEmail(s.next()); 
		
		Telefone tele = new Telefone(); 
		System.out.println("Numero: "); 
		tele.setNumero(s.nextInt()); 
		System.out.println("Ramal: "); 
		tele.setRamal(s.nextInt()); 
		System.out.println("Operadora: "); 
		tele.setOperadora(s.next()); 
		System.out.println("DDD: "); 
		tele.setDdd(s.nextInt()); 
		
		cliente.setFone(tele); 
		
		System.out.println("Numero : " + cliente.getFone().getNumero()); 
		System.out.println("Ramal : " + cliente.getFone().getRamal());  
		System.out.println("Operadora : " + cliente.getFone().getOperadora()); 
		System.out.println("DDD: " + cliente.getFone().getDdd());   
		
		Endereco end = new Endereco(); 
		System.out.println("Bairro: "); 
		end.setBairro(s.next()); 
		System.out.println("CEP: "); 
		end.setCep(s.nextInt()); 
		System.out.println("Cidade: "); 
		end.setCidade(s.next()); 
		System.out.println("Complemento: "); 
		end.setComplemento(s.next()); 
		System.out.println("Estado: "); 
		end.setUf(s.next()); 
		System.out.println("Número: "); 
		end.setNumero(s.next()); 
		System.out.println("Rua: "); 
		end.setLogradouro(s.next());
		
		cliente.setEndereco(end); 
		
		System.out.println("Nome: " + cliente.getNome()); 
		System.out.println("Email: " + cliente.getEmail());  
		System.out.println("Bairro: " + cliente.getEndereco().getBairro()); 
		System.out.println("Cidade: " + cliente.getEndereco().getCidade()); 
		System.out.println("Complemento: " + cliente.getEndereco().getComplemento()); 
		System.out.println("UF: " + cliente.getEndereco().getUf()); 
		System.out.println("Número: " + cliente.getEndereco().getNumero()); 
		System.out.println("Rua: " + cliente.getEndereco().getLogradouro());
			
	}

}
