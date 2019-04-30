package beans;

public class Passageiro {
	private Passagem passagem; 
	private String nome; 
	private String rg;
	
	public Passagem getPassagem() {
		return passagem;
	}
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	} 
}
