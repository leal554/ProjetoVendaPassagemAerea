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
import com.vpa.controle.Passagem;
import com.vpa.controle.Transferencia;
import com.vpa.model.TransferenciaDAO;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class TransferenciaPassagem extends JFrame implements ActionListener
{
   private JButton Transferir, voltar;
   private JLabel info, label0,label1, idBeneficiario, idPassagem;
   private JTextField texto1,texto2;
   private JComboBox comboPassagem;
   private ArrayList<String> arrayPassagens = new ArrayList<String>();
   private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
   
	public TransferenciaPassagem()
	{		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
       
		setTitle("Transferencia de Passagem");
		setBounds(300,50,500,350);
		
      Container tela = getContentPane();
      tela.setLayout(new GridLayout(0,2));
      
      info = new JLabel(bn.getString("TransferenciaPassagem.info"));
      
      label0 = new JLabel("");
      
      idBeneficiario = new JLabel(bn.getString("TransferenciaPassagem.idBeneficiario"));
      texto1 = new JTextField();
      
      label1 = new JLabel(bn.getString("TransferenciaPassagem.label1"));
      
      TransferenciaDAO tdao = new TransferenciaDAO();
      Transferencia t = new Transferencia();
      
      arrayPassagens = tdao.passagensDAO(t.getIdCliente());
      
      comboPassagem = new JComboBox(arrayPassagens.toArray());
     
      Transferir = new JButton(bn.getString("TransferenciaPassagem.transferir"));
      Transferir.addActionListener(this);
      
      voltar = new JButton(bn.getString("TransferenciaPassagem.voltar"));
      voltar.addActionListener(this);
      
      tela.add(info);
      tela.add(label0);
      tela.add(idBeneficiario);
      tela.add(texto1);
      tela.add(label1);
      tela.add(comboPassagem);
      tela.add(Transferir);
      tela.add(voltar);

	}
	
	public void actionPerformed(ActionEvent e)
	{
		String email = texto1.getText();
		String passagem = (String) comboPassagem.getSelectedItem();
		
		if(e.getSource() == Transferir)
		{
				Transferencia t = new Transferencia();
				t.setIdCliente2(email);
				
				t.setPassagem(passagem);
				
				TransferenciaDAO tdao = new TransferenciaDAO();
				tdao.transferrirVoo();
				
				new TransferenciaPassagem();
				dispose(); 

		}
		
		if(e.getSource() == voltar)
		{
			new LoginTransferencia();
			dispose();
		}
	}
	
	public static void main(String [] args)
	{
		TransferenciaPassagem t = new TransferenciaPassagem();
	}
}