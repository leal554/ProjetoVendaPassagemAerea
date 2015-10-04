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

import com.vpa.controle.Pagamento;
import com.vpa.controle.Passagem;

import java.util.Locale;
import java.util.ResourceBundle;

public class ComprarPassagem extends JFrame implements ActionListener
{
	private JButton escolherAcento, voltar;
	private JLabel comprarPassagem, label1, pesoBagagem,numBagagem,necessidadeEspecial,label5,crianca,label7,idaVolta,label9,formaPagamento,label11,numeroCartao,codSeguranca,
				   dataIda,dataVolta;
	private JTextField texto1,texto2,texto3,texto4,texto5,texto6;
	private JRadioButton neSim,neNao,cSim,cNao,ivSim,ivNao,pDebito,pCredito,pDinheiro,pBoleto;
	private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());

	public ComprarPassagem()
	{
      setTitle("ComprarPassagem");
		setBounds(400,50,450,450);
      getContentPane().setLayout(new GridLayout(0,2));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

      comprarPassagem = new JLabel(bn.getString("comprarPassagem.comprarPassagem"));
      label1 = new JLabel("");
      
      pesoBagagem = new JLabel(bn.getString("comprarPassagem.pesoBagagem"));
      texto1 = new JTextField();
      
      numBagagem = new JLabel(bn.getString("comprarPassagem.numBagagem"));
      texto2 = new JTextField();
      
      necessidadeEspecial = new JLabel(bn.getString("comprarPassagem.necessidadeEspecial"));
      label5 = new JLabel("");
      
      neSim = new JRadioButton(bn.getString("comprarPassagem.radioSim"));
      neSim.setMnemonic(KeyEvent.VK_B);
      neSim.setActionCommand(bn.getString("comprarPassagem.radioSim"));
      neSim.setSelected(false);
      neSim.addActionListener(this);
      
      neNao = new JRadioButton(bn.getString("comprarPassagem.radioNao"));
      neNao.setMnemonic(KeyEvent.VK_B);
      neNao.setActionCommand(bn.getString("comprarPassagem.radioNao"));
      neNao.setSelected(false);
      neNao.addActionListener(this);
      
      crianca = new JLabel(bn.getString("comprarPassagem.crianca"));
      label7 = new JLabel("");
      
      cSim = new JRadioButton(bn.getString("comprarPassagem.radioSim"));
      cSim.setMnemonic(KeyEvent.VK_B);
      cSim.setActionCommand(bn.getString("comprarPassagem.radioSim"));
      cSim.setSelected(false);
      cSim.addActionListener(this);
      
      cNao = new JRadioButton(bn.getString("comprarPassagem.radioNao"));
      cNao.setMnemonic(KeyEvent.VK_B);
      cNao.setActionCommand(bn.getString("comprarPassagem.radioNao"));
      cNao.setSelected(false);
      cNao.addActionListener(this);
      
      idaVolta = new JLabel(bn.getString("comprarPassagem.idaVolta"));
      label9 = new JLabel("");
      
      ivSim = new JRadioButton(bn.getString("comprarPassagem.radioSim"));
      ivSim.setMnemonic(KeyEvent.VK_B);
      ivSim.setActionCommand(bn.getString("comprarPassagem.radioSim"));
      ivSim.setSelected(false);
      ivSim.addActionListener(this);
      
      ivNao = new JRadioButton(bn.getString("comprarPassagem.radioNao"));
      ivNao.setMnemonic(KeyEvent.VK_B);
      ivNao.setActionCommand(bn.getString("comprarPassagem.radioNao"));
      ivNao.setSelected(false);
      ivNao.addActionListener(this);
      
      formaPagamento = new JLabel(bn.getString("comprarPassagem.formaPagamento"));
      label11 = new JLabel("");
      
      pDebito = new JRadioButton(bn.getString("comprarPassagem.radioDebito"));
      pDebito.setMnemonic(KeyEvent.VK_B);
      pDebito.setActionCommand(bn.getString("comprarPassagem.radioDebito"));
      pDebito.setSelected(false);
      pDebito.addActionListener(this);
      
      pCredito = new JRadioButton(bn.getString("comprarPassagem.radioCredito") );
      pCredito.setMnemonic(KeyEvent.VK_B);
      pCredito.setActionCommand(bn.getString("comprarPassagem.radioCredito") );
      pCredito.setSelected(false);
      pCredito.addActionListener(this);
      
      pDinheiro = new JRadioButton(bn.getString("comprarPassagem.radioDinheiro"));
      pDinheiro.setMnemonic(KeyEvent.VK_B);
      pDinheiro.setActionCommand(bn.getString("comprarPassagem.radioDinheiro"));
      pDinheiro.setSelected(false);
      pDinheiro.addActionListener(this);
      
      pBoleto = new JRadioButton(bn.getString("comprarPassagem.radioBoleto"));
      pBoleto.setMnemonic(KeyEvent.VK_B);
      pBoleto.setActionCommand(bn.getString("comprarPassagem.radioBoleto"));
      pBoleto.setSelected(false);
      pBoleto.addActionListener(this);
      
      numeroCartao = new JLabel(bn.getString("comprarPassagem.numeroCartao"));
      texto3 = new JTextField();
      
      codSeguranca = new JLabel(bn.getString("comprarPassagem.codSeguranca"));
      texto4 = new JTextField();
      
      dataIda = new JLabel(bn.getString("comprarPassagem.dataIda"));
      texto5 = new JTextField();
     
      dataVolta = new JLabel(bn.getString("comprarPassagem.dataVolta")); 
      texto6 = new JTextField();
      
      escolherAcento = new JButton(bn.getString("comprarPassagem.escolherAcento"));
      escolherAcento.addActionListener(this);
      
      voltar = new JButton(bn.getString("comprarPassagem.voltar"));
      voltar.addActionListener(this);
      
      ButtonGroup group0 = new ButtonGroup();
      group0.add(neSim);
      group0.add(neNao);
      
      ButtonGroup group1 = new ButtonGroup();
      group1.add(cSim);
      group1.add(cNao);
      
      ButtonGroup group2 = new ButtonGroup();
      group2.add(ivSim);
      group2.add(ivNao);
      
      ButtonGroup group3 = new ButtonGroup();
      group3.add(neSim);
      group3.add(neSim);

      ButtonGroup group4 = new ButtonGroup();
      group4.add(pDebito);
      group4.add(pCredito);
      group4.add(pDinheiro); 
      group4.add(pBoleto);
      
      getContentPane().add(comprarPassagem);
      getContentPane().add(label1);
      getContentPane().add(pesoBagagem);
      getContentPane().add(texto1);
      getContentPane().add(numBagagem);
      getContentPane().add(texto2);
      getContentPane().add(necessidadeEspecial);
      getContentPane().add(label5);
      getContentPane().add(neSim);
      getContentPane().add(neNao);
      getContentPane().add(crianca);
      getContentPane().add(label7);
      getContentPane().add(cSim);
      getContentPane().add(cNao);
      getContentPane().add(idaVolta);
      getContentPane().add(label9);
      getContentPane().add(ivSim);
      getContentPane().add(ivNao);
      getContentPane().add(formaPagamento);
      getContentPane().add(label11);
      getContentPane().add(pDebito);
      getContentPane().add(pCredito);
      getContentPane().add(pDinheiro);
      getContentPane().add(pBoleto);
      getContentPane().add(numeroCartao);
      getContentPane().add(texto3);
      getContentPane().add(codSeguranca);
      getContentPane().add(texto4);
      getContentPane().add(dataIda);
      getContentPane().add(texto5);
      getContentPane().add(dataVolta);
      getContentPane().add(texto6);
      getContentPane().add(escolherAcento);
      getContentPane().add(voltar);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String pesoBagagem = texto1.getText();
		String numeroBagagem = texto2.getText();
		String necessidadeEspecial = null; 
		String criança = null;
		String idaEvolta = null;
		String formaPagamento = null; 
		String numeroCartao = texto3.getText();
		String codSeguranca = texto4.getText();
		String dataIda = texto5.getText();
		String dataVolta = texto6.getText(); 
		
		if(neSim.isSelected())
	   	{
			necessidadeEspecial = "Sim";
	   	}
		if(neNao.isSelected())
		{
			necessidadeEspecial = "Não";
		}
		
		if(cSim.isSelected())
		{
			criança = "Sim";
		}
		if(cNao.isSelected())
		{
			criança = "Não";
		}
		if(ivSim.isSelected())
		{
			idaEvolta = "Sim";
		}
		if(ivNao.isSelected())
		{
			idaEvolta = "Nao";
		}
		if(pDebito.isSelected())
		{
			formaPagamento = "Debito";
		}
		if(pCredito.isSelected())
		{
			formaPagamento = "Credito";
		}
		if(pDinheiro.isSelected())
		{
			formaPagamento = "Dinheiro";
		}
		if(pBoleto.isSelected())
		{
			formaPagamento = "Boleto";
		}
		
		if(e.getSource() == escolherAcento)
		{
			if(dataIda.length() < 10 || dataIda.length() > 10 && dataVolta.length() < 10 || dataVolta.length() > 10)
			{
				JOptionPane.showMessageDialog(null, bn.getString("comprarPassagem.mensagem1") ,"Erro",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				Passagem p = new Passagem();
				p.setPesoBagagem(Double.parseDouble(pesoBagagem));
				p.setNumeroBagagem(numeroBagagem);
				p.setNecessidadeEspecial(necessidadeEspecial);
				p.setCriança(criança);
				p.setIdaEvolta(idaEvolta);
				p.setFormaPagamento(formaPagamento);
				p.setNumeroCartao(Integer.parseInt(numeroCartao));
				p.setCodSeguranca( Integer.parseInt(codSeguranca));
				p.setDataIda(dataIda);
				p.setDataVolta(dataVolta);

				
				new Pagamento();
				new Acentos();
				dispose();
			}
		}
		
		if(e.getSource() == voltar)
		{
			new EscolherVooPassagem();
			dispose();
		}
	}
}