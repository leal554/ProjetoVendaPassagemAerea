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

import com.vpa.controle.CheckIn;
import com.vpa.controle.Transferencia;
import com.vpa.model.CheckInDAO;
import com.vpa.model.TransferenciaDAO;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class Checkin extends JFrame implements ActionListener 
{
	
	private JButton emitir, voltar;
	private JLabel checkIn, label1,  label0, despacharBagagem, label4;
	private JRadioButton simButton, naoButton;
	private JComboBox comboCheck;
	private ArrayList<String> arrayCheck = new ArrayList<String>();
	private ResourceBundle bn = ResourceBundle.getBundle("messages",Locale.getDefault());

	public Checkin()
	{
      setTitle("Check-in");
		setBounds(300,50,350,350);
      getContentPane().setLayout(new GridLayout(0,2));
      
      String sim =  bn.getString("checkIn.radioSim"), nao =  bn.getString("checkIn.radioNao");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
      
      checkIn = new JLabel(bn.getString("checkIn.checkIn"));
      
      label1 = new JLabel("");// Fantasma para se adquar ao padrao da janela
      
      despacharBagagem = new JLabel(bn.getString("checkIn.despacharBagagem"));
      
      label4 = new JLabel("");
      
      
      CheckInDAO cdao = new CheckInDAO();
      CheckIn c = new CheckIn();
      
      arrayCheck = cdao.checkDAO(c.getIdCliente());
      
      comboCheck = new JComboBox(arrayCheck.toArray());
      
      label0 = new JLabel(bn.getString("checkIn.idPassagem"));
      
      simButton = new JRadioButton(sim);
      simButton.setMnemonic(KeyEvent.VK_B);
      simButton.setActionCommand(sim);
      simButton.setSelected(false);
      simButton.addActionListener(this);
      
      naoButton = new JRadioButton(nao);
      naoButton.setMnemonic(KeyEvent.VK_B);
      naoButton.setActionCommand(nao);
      naoButton.setSelected(false);
      naoButton.addActionListener(this);
      
      emitir = new JButton(bn.getString("checkIn.botEmitir"));
      emitir.addActionListener(this);
      
      voltar = new JButton(bn.getString("checkIn.botVoltar"));
      voltar.addActionListener(this);
      
      ButtonGroup group = new ButtonGroup();
      group.add(simButton);
      group.add(naoButton);
      
      getContentPane().add(checkIn);
      getContentPane().add(label1);
      getContentPane().add(label0);
      getContentPane().add(comboCheck);
      getContentPane().add(despacharBagagem);
      getContentPane().add(label4);
      getContentPane().add(simButton);
      getContentPane().add(naoButton);
      getContentPane().add(emitir);
      getContentPane().add(voltar);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		boolean despacharBagagem = false;
		String passagem = (String) comboCheck.getSelectedItem();

		if (simButton.isSelected()) {
			despacharBagagem = true;
		}

		if (naoButton.isSelected()) {
			despacharBagagem = false;
		}

		if (e.getSource() == emitir) {

			CheckIn c = new CheckIn();
			c.setPassagem(passagem);
			c.setDespacharBagagem(despacharBagagem);
			
			CheckInDAO cdao = new CheckInDAO();
			cdao.checkIn();

			new MenuPassagem();
			dispose();
		}

		if (e.getSource() == voltar) {
			new LoginCheckIn();
			dispose();
		}
	}
	
}