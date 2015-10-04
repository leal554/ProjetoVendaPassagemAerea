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

import com.vpa.controle.Voo;
import com.vpa.model.AeronaveDAO;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class CadastrarVoo extends JFrame implements ActionListener
{
	
   private JButton cadastrar, voltar;
   private JLabel cadastrarVoo, label1,numeroVoo, numeroAeronave, tripulacao,horarios,label6,saida,chegada,dia,destino;
   private JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7;
   private JComboBox ComboAeronave;
   private JComboBox ComboDestino;
   private ArrayList<String> arrrayAeronaves = new ArrayList<String>();
   private  String[] aeroporto;
   private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());

   
	public CadastrarVoo()
	{
		
	  setTitle("Cadastrar Voo");
	  setBounds(300,50,570,520);
		
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setVisible(true);
	  
	  JPanel tela = new JPanel();
	  tela.setLayout(new BorderLayout());
	  
	  JPanel cadastro = new JPanel();
	  cadastro.setLayout(new GridLayout(0,2));
		
      cadastrarVoo = new JLabel(bn.getString("cadastrarVoo.cadastrarVoo"));
      cadastro.add(cadastrarVoo);
      
      label1 = new JLabel("");
      cadastro.add(label1);
      
      numeroVoo = new JLabel(bn.getString("cadastrarVoo.numeroVoo"));
      cadastro.add(numeroVoo);
      
      texto1 = new JTextField();
      cadastro.add(texto1);
      
      numeroAeronave = new JLabel(bn.getString("cadastrarVoo.numeroAeronave"));
      cadastro.add(numeroAeronave);
   
      
      AeronaveDAO adao = new AeronaveDAO();
      arrrayAeronaves = adao.numeroAeronave();
      
      ComboAeronave = new JComboBox(arrrayAeronaves.toArray());
      cadastro.add(ComboAeronave);
      
      tripulacao = new JLabel(bn.getString("cadastrarVoo.tripulacao"));
      cadastro.add(tripulacao);
      
      texto2 = new JTextField();
      cadastro.add(texto2);
      
      horarios = new JLabel(bn.getString("cadastrarVoo.horarios"));
      cadastro.add(horarios);
      
      label6 = new JLabel("");
      cadastro.add(label6);
      
      saida = new JLabel(bn.getString("cadastrarVoo.saida"));
      cadastro.add(saida);
      
      texto4 = new JTextField();
      cadastro.add(texto4);
      
      chegada = new JLabel(bn.getString("cadastrarVoo.chegada"));
      cadastro.add(chegada);
      
      texto5 = new JTextField();
      cadastro.add(texto5);
      
      dia = new JLabel(bn.getString("cadastrarVoo.dia"));
      cadastro.add(dia);
      
      texto6 = new JTextField();
      cadastro.add(texto6);
      
      destino = new JLabel(bn.getString("cadastrarVoo.destino"));
      cadastro.add(destino);

      //------------------------------
      JPanel combo = new JPanel();
      combo.setLayout(new GridLayout(2,0));
    
      Voo v = new Voo();
      aeroporto = v.getAeroportos();
      
      ComboDestino = new JComboBox(aeroporto);
      ComboDestino.setSelectedIndex(0);
      ComboDestino.addActionListener(this);
      combo.add(ComboDestino);
      
      JPanel botoes = new JPanel();
      botoes.setLayout(new GridLayout(0,2));
      
      cadastrar = new JButton(bn.getString("cadastrarVoo.botCadastrar"));
      cadastrar.addActionListener(this);
      cadastrar.add(cadastro);
      botoes.add(cadastrar);
      
      voltar = new JButton(bn.getString("cadastrarVoo.botVoltar"));
      voltar.addActionListener(this);
      botoes.add(voltar);
      
      combo.add(botoes);
        
     
      
      tela.add(cadastro, BorderLayout.CENTER);
      tela.add(combo, BorderLayout.SOUTH);
      
      getContentPane().add(tela);
		
     
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String numeroVoo = texto1.getText();
		String tripulacao = texto2.getText(); 
		String saida = texto4.getText();
		String chegada = texto5.getText(); 
		String dia = texto6.getText();
		String destino = (String) ComboDestino.getSelectedItem();
		String aeronave = (String) ComboAeronave.getSelectedItem();
		
		if(e.getSource() == cadastrar)
		{
			if(dia.length() < 10 || dia.length() > 10)
			{
				JOptionPane.showMessageDialog(null, bn.getString("cadastrarVoo.mensagem1") ,"Erro",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				
				
				new Voo(numeroVoo, Integer.parseInt(tripulacao), saida, chegada, dia, destino, aeronave);
				//JOptionPane.showMessageDialog(null, bn.getString("cadastrarVoo.mensagem2"));
				new Menu();
				dispose();
			}
		}
		
		if(e.getSource() == voltar)
		{
			new Menu();
			dispose();
		}
	}	
}