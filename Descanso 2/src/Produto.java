
public class Produto {
	private String descricao;
	private double valor;
	private int codigo;
	private String marca; 

	public String getDescricao() {
		return descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getValor() {
		return valor;
	}

	public String getMarca() {
		return marca;
	} 
	public String getBasico() {
		return descricao + codigo;   
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	} 
	

}
