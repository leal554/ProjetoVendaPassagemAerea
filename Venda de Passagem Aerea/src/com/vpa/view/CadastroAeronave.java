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
import com.vpa.controle.Aeronave;
import java.util.Locale;
import java.util.ResourceBundle;

public class CadastroAeronave extends JFrame implements ActionListener
{
   private JButton cadastrar, voltar;
   private JLabel cadastrarAeronave, label1, numeroAeronave, numeroAcentos;
   private JTextField texto1,texto2;
   private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
   
	public CadastroAeronave()
	{		
		setTitle("Cadastrar Aeronave");
		setBounds(300,50,300,200);
		
		getContentPane().setLayout(new GridLayout(0,2));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
      
      cadastrarAeronave = new JLabel(bn.getString("cadastrarAeronave.cadastrarAeronave"));
      label1 = new JLabel("");
      
      numeroAeronave = new JLabel(bn.getString("cadastrarAeronave.numeroAeronave"));
      texto1 = new JTextField();
      
      numeroAcentos = new JLabel(bn.getString("cadastrarAeronave.numeroAcentos"));
      texto2 = new JTextField();
      
      cadastrar = new JButton(bn.getString("cadastrarAeronave.botCadastrar"));
      cadastrar.addActionListener(this);
      
      voltar = new JButton(bn.getString("cadastrarAeronave.botVoltar"));
      voltar.addActionListener(this);
      

		
	  getContentPane().add(cadastrarAeronave);
      getContentPane().add(label1);
      getContentPane().add(numeroAeronave);
      getContentPane().add(texto1);
      getContentPane().add(numeroAcentos);
      getContentPane().add(texto2);
      
      getContentPane().add(cadastrar);
      getContentPane().add(voltar);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String numeroAeronave = texto1.getText();
		String numeroAcentos = texto2.getText();
		
		if(e.getSource() == cadastrar)
		{
			new Aeronave(numeroAeronave, Integer.parseInt(numeroAcentos));
			new Menu();
			dispose();
		}
		
		if(e.getSource() == voltar)
		{
			new Menu();
			dispose();
		}
	}
}