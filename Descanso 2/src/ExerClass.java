
public class ExerClass {

	public static void main(String[] args) {
		Produto chupim = new Produto(); 
		chupim.setCodigo(666); 
		chupim.setDescricao("Chupim dos Diabos"); 
		chupim.setMarca("Velho Barreiro"); 
		chupim.setValor(0.0); 
		System.out.println(chupim.getBasico()); 
		
		Produto irineu = new Produto(); 
		irineu.setCodigo(333); 
		irineu.setDescricao("Feh"); 
		irineu.setMarca("Gloria a Deuxx"); 
		irineu.setValor(-20.0); 
		
		Produto encosto = new Produto(); 
		encosto.setCodigo(40); 
		encosto.setDescricao("Coisa Ruim"); 
		encosto.setMarca("IEPG"); 
		encosto.setValor(10.0); 
		
		//System.out.println(chupim.codigo); 
		//System.out.println(chupim.descricao); 
		//System.out.println(chupim.marca); 
		//System.out.println(chupim.valor);
	}

}
