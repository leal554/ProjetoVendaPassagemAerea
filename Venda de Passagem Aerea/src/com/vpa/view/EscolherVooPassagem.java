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

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import com.vpa.controle.Pagamento;
import com.vpa.controle.Passagem;
import com.vpa.controle.Voo;

public class EscolherVooPassagem extends JFrame implements ActionListener
{
	private JLabel escolhaDestino, escolherVoo, vooPartida, sp, dataPartida, dataChegada,horaPartida,horaChegada;
	private JTextField textoPartida, textoChegada, textoHoraPartida, textoHoraChegada;
	private JButton comprar, voltar;
	private JComboBox cVooPara;
	private ArrayList<String> arrayVoo = new ArrayList<String>();
	private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
	
	public EscolherVooPassagem()
	{
		setTitle("Check-in");
		setBounds(300,50,550,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel tela = new JPanel();
		tela.setLayout(new BorderLayout());
		
		JPanel PanelVoo = new JPanel();
		PanelVoo.setLayout(new GridLayout(0,1));
      
		escolhaDestino = new JLabel(bn.getString("escolherVooPassagem.escolhaDestino"));
		PanelVoo.add(escolhaDestino);
		
		vooPartida = new JLabel(bn.getString("escolherVooPassagem.vooPartida"));
		PanelVoo.add(vooPartida);

		sp = new JLabel(bn.getString("escolherVooPassagem.sp"));
		PanelVoo.add(sp);

		escolherVoo = new JLabel(bn.getString("escolherVooPassagem.escolherVoo"));
		PanelVoo.add(escolherVoo);
		
		Voo v = new Voo();
		arrayVoo = v.destinos();
		
		cVooPara =new JComboBox(arrayVoo.toArray());
		cVooPara.addActionListener(this);
		PanelVoo.add(cVooPara);
		
		//-----------------------------------
		
		JPanel label = new JPanel();
		label.setLayout(new GridLayout(0,2));
		
		dataPartida = new JLabel(bn.getString("escolherVooPassagem.dataPartida"));
		label.add(dataPartida);
		
		textoPartida = new JTextField("--/--/----");
		textoPartida.setEditable(false);
		label.add(textoPartida);
		
		horaPartida = new JLabel(bn.getString("escolherVooPassagem.horaPartida"));
		label.add(horaPartida);
		
		textoHoraPartida = new JTextField("--:--");
		textoHoraPartida.setEditable(false);
		label.add(textoHoraPartida);
		
		dataChegada = new JLabel(bn.getString("escolherVooPassagem.dataChegada"));
		label.add(dataChegada);
		
		textoChegada = new JTextField("--/--/----");
		textoChegada.setEditable(false);
		label.add(textoChegada);
		
		horaChegada = new JLabel(bn.getString("escolherVooPassagem.horaChegada"));
		label.add(horaChegada);
		
		textoHoraChegada = new JTextField("--:--");
		textoHoraChegada.setEditable(false);
		label.add(textoHoraChegada);
		
		comprar = new JButton(bn.getString("escolherVooPassagem.comprar"));
		comprar.addActionListener(this);
		label.add(comprar);
		
		voltar = new JButton(bn.getString("escolherVooPassagem.voltar"));
		voltar.addActionListener(this);
		label.add(voltar);
		
		tela.add(PanelVoo, BorderLayout.CENTER);
		tela.add(label, BorderLayout.SOUTH);
		getContentPane().add(tela);

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String voo = (String) cVooPara.getSelectedItem();

		if(e.getSource() == cVooPara)
		{
			Voo v = new Voo();
			
			textoPartida.setText(v.diaSaida());//dia de partida e chega iguais
			textoChegada.setText(v.diaSaida());
			 
			textoHoraPartida.setText(v.horaSaida());
			textoHoraChegada.setText(v.horaChegada());
		}
		
		if(e.getSource() == comprar)
		{
			String numeroVoo, numeroAeronave;
			
			Voo v = new Voo();
			numeroVoo = v.getNumeroVoo();
			numeroAeronave = v.getNumeroAeronave();
			
			Passagem p = new Passagem();
			p.setNumeroVoo(numeroVoo);
			p.setNumeroAeronave(numeroAeronave);
			
			
			new ComprarPassagem();
			dispose();
			
		}
		if(e.getSource() == voltar)
		{
			new LoginComprarPassagem();
			dispose();
		}
		
	}
}
