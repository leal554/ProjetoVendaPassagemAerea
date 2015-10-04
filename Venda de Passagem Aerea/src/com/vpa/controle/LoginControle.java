package com.vpa.controle;

/*
// Grupo: 
//
// 2MSIN
//
// Gabriel de Sousa Leal / RA: 201202909
//
// Andre Pacetti Dassa / RA: 201202384
//
// Eduardo Américo Rodrigues Lopes / RA: 201206168
//
*/

/*
// Usuario: admin
// Senha: 123456admin
*/

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;

import com.vpa.view.*;

public class LoginControle 
{

	private ResourceBundle us = null;
	private String Administrador = "adm";
	private String Usuario = "user";
	private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
	
	public LoginControle(String ApUsuario, String ApSenha)
	{
		us = ResourceBundle.getBundle("Usuarios");
		
		String loginUsuario = "login.usuario1";
		String loginSenha = "login.senha1";
		String tipoUsuario = "login.tipo1";
		int contador = 1;
		
		while (true) 
		{
			try 
			{
				if (ApUsuario.equals(us.getString(loginUsuario)) && ApSenha.equals(us.getString(loginSenha)))
				{	
					if(Administrador.equals(us.getString(tipoUsuario)))
					{
						Menu m = new Menu();
						return;
					}
					if(Usuario.equals(us.getString(tipoUsuario)))
					{
						MenuPassagem mp = new MenuPassagem();
						return;
					}
				} 
				else 
				{
					loginUsuario = "";
					loginSenha = "";
					tipoUsuario = "";

					contador++;
					loginUsuario = "login.usuario" + String.valueOf(contador);
					loginSenha = "login.senha" + String.valueOf(contador);
					tipoUsuario = "login.tipo" + String.valueOf(contador);
					
				}
			} 
			catch (Exception ex) 
			{
				JOptionPane.showMessageDialog(null,bn.getString("classe.loginControle.erro1"), "Erro",JOptionPane.WARNING_MESSAGE);
				contador = 1;
				Login l = new Login();
				return;
			}
		}	
	}
}
