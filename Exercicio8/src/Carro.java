
public class Carro {
	String modelo; 
	String fabricante; 
	int anoFabricacao; 
	Cor cor; 
	boolean airBag; 
	boolean abs;
	boolean direcaoHidraulica; 
	boolean arCondicionado;
	double preco; 
	
	double getPreco() {
		return preco;
	} 
	void setPreco(double preco) {
		this.preco = preco; 
	}
	void exibirTudo() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Ano: " + anoFabricacao);
		System.out.println("Preço: " + preco);
		exibirOpcionais();
	}
	
	void exibirOpcionais() {
		System.out.println("Cor: " +cor.nome); 
		System.out.println("Metalica? " +cor.corMetalica);
		System.out.println("Direção hidraulica: " +direcaoHidraulica);
		System.out.println("Abs: " +abs);
		System.out.println("Ar condicionado: " + arCondicionado);
	}
	public double getIPI(){
		return 0.075 * preco;
	} 
	public double getICMS() {
		return 0.06 * preco; 
	} 
}
