
public class ContaCorrente {
	private String titular; 
	private int agenciaContaCorrente; 
	private String numeroContaCorrente; 
	private double saldo; 
	
	double deposito (double valor) {
		saldo+=valor;
		return saldo;
	} 
	double saque(double valor) {
		saldo-=valor;
		return saldo;
	} 
	double getSaldo() {
		return saldo;
	} 
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	void exibirSaldo() {
		System.out.println("Olá " +titular+ ", o seu saldo é: R$ " + saldo);
	}
}
