
public class Tecnologo extends Formacao {
	private boolean planoEstendido;
	
	public String getTudo() {
		return (super.getTudo() + " - " + planoEstendido);
	}
	public void calcularMensalidade(double fator) {
		super.definirDuracao(); //opcional 
		mensalidade = duracao * fator * 600;
	}
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	} 
}
