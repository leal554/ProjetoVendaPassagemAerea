package com.vpa.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.vpa.model.ConexaoDAO;

public class ClienteDAO 
{
	private Statement stm;
    private Connection con;
    private ResultSet rs;
    private int idCliente;
    private String email;
    private String senha;
    private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
    
    public void InserirCliente(String nome, String rg, String cpf, String endereco, int cep, String srSraSr, String estadoCivil, String emprego,
				String email, String senha)
    {
    	try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            stm.executeUpdate("INSERT INTO `cliente`(`nome`, `rg`, `cpf`, `endereco`, `cep`, `sr`, `estadoCivil`, `emprego`, `email`, `senha`) "
            				+ "VALUES ('"+nome+"','"+ rg+"','"+ cpf+"','"+ endereco+"','"+ cep+"','"+ srSraSr+"','"+ estadoCivil+"','"+ emprego+"','"+ email+"','"+ senha+"')");
            con.close();
            stm.close();
            JOptionPane.showMessageDialog(null,  bn.getString("dao.cliente.mensagem1"), "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean consultarCliente(int idCliente , String senha) 
    {
    	boolean login = false;
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from cliente");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                this.idCliente = rs.getInt("id");
                this.senha = rs.getString("senha");
            }
            if (result == 0) 
            {
                JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro2"), "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
            
            if(this.idCliente == idCliente && this.senha.equals(senha))
            {
            	login = true;
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,  bn.getString("dao.cliente.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            login = false;
        }
		return login;
    }
    
    public String clientes() 
    {
    	String cliente = "";
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from cliente");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                cliente += "Id: " + rs.getInt("id") +"\n Nome: "+ rs.getString("nome") + "\n RG: "+ rs.getString("rg") + "\n CPF: "+rs.getString("cpf")
                		+ "\n Endere�o: " + rs.getString("endereco") + "\n CEP: "+ rs.getInt("cep") + "\n Tratamento: " + rs.getString("sr")
                		+ "\n Estado Civil: " + rs.getString("estadoCivil") + "\n Emprego: " + rs.getString("emprego") + "\n Email: " + rs.getString("email") + "\n\n\n";
            }
            if (result == 0) 
            {
                JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro2"), "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return cliente;
    }
    
    public boolean loginClienteDAO(String email , String senha) 
    {
    	boolean login = false;
    	
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from cliente");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                this.email = rs.getString("email");
                this.senha = rs.getString("senha");
            }
            if (result == 0) 
            {
                JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro3"), "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
            
            if(this.email.equals(email) && this.senha.equals(senha))
            {
            	login = true;
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            login = false;
        }
		return login;
    }
    
    public String getIdClienteDAO(String email) 
    {
    	String id = null;
    	
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from cliente");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                id = rs.getString("email");
            }
            if (result == 0) 
            {
                JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro2"), "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.cliente.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return id;
    }
}
