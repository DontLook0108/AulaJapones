package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.projeto.beans.Assinatura;
import br.com.projeto.conexao.Conexao;

public class AssinaturaDAO {
	private Connection con; 
	private PreparedStatement stmt; 
	private ResultSet rs; 
	
	public AssinaturaDAO() throws Exception{ 
		con = Conexao.queroConectar();
	} 
	
	public int addAssinatura(Assinatura a) throws Exception {
		stmt = con.prepareStatement("INSERT INTO RW_T_ASSINATURA"
				+ "(CD_ASSINATURA, "
				+ "TP_ASSINATURA, VL_ASSINATURA, "
				+ "DT_ASSINATURA, CD_USUARIO) VALUES(?,?,?,?,?)"); 
		stmt.setInt(1, a.getCodigo());
		stmt.setString(2, a.getTipo());
		stmt.setDouble(3, a.getValor());
		stmt.setString(4, a.getData());
		stmt.setInt(5, a.getUsuario().getCodigo()); 
		return stmt.executeUpdate();
	}
	
	public boolean verificarUsuario(int codigoUsuario) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM RW_T_ASSINATURA WHERE CD_USUARIO=?"); 
		stmt.setInt(1, codigoUsuario); 
		rs = stmt.executeQuery(); 
		return rs.next();
	}
	
	public void encerrar() throws Exception{
		con.close();
	}
}
