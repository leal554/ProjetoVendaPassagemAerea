package com.vpa.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.vpa.controle.Passagem;

public class PassagemDAO 
{
	private Statement stm;
    private Connection con;
    private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
    
    public void InserirPassagemDAO()
    {
        try 
        {
        	Passagem p = new Passagem();
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            stm.executeUpdate("INSERT INTO `passagem`(`pesoBagagem`, `numeroBagagem`, `necessidadeEspecial`, `crianca`, `idaEvolta`, `formaPagamento`, `numeroCartao`, "
            				+ "`codSeguranca`, `dataIda`, `dataVolta`, `valor`, `numeroAeronave`, `numeroVoo`, `idCliente`, `acento`) "
            		
            				+ " VALUES ('"+p.getPesoBagagem()+"','"+ p.getNumeroBagagem()+"','"+ p.getNecessidadeEspecial()+"','"+ p.getCriança()+"','"+ p.getIdaEvolta()+"','"+ p.getFormaPagamento()+"','"
            				+ p.getNumeroCartao()+"','"+ p.getCodSeguranca()+"','"+ p.getDataIda()+"','"+ p.getDataVolta()+"','"+ p.getValor()+"','"+ p.getNumeroAeronave()+"','"+ p.getNumeroVoo()+"','"+ p.getIdCliente()+"','"
            				+ p.getAcento()+"')");
            con.close();
            stm.close();
            JOptionPane.showMessageDialog(null, bn.getString("dao.passagem.erro1") , "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.passagem.erro2") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    public void inserirIdCliente(String Email)
    {
    	try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            stm.executeUpdate("INSERT INTO `passagem`(`idCliente`) " + " VALUES ('"+Email+"')");
            con.close();
            stm.close();
            JOptionPane.showMessageDialog(null, bn.getString("dao.passagem.erro3") , "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.passagem.erro2") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
