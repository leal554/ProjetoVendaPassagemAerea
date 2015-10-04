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
import java.util.ResourceBundle.Control;

public class Linguagem extends JFrame implements ActionListener 
{
	private JButton engles, portugues;
	ResourceBundle bn;

	public Linguagem() {
		setTitle("Linguagem");
		setBounds(300, 50, 350, 350);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		getContentPane().setLayout(new GridLayout(0, 1));

		engles = new JButton("English");
		engles.addActionListener(this);

		portugues = new JButton("Português");
		portugues.addActionListener(this);

		getContentPane().add(engles);
		getContentPane().add(portugues);

	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == engles) 
		{	
			Locale.setDefault(new Locale("en", "US"));
			Login log = new Login();
			dispose();
		}
		if (e.getSource() == portugues) 
		{
			Locale.setDefault(new Locale("pt", "BR"));
			Login log = new Login();
			dispose();
		}
	}
}