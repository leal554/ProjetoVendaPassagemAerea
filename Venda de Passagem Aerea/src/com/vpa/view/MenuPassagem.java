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
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuPassagem extends JFrame implements ActionListener
{
   private JButton comprarPassagem, novoCliente, consultarCliente, transferirPassagem, checkin, voltar;
   private ResourceBundle bn = null;
	
	public MenuPassagem()
	{
		bn = ResourceBundle.getBundle("messages", Locale.getDefault());
      
		setTitle("Menu Passagem");
		setBounds(300,50,350,350);
		
		getContentPane().setLayout(new GridLayout(0,1));
		
      comprarPassagem = new JButton(bn.getString("menuPassagem.comprarPassagem"));
      comprarPassagem.addActionListener(this);
  		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
    
		
      novoCliente = new JButton(bn.getString("menuPassagem.novoCliente"));
      novoCliente.addActionListener(this);
      
      consultarCliente = new JButton(bn.getString("menuPassagem.consultarCliente"));
      consultarCliente.addActionListener(this);
      
      transferirPassagem = new JButton(bn.getString("menuPassagem.transferirPassagem"));
      transferirPassagem.addActionListener(this);
      
      checkin = new JButton(bn.getString("menuPassagem.checkin"));
      checkin.addActionListener(this);
      
		
      getContentPane().add(comprarPassagem);
      getContentPane().add(novoCliente);
      getContentPane().add(consultarCliente);
      getContentPane().add(transferirPassagem);
      getContentPane().add(checkin);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == comprarPassagem)
		{
			new LoginComprarPassagem();
			dispose();
		}
		if(e.getSource() == novoCliente)
		{
			new CadastrarCliente(); 
			dispose();
		}
		if(e.getSource() == consultarCliente)
		{
			new ConsultarCliente();
			dispose();
		}
		if(e.getSource() == transferirPassagem)
		{
			new LoginTransferencia();
			dispose();
		}
		if(e.getSource() == checkin)
		{
			new LoginCheckIn();
			dispose();
		}

	}
}