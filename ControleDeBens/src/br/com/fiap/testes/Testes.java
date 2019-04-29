package br.com.fiap.testes;  

import java.util.Scanner;

import br.com.fiap.bens.Imóvel;
import br.com.fiap.bens.Veiculos; 
import br.com.fiap.pessoas.PF;

public class Testes {

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);  
		PF pf = new PF(); 
		System.out.println("Nome: ");
		pf.setNome(s.next() + s.nextLine()); 
		System.out.println("Cpf: ");
		pf.setCpf(s.nextLong()); 
		
		System.out.println("Imoveis");
		Imóvel imv = new Imóvel(); 
		System.out.println("Tamanho: "); 
		imv.setTamanho(s.nextInt());
		System.out.println("Endereço: ");
		imv.setEndereco(s.next());
		System.out.println("Valor: ");
		imv.setValor(s.nextDouble());
		System.out.println("É residencial: ");
		imv.setResidencial(s.nextBoolean());
		
		System.out.println("Veiculos");
		Veiculos vei = new Veiculos(); 
		System.out.println("Modelo: ");
		vei.setModelo(s.next());
		System.out.println("Motor: ");
		vei.setMotor(s.next());
		System.out.println("Quantidade de Portas: ");
		vei.setQtdePortas(s.nextInt());
		System.out.println("O carro é zero ou não?: ");
		vei.setZero(s.nextBoolean()); 
		
		pf.setImovel(imv);
		System.out.println("Nome: " +pf.getNome());
		System.out.println("Cpf: " +pf.getCpf());
		System.out.println("Tamanho: "+pf.getImovel().getTamanho());
		System.out.println("Endereço: "+pf.getImovel().getEndereco());
		System.out.println("Valor: " +pf.getImovel().getValor());
		System.out.println("Residencial: " +pf.getImovel().isResidencial());
		
		pf.setVeiculos(vei);
		System.out.println("Modelo: " +pf.getVeiculos().getModelo());
		System.out.println("Motor: " +pf.getVeiculos().getMotor());
		System.out.println("Quantidade de Portas: " +pf.getVeiculos().getQtdePortas());
		System.out.println("O carro é zero: " +pf.getVeiculos().isZero());
		
		
		
		
		
		

	}

}
