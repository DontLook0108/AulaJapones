package br.com.fiap.tds.ltp.sistemabanco.entidades;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		ContaCorrente conta = new ContaCorrente();
		System.out.println("Digite o saldo: "); 
		conta.setSaldo(s.nextDouble()); 
		Cliente cliente = new Cliente(); 
		System.out.println("Digite o nome: ");
		cliente.setNome(s.next() + s.nextLine());
		System.out.println("Digite o cpf: ");
		cliente.setCpf(s.next());
		Endereço end = new Endereço(); 
		System.out.println("Digite a rua: ");
		end.setRua(s.next()); 
		System.out.println("Digite o numero: ");
		end.setNumero(s.nextShort());
		System.out.println("Digite o complemento: ");
		end.setComplemento(s.next());
		System.out.println("Digite o bairro: ");
		end.setBairro(s.next());
		System.out.println("Digite o CEP: ");
		end.setCep(s.next());
		
		conta.setTitular(cliente);
		System.out.println("Saldo: R$ " +conta.getSaldo());
		System.out.println("Nome: " +conta.getTitular().getNome());
		System.out.println("Cpf: " +conta.getTitular().getCpf());
		cliente.setEndereco(end);
		System.out.println("Rua: " +cliente.getEndereco().getRua());
		System.out.println("Numero: " +cliente.getEndereco().getNumero());
		System.out.println("Complemento: " +cliente.getEndereco().getComplemento());
		System.out.println("Bairro: " +cliente.getEndereco().getBairro());
		System.out.println("CEP: " +cliente.getEndereco().getCep());
		

	}

}
