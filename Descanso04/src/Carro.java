
public class Carro extends Veiculos {
	private int quantidadePortas; 
	private Cor cor; 
	private String placa; 
	private float motor = 1.0f;
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	} 
}
