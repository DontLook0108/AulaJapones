import java.sql.Date;

public class T_SCA_PROFESSOR extends T_SCA_PROF_MODALIDADE{
	private int nr_matricula_professor; 
	private String nm_profesor; 
	private String ds_apelido; 
	private Date dt_nascimento; 
	private long nr_cpf; 
	private long nr_rg; 
	private String ds_sexo; 
	private String ds_endereco; 
	private int nr_telefone; 
	private String ds_email;
	
	public int getNr_matricula_professor() {
		return nr_matricula_professor;
	}
	public void setNr_matricula_professor(int nr_matricula_professor) {
		this.nr_matricula_professor = nr_matricula_professor;
	}
	public String getNm_profesor() {
		return nm_profesor;
	}
	public void setNm_profesor(String nm_profesor) {
		this.nm_profesor = nm_profesor;
	}
	public String getDs_apelido() {
		return ds_apelido;
	}
	public void setDs_apelido(String ds_apelido) {
		this.ds_apelido = ds_apelido;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public long getNr_cpf() {
		return nr_cpf;
	}
	public void setNr_cpf(long nr_cpf) {
		this.nr_cpf = nr_cpf;
	}
	public long getNr_rg() {
		return nr_rg;
	}
	public void setNr_rg(long nr_rg) {
		this.nr_rg = nr_rg;
	}
	public String getDs_sexo() {
		return ds_sexo;
	}
	public void setDs_sexo(String ds_sexo) {
		this.ds_sexo = ds_sexo;
	}
	public String getDs_endereco() {
		return ds_endereco;
	}
	public void setDs_endereco(String ds_endereco) {
		this.ds_endereco = ds_endereco;
	}
	public int getNr_telefone() {
		return nr_telefone;
	}
	public void setNr_telefone(int nr_telefone) {
		this.nr_telefone = nr_telefone;
	}
	public String getDs_email() {
		return ds_email;
	}
	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}
}
