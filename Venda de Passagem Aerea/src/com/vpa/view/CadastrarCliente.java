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

import java.util.Locale;
import java.util.ResourceBundle;

public class CadastrarCliente extends JFrame implements ActionListener
{
   JButton Cadastrar, voltar;
   JLabel cadastrarCliente, label1, nome,rg, cpf,endereco,cep,estadoCivil,label8;
   JLabel emprego, email, label11, confirmaEmail, senha,confirmaSenha,labell5;
   JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7,texto8,texto9,texto10;
   JComboBox ComboEstadoCivil;
   String[] AEstadoCivil = { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)" };
   JRadioButton tSr, tSra, tSrta;
   private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
	
   public CadastrarCliente()
   {
      setTitle("Cadastrar Cliente");
      setBounds(400,50,450,450);
      getContentPane().setLayout(new GridLayout(0,2));
      
      String sr = bn.getString("cadastrarCliente.radioSr"), sra = bn.getString("cadastrarCliente.radioSra"), srta = bn.getString("cadastrarCliente.radioSrta");
  		
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);    
		
      cadastrarCliente = new JLabel(bn.getString("cadastrarCliente.cadastrarCliente"));
      
      label1 = new JLabel("");
      
      nome = new JLabel(bn.getString("cadastrarCliente.nome"));
      texto1 = new JTextField();
      
      rg = new JLabel(bn.getString("cadastrarCliente.rg"));
      texto2 = new JTextField();
      
      cpf = new JLabel(bn.getString("cadastrarCliente.cpf"));
      texto3 = new JTextField();
      
      endereco = new JLabel(bn.getString("cadastrarCliente.endereco"));
      texto4 = new JTextField();
      
      cep = new JLabel(bn.getString("cadastrarCliente.cep"));
      texto5 = new JTextField();
      
      tSr = new JRadioButton(sr);
      tSr.setMnemonic(KeyEvent.VK_B);
      tSr.setActionCommand(sr);
      tSr.setSelected(false);
      tSr.addActionListener(this);
      
      tSra = new JRadioButton(sra);
      tSra.setMnemonic(KeyEvent.VK_B);
      tSra.setActionCommand(sra);
      tSra.setSelected(false);
      tSra.addActionListener(this);
      
      tSrta = new JRadioButton(srta);
      tSrta.setMnemonic(KeyEvent.VK_B);
      tSrta.setActionCommand(srta);
      tSrta.setSelected(false);
      tSrta.addActionListener(this);
      
      labell5 = new JLabel("");
      
      estadoCivil = new JLabel(bn.getString("cadastrarCliente.estadoCivil"));
      

      ComboEstadoCivil = new JComboBox(AEstadoCivil);
      ComboEstadoCivil.setSelectedIndex(0);
      ComboEstadoCivil.addActionListener(this);
      
      emprego = new JLabel(bn.getString("cadastrarCliente.emprego"));
      texto6 = new JTextField();
      
      email = new JLabel(bn.getString("cadastrarCliente.email"));
      texto7 = new JTextField();
      
      confirmaEmail = new JLabel(bn.getString("cadastrarCliente.confirmaEmail"));
      texto8 = new JTextField();
      
      senha = new JLabel(bn.getString("cadastrarCliente.senha"));
      texto9 = new JTextField();
      
      confirmaSenha = new JLabel(bn.getString("cadastrarCliente.confirmaSenha"));
      texto10 = new JTextField();
      
      Cadastrar = new JButton(bn.getString("cadastrarCliente.botCadastrar"));
      Cadastrar.addActionListener(this);
      
      voltar = new JButton(bn.getString("cadastrarCliente.botVoltar"));
      voltar.addActionListener(this);
      
      ButtonGroup group = new ButtonGroup();
      group.add(tSr);
      group.add(tSra);
      group.add(tSrta);
      
      getContentPane().add(cadastrarCliente);
      getContentPane().add(label1);
      getContentPane().add(nome);
      getContentPane().add(texto1);
      getContentPane().add(rg);
      getContentPane().add(texto2);
      getContentPane().add(cpf);
      getContentPane().add(texto3);
      getContentPane().add(endereco);
      getContentPane().add(texto4);
      getContentPane().add(cep);
      getContentPane().add(texto5);
      getContentPane().add(tSr);
      getContentPane().add(tSra);
      getContentPane().add(tSrta);
      getContentPane().add(labell5);
      getContentPane().add(estadoCivil);
      getContentPane().add(ComboEstadoCivil);
      getContentPane().add(emprego);
      getContentPane().add(texto6);
      getContentPane().add(email);
      getContentPane().add(texto7);
      getContentPane().add(confirmaEmail);
      getContentPane().add(texto8);
      getContentPane().add(senha);
      getContentPane().add(texto9);
      getContentPane().add(confirmaSenha);
      getContentPane().add(texto10);
      getContentPane().add(Cadastrar);
      getContentPane().add(voltar);
   	
   	
   }
	
   public void actionPerformed(ActionEvent e)
   {
	   	String nome = texto1.getText();
	   	String rg = texto2.getText();
	   	String cpf = texto3.getText();
	   	String endereco = texto4.getText();
	   	String cep = texto5.getText();
	   	String srSraSr = null;
	   	String estadoCivil = (String) ComboEstadoCivil.getSelectedItem();
	   	String emprego = texto6.getText();
	   	String email = texto7.getText();
	   	String confirmaEmail = texto8.getText();
	   	String senha = texto9.getText();
	   	String confirmaSenha = texto10.getText();
	   
	   	if(tSr.isSelected())
	   	{
	   		srSraSr = "Sr";
	   	}
	   	
	   	if(tSra.isSelected())
	   	{
	   		srSraSr = "Sra";
	   	}
	   	
	   	if(tSrta.isSelected())
	   	{
	   		srSraSr = "Srta";
	   	}
	   	
	   	if(e.getSource() == Cadastrar)
	   	{
	   		Cliente c = new Cliente(nome, rg, cpf, endereco, Integer.parseInt(cep), srSraSr, estadoCivil, emprego, email, confirmaEmail, senha, confirmaSenha);
	   		MenuPassagem mp = new MenuPassagem();
	   		dispose();
	   	}
	   
   		if(e.getSource() == voltar)
		{
			MenuPassagem mp = new MenuPassagem();
			dispose();
		}
   }
}