
public abstract class Formacao {
	private String descricao; 
	private int periodo; 
	protected double mensalidade; 
	protected int duracao; 
	
	public String getTudo() {
		return(descricao + " - " + periodo + " - " + mensalidade + " - " + duracao); 
	} 
	
	public void definirDuracao() {
		if(this instanceof Medio) {
			duracao = 36; 
		} 
		else if(this instanceof Tecnologo) {
			duracao = 24; 
		} 
		else if(this instanceof Bacharelado) {
			duracao = 60;
		}
	}
	
	public double exibirMedia(double ps1, double ps2) {
		return exibirMedia(ps1, ps2, 0.0, 0.0, 0.0, 0.0);
	}
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return exibirMedia(ps1, ps2, nac1, nac2, 0.0,0.0);
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		return ((ps1 + ps2) * 0.5 + (nac1 + nac2) * 0.2 + (am1 + am2) * 0.3) / 2;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getPeriodo() {
		return periodo;
	}


	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}


	public double getMensalidade() {
		return mensalidade;
	}


	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}


	public int getDuracao() {
		return duracao;
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
	} 
}
