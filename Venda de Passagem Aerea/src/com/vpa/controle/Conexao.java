package com.vpa.controle;

import java.sql.SQLException;

import com.vpa.model.ConexaoDAO;

public class Conexao 
{
	public Conexao() throws SQLException
	{
		ConexaoDAO cd = new ConexaoDAO();
	}
}
