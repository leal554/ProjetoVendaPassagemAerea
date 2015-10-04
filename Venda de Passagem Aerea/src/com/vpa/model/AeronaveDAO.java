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

public class AeronaveDAO 
{
    private Statement stm;
    private Connection con;
    private ResultSet rs;
    private ArrayList<String> arrrayAeronaves = new ArrayList<String>();
    private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());

    public void InserirAeronave(String numAero, int numAcent)
    {
    	try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            stm.executeUpdate("INSERT INTO `aeronave`(`numAero`, `numAcent`,`emUso`) VALUES ('"+numAero+"','"+ numAcent+"','0')");
            con.close();
            stm.close();
            JOptionPane.showMessageDialog(null, bn.getString("dao.aeronaveDAO.mensagem1"), "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.aeronaveDAO.erro1") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList numeroAeronave() 
    {
        try 
        {
        	ConexaoDAO cdao = new ConexaoDAO();
        	con = cdao.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from aeronave WHERE emUso=0");
            int result = 0;
            while (rs.next()) 
            {
                result = 1;
                arrrayAeronaves.add(rs.getString("numAero"));
            }
            if (result == 0) 
            {
                JOptionPane.showMessageDialog(null, bn.getString("dao.aeronaveDAO.erro2"));
                arrrayAeronaves.add(bn.getString("dao.aeronaveDAO.array"));
            }
            con.close();
            stm.close();
            rs.close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, bn.getString("dao.aeronaveDAO.erro3") + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		return arrrayAeronaves;
    }
}
