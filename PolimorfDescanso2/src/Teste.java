
public class Teste {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(); 
		cc.setLimiteCredito(100);
		cc.exibirSaldo();
		cc.depositar(10);
		cc.exibirSaldo();
		cc.sacar(5);
		cc.exibirSaldo();
		
		ContaPoupanca cp = new ContaPoupanca(); 
		cp.exibirSaldo();
		cp.depositar(20);
		cp.exibirSaldo();
		cp.sacar(5);
		cp.exibirSaldo();
		cp.setTaxaJuros(2);
		cp.atualizarSaldo();
		cp.exibirSaldo();
	}
	 
}
