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

public class Menu extends JFrame implements ActionListener 
{
	public JButton btcadastrarVoo, btcadastrarAeronave, btmenuPassagem;
	private ResourceBundle bn = null;

	public Menu() 
	{

		bn = ResourceBundle.getBundle("messages", Locale.getDefault());

		setTitle("Menu");
		setBounds(300, 50, 350, 350);

		getContentPane().setLayout(new GridLayout(0, 1));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		btcadastrarVoo = new JButton(bn.getString("menu.btcadastrarVoo"));
		btcadastrarVoo.addActionListener(this);

		btcadastrarAeronave = new JButton(bn.getString("menu.btcadastrarAeronave"));
		btcadastrarAeronave.addActionListener(this);

		btmenuPassagem = new JButton(bn.getString("menu.btMenuPassagem"));
		btmenuPassagem.addActionListener(this);

		getContentPane().add(btcadastrarVoo);
		getContentPane().add(btcadastrarAeronave);
		getContentPane().add(btmenuPassagem);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btcadastrarVoo) {
			CadastrarVoo cv = new CadastrarVoo();
			dispose();
		}
		if (e.getSource() == btcadastrarAeronave) {
			CadastroAeronave ca = new CadastroAeronave();
			dispose();
		}
		if (e.getSource() == btmenuPassagem) {
			MenuPassagem mp = new MenuPassagem();
			dispose();
		}
	}
}