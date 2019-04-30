package beans;

public class Vôo {
	private String hora; 
	private String origem; 
	private String destino;
	private String num_voo; 
	private String empresa;
	private Escala[] escalas = new Escala[10];
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getNum_voo() {
		return num_voo;
	}
	public void setNum_voo(String num_voo) {
		this.num_voo = num_voo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Escala[] getEscalas() {
		return escalas;
	}
	public void setEscalas(Escala[] escalas) {
		this.escalas = escalas;
	}
}
