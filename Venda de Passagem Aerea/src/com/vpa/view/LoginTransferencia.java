package com.vpa.view;

/*
//Grupo: 
//
//2MSIN
//
//Gabriel de Sousa Leal / RA: 201202909
//
//Andre Pacetti Dassa / RA: 201202384
//
//Eduardo Américo Rodrigues Lopes / RA: 201206168
//
*/

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.vpa.controle.Cliente;
import com.vpa.controle.Passagem;
import com.vpa.controle.Transferencia;

public class LoginTransferencia extends JFrame implements ActionListener
{
		private JButton login, voltar;
		private JLabel label0, digiteDados, idCliente, senha;
		private JTextField texto1;
		private JPasswordField texto2;
		private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
	   
		public LoginTransferencia()
		{
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setTitle("Login Tranferir Passagem");
			setBounds(300,50,500,350);
				
			setResizable(false); // Não maximiza
			
			
	      Container tela = getContentPane();
	      tela.setLayout(new GridLayout(0,2));
	      
	      digiteDados = new JLabel(bn.getString("loginTransferencia.digiteDados"));
	      label0 = new JLabel();
	     
	      idCliente = new JLabel(bn.getString("loginTransferencia.idCliente"));
	      texto1 = new JTextField();
	      
	      senha = new JLabel(bn.getString("loginTransferencia.senha"));
	      texto2 = new JPasswordField();
	     
	      login = new JButton(bn.getString("loginTransferencia.login"));
	      login.addActionListener(this);
	      
	      voltar = new JButton(bn.getString("loginTransferencia.voltar"));
	      voltar.addActionListener(this);
	      
	      
	      tela.add(digiteDados);
	      tela.add(label0);
	      tela.add(idCliente);
	      tela.add(texto1);
	      tela.add(senha);
	      tela.add(texto2);
	      tela.add(login);
	      tela.add(voltar);
	      
		}
		
		public void actionPerformed(ActionEvent e)
		{
			String email = texto1.getText();
			String senha = texto2.getText();
			
			boolean clienteLogin = false;
			
			Cliente c = new Cliente();
			clienteLogin = c.loginCliente(email, senha);
			
			if(e.getSource() == login)
			{
				if(clienteLogin)
				{
					Transferencia t = new Transferencia();
					t.setIdCliente(email);
					
					new TransferenciaPassagem();
					dispose(); 
				}
				else
				{
					JOptionPane.showMessageDialog(null, bn.getString("loginTransferencia.erro1"));
				}
			}
			
			if(e.getSource() == voltar)
			{
				MenuPassagem mp = new MenuPassagem();
				dispose();
			}
		}
}
