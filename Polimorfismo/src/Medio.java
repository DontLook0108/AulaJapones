
public class Medio extends Formacao {
	private String tipo;
	
	public String getTudo() {
		return (super.getTudo() + " - " + tipo);
	}
	public void calcularMensalidade(double fator) { 
		super.definirDuracao(); //opcional 
		mensalidade = duracao * fator * 500;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
