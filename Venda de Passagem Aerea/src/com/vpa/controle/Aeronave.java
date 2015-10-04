package com.vpa.controle;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.vpa.model.AeronaveDAO;
import com.vpa.view.Menu;

public class Aeronave 
{
	private String numeroDaAeronave;
	private int numeroDeAcentos;
	private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());

	public Aeronave(){}
	
	public Aeronave(String numeroDaAeronave, int numeroDeAcentos)
	{
		if(numeroDaAeronave.length() > 0  )
		{
			this.numeroDaAeronave = numeroDaAeronave;
		}
		if(numeroDeAcentos > 0 )
		{
			this.numeroDeAcentos = numeroDeAcentos;
		}
		else 
		{
			JOptionPane.showMessageDialog(null, bn.getString("classe.aeronave.erro1"));
			return;
		}
		
		AeronaveDAO adao = new AeronaveDAO();
		adao.InserirAeronave(this.numeroDaAeronave, numeroDeAcentos);
	}
	
	public String getNumeroDaAeronave() 
	{
		return numeroDaAeronave;
	}
	
	public void setNumeroDaAeronave(String numeroDaAeronave) 
	{
		if(numeroDaAeronave.length() >= 0  )
		{
			this.numeroDaAeronave = numeroDaAeronave;
		}
	}
	
	public int getNumeroDeAcentos() 
	{
		return numeroDeAcentos;
	}
	
	public void setNumeroDeAcentos(int numeroDeAcentos) 
	{
		if(numeroDeAcentos >= 0 )
		{
			this.numeroDeAcentos = numeroDeAcentos;
		}
	}
	
	
}
