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

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.vpa.model.ClienteDAO;

public class ResultadoConsultarCliente extends JFrame implements ActionListener
{
	private JTextArea cliente;
	private JButton voltar;
	private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
	 
	public ResultadoConsultarCliente()
	{
		setTitle("ConsultarCliente");
		setBounds(300,50,500,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		JPanel tela = new JPanel();
		tela.setLayout(new BorderLayout());
		
		JPanel info = new JPanel();
		info.setLayout(new GridLayout(0,1));
		
		ClienteDAO c = new ClienteDAO();
		
		cliente = new JTextArea();
		cliente.setText(c.clientes());
		cliente.setEditable(false);
		info.add(cliente);
		
		JPanel botoes = new JPanel();
		botoes.setLayout(new GridLayout(0,1));
		
		voltar = new JButton(bn.getString("ResultadoConsultarCliente.voltar"));
		voltar.addActionListener(this);
		botoes.add(voltar);
	
		tela.add(info, BorderLayout.CENTER);
		tela.add(botoes, BorderLayout.SOUTH);
		getContentPane().add(tela);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == voltar)
		{
			new MenuPassagem();
			dispose();
		}
		
	}
	
}
