
public class ContaPoupanca extends ContaBancaria {
	private double taxaJuros;

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	} 
	public void atualizarSaldo() {
		saldo = saldo + (saldo * (taxaJuros/100));
		// saldo = super.getSaldo + (super.getSaldo*(taxaJuros/100));
		// depois tem que mexer no setSaldo
	}
}
