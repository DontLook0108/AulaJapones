
public class Elevador {
	private int capacidade; 
	private int quantidadeAndar; 
	private int quantidadeAtualPessoas; 
	private int andarAtual; 
	
	public Elevador(int capacidade, int quantidadeAndar) {
		if(capacidade > 0) {
		this.capacidade = capacidade;
		} else {
			System.out.println("Capacidade Invalida");
		} 
		
		if(quantidadeAndar > 0) {
		this.quantidadeAndar = quantidadeAndar; 
		} else {
			System.out.println("Numero de andares inválidos");
		}
	} 
	public void entra() { 
		if(quantidadeAtualPessoas < capacidade) {
			quantidadeAtualPessoas++;
		} else {
			System.out.println("Elevador cheio!");
		}
	} 
	public void sai() {
		if(quantidadeAtualPessoas > 0) {
			quantidadeAtualPessoas--;
		} else {
			System.out.println("Elevador ja está vazio!");
		}
	} 
	public void sobe() {
		if(andarAtual < quantidadeAndar) {
			andarAtual++;
		}else {
			System.out.println("Já está no ultimo andar!");
		}
	} 
	public void desce() {
		if(andarAtual > 0) {
			andarAtual--; 
		}else {
			System.out.println("Já esta no terreo!");
		}
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getQuantidadeAndar() {
		return quantidadeAndar;
	}
	public void setQuantidadeAndar(int quantidadeAndar) {
		this.quantidadeAndar = quantidadeAndar;
	}
	public int getQuantidadeAtualPessoas() {
		return quantidadeAtualPessoas;
	}
	public void setQuantidadeAtualPessoas(int quantidadeAtualPessoas) {
		this.quantidadeAtualPessoas = quantidadeAtualPessoas;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
}
