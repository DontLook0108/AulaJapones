import java.sql.Date;

public class T_SCA_MODALIDADE extends T_SCA_PROF_MODALIDADE{
	private int cd_modalidade; 
	private String ds_modalidade; 
	private Date dt_inicio; 
	private Date dt_termino;
	
	public int getCd_modalidade() {
		return cd_modalidade;
	}
	public void setCd_modalidade(int cd_modalidade) {
		this.cd_modalidade = cd_modalidade;
	}
	public String getDs_modalidade() {
		return ds_modalidade;
	}
	public void setDs_modalidade(String ds_modalidade) {
		this.ds_modalidade = ds_modalidade;
	}
	public Date getDt_inicio() {
		return dt_inicio;
	}
	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	public Date getDt_termino() {
		return dt_termino;
	}
	public void setDt_termino(Date dt_termino) {
		this.dt_termino = dt_termino;
	} 
}
