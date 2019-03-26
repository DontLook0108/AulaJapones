
public class ExerClass { 
	
	public static void main(String[] args) {
		
		PrimeiraClasse objPrimeiraClasse = new PrimeiraClasse (); 
		objPrimeiraClasse.setCodigo(345); 
		objPrimeiraClasse.setValor(2000); 
		objPrimeiraClasse.setDescricao("chato"); 
		objPrimeiraClasse.setMarca("Ferrari"); 
		objPrimeiraClasse.setBasico(3, "Metade do dobro de 6");
		//Descanso1
		System.out.println(objPrimeiraClasse.getDescricao()); 
		System.out.println(objPrimeiraClasse.getCodigo()); 
		System.out.println(objPrimeiraClasse.getMarca()); 
		System.out.println(objPrimeiraClasse.getValor()); 
		
		//Descanso2
		System.out.println(objPrimeiraClasse.getBasico()); 
		System.out.println(objPrimeiraClasse.getDetalheMarca()); 
		
		//Descans03
		System.out.println(objPrimeiraClasse.getDesconto()); 
		
		//Descanso4 
		System.out.println(objPrimeiraClasse.getValores()); 
		
		//Descanso5 
		;
	}
	

}
