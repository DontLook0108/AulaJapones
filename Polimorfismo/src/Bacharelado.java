
public class Bacharelado extends Formacao {
	private String projetoConclusao; 
	private int cargaHorariaEstagio; 
	
	public String getTudo() {
		return (super.getTudo() + " - " + projetoConclusao + " - " + cargaHorariaEstagio);
	} 
	public void calcularMensalidade(double fator) {
		super.definirDuracao(); //opcional 
		mensalidade = duracao * fator * 600 + (cargaHorariaEstagio * 12);
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
}
