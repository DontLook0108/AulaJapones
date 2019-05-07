
public class ContaCorrente extends ContaBancaria {
	private double limiteCredito;
	
	public void exibirSaldo() {
		System.out.println(saldo + limiteCredito);
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	} 
}
