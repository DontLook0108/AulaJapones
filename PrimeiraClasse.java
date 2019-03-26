
public class PrimeiraClasse { 
	private String descricao; 
	private String marca; 
	private int codigo; 
	private double valor;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}  
	public String getBasico() {
		return codigo + "-" + descricao;
	} 
	public String getDetalheMarca() {
		return "A marca é: " + marca; 
	} 
	public double getDesconto() {
		return valor * 0.9; 
	} 
	public String getValores() {
		return "produto sem parcelar: " + valor + 
		"produto parcelado: " + (valor * 1.1); 
	} 
	public void setBasico( int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;  
	}

}
