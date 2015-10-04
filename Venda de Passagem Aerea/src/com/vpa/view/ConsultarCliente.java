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

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import com.vpa.controle.Cliente;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConsultarCliente extends JFrame implements ActionListener
{
   private JButton consultar, voltar;
   private JLabel nomeCliente, idCliente;
   private JTextField texto1;
   private JPasswordField texto2;
   private ResourceBundle  bn = ResourceBundle.getBundle("messages", Locale.getDefault());
   
	public ConsultarCliente()
	{
		setTitle("ConsultarCliente");
		setBounds(300,50,300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		getContentPane().setLayout(new GridLayout(0,2));
      
      nomeCliente = new JLabel(bn.getString("consultarCliente.email"));
      texto1 = new JTextField();
      
      idCliente = new JLabel(bn.getString("consultarCliente.senha"));
      texto2 = new JPasswordField();
      
      consultar = new JButton(bn.getString("consultarCliente.consultar"));
      consultar.addActionListener(this);
      
      voltar = new JButton(bn.getString("consultarCliente.Voltar"));
      voltar.addActionListener(this);
      

		
      getContentPane().add(nomeCliente);
      getContentPane().add(texto1);
      getContentPane().add(idCliente);
      getContentPane().add(texto2);
      getContentPane().add(consultar);
      getContentPane().add(voltar);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String email = texto1.getText();
		String senha = texto2.getText();
		
		boolean clienteLogin = false;
		
		Cliente c = new Cliente();
		clienteLogin = c.loginCliente(email, senha);
		
		if(e.getSource() == consultar)
		{
			if(clienteLogin)
			{
				ResultadoConsultarCliente rcc = new ResultadoConsultarCliente();
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, bn.getString("consultarCliente.erro1"));
			}
		}
		
		if(e.getSource() == voltar)
		{
			new MenuPassagem();
			dispose();
		}
	}
}