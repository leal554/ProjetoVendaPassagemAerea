package com.vpa.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.vpa.controle.Passagem;
import com.vpa.controle.Transferencia;

public class TransferenciaDAO 
{
	private Statement stm;
    private Connection con;
    private ResultSet rs;
    private ArrayList<String> passagens = new ArrayList<String>();
    private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
    
    public void transferrirVoo()
    {
        try 
        {
        	Transferencia t = new Transferencia();
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
           
            stm.executeUpdate("UPDATE `passagem` SET `idCliente`= '"+t.getIdCliente2()+"' WHERE `idCliente` = '"+t.getIdCliente()+"' AND `id` = '"+t.getPassagem()+"'");
            stm.close();
            
            JOptionPane.showMessageDialog(null, bn.getString("dao.transferencia.mensagem1") + t.getIdCliente2());
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.transferencia.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList passagensDAO(String idCliente) 
    {
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from passagem WHERE idCliente = '" + idCliente+"'");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                passagens.add(rs.getString("id"));
            }
            if (result == 0) 
            {
            	passagens.add(bn.getString("dao.transferencia.erro2"));
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.transferencia.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return passagens;
    }
}
