package beans;

public class Teste {
	
	public static void main(String[] args) {
		Escala escala = new Escala(); 
		escala.setLocal("Alaska");
		escala.setTempo("10h");
		escala.setTransfer(true);
		
		Passagem passagem = new Passagem(); 
		passagem.setAssento("6A");
		passagem.setEmpresa("TAM");
		passagem.setDestino("Valinhos");
		
		Escala[] escalas = new Escala[10]; 
		escalas[0] = escala; 
		
		passagem.setEscalas(escalas);
		passagem.setHora("04:00h");
		passagem.setLocalizador("ASFDAFDSA");
		passagem.setNum_voo("52456");
		passagem.setValor(5000.00);
		passagem.setOrigem("Capão da Canoa");
		
		Passageiro passageiro = new Passageiro(); 
		passageiro.setNome("Carlos");
		passageiro.setPassagem(passagem); 
		passageiro.setRg("65415645-19");
		
		System.out.println(passagem.getEscalas()[0].getLocal());
		System.out.println(passagem.getEscalas()[0].getTempo());
		System.out.println(passagem.getAssento());
		System.out.println(passagem.getEmpresa());
		System.out.println(passagem.getDestino());
		System.out.println(passagem.getHora());
		System.out.println(passagem.getLocalizador());
		System.out.println(passagem.getNum_voo());
		System.out.println(passagem.getValor());
		System.out.println(passagem.getOrigem());
		System.out.println(passageiro.getNome());
		System.out.println(passageiro.getRg());
	}
}
