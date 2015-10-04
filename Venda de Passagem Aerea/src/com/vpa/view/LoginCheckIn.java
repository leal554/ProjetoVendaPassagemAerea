package com.vpa.view;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFrame;

import com.vpa.controle.CheckIn;
import com.vpa.controle.Cliente;

public class LoginCheckIn extends JFrame implements ActionListener
{
		private JButton login, voltar;
		private JLabel digiteDados, label0,idCliente,senha ;
		private JTextField texto1;
		private JPasswordField texto2;
	 	private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());

		public LoginCheckIn()
		{
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setTitle("Login CheckIN");
			setBounds(300,50,500,350);
				
			//setResizable(false); // Não maximiza
			
			
	      Container tela = getContentPane();
	      tela.setLayout(new GridLayout(0,2));
	      
	      digiteDados = new JLabel(bn.getString("loginCheckIn.digiteDados"));
	      label0 = new JLabel();
	     
	      idCliente = new JLabel(bn.getString("loginCheckIn.idCliente"));
	      texto1 = new JTextField();
	      
	      senha = new JLabel(bn.getString("loginCheckIn.senha"));
	      texto2 = new JPasswordField();
	     
	      login = new JButton(bn.getString("loginCheckIn.login"));
	      login.addActionListener(this);
	      
	      voltar = new JButton(bn.getString("loginCheckIn.voltar"));
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
	@Override
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
				CheckIn ci = new CheckIn();
				ci.setIdCliente(email);
				
				new Checkin();
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, bn.getString("loginCheckIn.erro1"));
			}
		}
		if(e.getSource() == voltar)
		{
			new MenuPassagem();
			dispose();
		}
		
	}
}
