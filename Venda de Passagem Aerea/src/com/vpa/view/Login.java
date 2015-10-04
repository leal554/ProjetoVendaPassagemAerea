package com.vpa.view;

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

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;
import com.vpa.controle.*;

public class Login extends JFrame implements ActionListener {

	private JLabel login, label1, usuario, senha;
	private JTextField txUsuario;
	private JPasswordField txSenha; // TextFiled Para senhas |*****|
	private JButton bLogin, voltar;
	private ResourceBundle bn;
	private ResourceBundle us = null;
	private String ApUsuario; // Recebem as Strings do Label
	private String ApSenha;
	private String Administrador = "adm";
	private String Usuario = "user";
	

	public Login() 
	{
		bn = ResourceBundle.getBundle("messages", Locale.getDefault());
		
		setTitle("Login");
		setBounds(300, 50, 300, 200);

		getContentPane().setLayout(new GridLayout(0, 2));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		login = new JLabel(bn.getString("login.login"));
		label1 = new JLabel("");

		usuario = new JLabel(bn.getString("login.usuario"));
		txUsuario = new JTextField();

		senha = new JLabel(bn.getString("login.senha"));
		txSenha = new JPasswordField();// TextFiled Para senhas

		voltar = new JButton(bn.getString("login.voltar"));
		voltar.addActionListener(this);

		bLogin = new JButton(bn.getString("login.bLogin"));
		bLogin.addActionListener(this);

		getContentPane().add(login);
		getContentPane().add(label1);
		getContentPane().add(usuario);
		getContentPane().add(txUsuario);
		getContentPane().add(senha);
		getContentPane().add(txSenha);

		getContentPane().add(voltar);
		getContentPane().add(bLogin);

	}

	public void actionPerformed(ActionEvent e) 
	{
		ApUsuario = txUsuario.getText().toUpperCase();
		ApSenha = txSenha.getText();
		
		us = ResourceBundle.getBundle("Usuarios");
		
		String loginUsuario = "login.usuario1";
		String loginSenha = "login.senha1";
		String tipoUsuario = "login.tipo1";
		int contador = 1;

		if (e.getSource() == bLogin) 
		{
			LoginControle l = new LoginControle(ApUsuario, ApSenha);
			dispose();
		}

		if (e.getSource() == voltar) 
		{
			Linguagem l = new Linguagem();
			dispose();
		}
	}
}