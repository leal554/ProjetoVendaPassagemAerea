package com.vpa.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.vpa.model.ConexaoDAO;

public class VooDAO 
{
	private Statement stm;
    private Connection con;
    private ResultSet rs;
    private ArrayList<String> voo = new ArrayList<String>();
    private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
    
    public void InserirVoo(String numeroVoo,int tripulacao,String saida,String chegada,String dia,String destino, String aeronave)
    {
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            stm.executeUpdate("INSERT INTO `voo`(`numeroVoo`, `tripulacao`, `saida`, `chegada`, `dia`, `destino`,`numeroAeronave`) "
            				+ "VALUES ('"+numeroVoo+"','"+ tripulacao+"','"+ saida+"','"+ chegada+"','"+ dia+"','"+ destino+"','"+ aeronave+"')");
            stm.executeUpdate("UPDATE  `aeronave` SET `emUso` = 1 WHERE numAero =" +aeronave);
            con.close();
            stm.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.voo.erro1")  + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList detinosDAO() 
    {
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from voo WHERE destino is Not Null");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                voo.add( 0 ,rs.getString("destino"));
            }
            if (result == 0) 
            {
                voo.add(bn.getString("dao.voo.erro2"));
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null,  bn.getString("dao.voo.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return voo;
    }

	public String diaSaidaDAO() 
    {
    	String dia = "";
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from voo WHERE dia is Not Null");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                dia = rs.getString("dia");
            }
            if (result == 0) 
            {
            	dia = (bn.getString("dao.voo.erro3"));
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.voo.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return dia;
    }
    
    public String horaSaidaDAO() 
    {
    	String horaSaida = "";
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from voo WHERE saida is Not Null");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                horaSaida = rs.getString("saida");
            }
            if (result == 0) 
            {
            	horaSaida = (bn.getString("dao.voo.erro4"));
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.voo.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return horaSaida;
    }
    
    public String horaChegadaDAO() 
    {
    	String horaChegada = "";
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from voo WHERE saida is Not Null");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                horaChegada = rs.getString("saida");
            }
            if (result == 0) 
            {
            	horaChegada = (bn.getString("dao.voo.erro4"));
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.voo.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return horaChegada;
    }
    
    public String numeroVoo() 
    {
    	String numeroVoo = null;
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from voo WHERE numeroVoo is Not Null");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                numeroVoo = rs.getString("numeroVoo");
            }
            if (result == 0) 
            {
            	JOptionPane.showMessageDialog(null, bn.getString("dao.voo.erro5"), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.voo.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return numeroVoo;
    }
    
    public String numeroAeronave() 
    {
    	String numeroAeronave = null;
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from voo WHERE numeroAeronave is Not Null");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                numeroAeronave = rs.getString("numeroAeronave");
            }
            if (result == 0) 
            {
            	JOptionPane.showMessageDialog(null, bn.getString("dao.voo.erro6"), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.voo.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return numeroAeronave;
    }
}
