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

import com.vpa.controle.Pagamento;
import com.vpa.controle.Passagem;
import com.vpa.model.PassagemDAO;

import java.util.Locale;
import java.util.ResourceBundle;

public class Acentos extends JFrame implements ActionListener
{
	private JButton voltar, comprar;
	private JLabel fileira, poltrona;
	private JRadioButton a01,a02,a03,a04,a05,a06,a07,a08,a09,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,
						 a21,a22,a23,a24,a25,a26,a27,a28,a29;
	private JRadioButton fa,fb,fc,fd,fe,ff;
	private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
		
	public Acentos()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setTitle("Escolher Acento");
		setBounds(200, 50, 800,600);
		
		JPanel tela = new JPanel();
		tela.setLayout(new BorderLayout());
		
		JPanel poltronas = new JPanel();
		poltronas.setLayout(new GridLayout(2,0));
		
		a01 = new JRadioButton("01");
		a01.setMnemonic(KeyEvent.VK_B);
		a01.setActionCommand("01");
		a01.setSelected(false);
		a01.addActionListener(this);
		poltronas.add(a01);
		
		a02 = new JRadioButton("02");
		a02.setMnemonic(KeyEvent.VK_B);
		a02.setActionCommand("01");
		a02.setSelected(false);
		a02.addActionListener(this);
		poltronas.add(a02);
		
	    a03 = new JRadioButton("03");
		a03.setMnemonic(KeyEvent.VK_B);
		a03.setActionCommand("01");
		a03.setSelected(false);
		a03.addActionListener(this);
		poltronas.add(a03);
		
	    a04 = new JRadioButton("04");
		a04.setMnemonic(KeyEvent.VK_B);
		a04.setActionCommand("01");
		a04.setSelected(false);
		a04.addActionListener(this);
		poltronas.add(a04);
		
		 a05 = new JRadioButton("05");
		a05.setMnemonic(KeyEvent.VK_B);
		a05.setActionCommand("01");
		a05.setSelected(false);
		a05.addActionListener(this);
		poltronas.add(a05);
		
		 a06 = new JRadioButton("06");
		a06.setMnemonic(KeyEvent.VK_B);
		a06.setActionCommand("01");
		a06.setSelected(false);
		a06.addActionListener(this);
		poltronas.add(a06);
		
		 a07 = new JRadioButton("07");
		a07.setMnemonic(KeyEvent.VK_B);
		a07.setActionCommand("01");
		a07.setSelected(false);
		a07.addActionListener(this);
		poltronas.add(a07);
		
		 a08 = new JRadioButton("08");
		a08.setMnemonic(KeyEvent.VK_B);
		a08.setActionCommand("01");
		a08.setSelected(false);
		a08.addActionListener(this);
		poltronas.add(a08);
		
		 a09 = new JRadioButton("09");
		a09.setMnemonic(KeyEvent.VK_B);
		a09.setActionCommand("01");
		a09.setSelected(false);
		a09.addActionListener(this);
		poltronas.add(a09);
		
		 a10 = new JRadioButton("10");
		a10.setMnemonic(KeyEvent.VK_B);
		a10.setActionCommand("01");
		a10.setSelected(false);
		a10.addActionListener(this);
		poltronas.add(a10);
		
		 a11 = new JRadioButton("11");
		a11.setMnemonic(KeyEvent.VK_B);
		a11.setActionCommand("01");
		a11.setSelected(false);
		a11.addActionListener(this);
		poltronas.add(a11);
		
		 a12 = new JRadioButton("12");
		a12.setMnemonic(KeyEvent.VK_B);
		a12.setActionCommand("01");
		a12.setSelected(false);
		a12.addActionListener(this);
		poltronas.add(a12);
		
		 a13 = new JRadioButton("13");
		a13.setMnemonic(KeyEvent.VK_B);
		a13.setActionCommand("01");
		a13.setSelected(false);
		a13.addActionListener(this);
		poltronas.add(a13);
		
		 a14 = new JRadioButton("14");
		a14.setMnemonic(KeyEvent.VK_B);
		a14.setActionCommand("01");
		a14.setSelected(false);
		a14.addActionListener(this);
		poltronas.add(a14);
		
		 a15 = new JRadioButton("15");
		a15.setMnemonic(KeyEvent.VK_B);
		a15.setActionCommand("01");
		a15.setSelected(false);
		a15.addActionListener(this);
		poltronas.add(a15);
		
		 a16 = new JRadioButton("16");
		a16.setMnemonic(KeyEvent.VK_B);
		a16.setActionCommand("01");
		a16.setSelected(false);
		a16.addActionListener(this);
		poltronas.add(a16);
		
		 a17 = new JRadioButton("17");
		a17.setMnemonic(KeyEvent.VK_B);
		a17.setActionCommand("01");
		a17.setSelected(false);
		a17.addActionListener(this);
		poltronas.add(a17);
		
		 a18 = new JRadioButton("18");
		a18.setMnemonic(KeyEvent.VK_B);
		a18.setActionCommand("01");
		a18.setSelected(false);
		a18.addActionListener(this);
		poltronas.add(a18);
		
		 a19 = new JRadioButton("19");
		a19.setMnemonic(KeyEvent.VK_B);
		a19.setActionCommand("01");
		a19.setSelected(false);
		a19.addActionListener(this);
		poltronas.add(a19);
		
		 a20 = new JRadioButton("20");
		a20.setMnemonic(KeyEvent.VK_B);
		a20.setActionCommand("01");
		a20.setSelected(false);
		a20.addActionListener(this);
		poltronas.add(a20);
		
		 a21 = new JRadioButton("21");
		a21.setMnemonic(KeyEvent.VK_B);
		a21.setActionCommand("01");
		a21.setSelected(false);
		a21.addActionListener(this);
		poltronas.add(a21);
		
		 a22 = new JRadioButton("22");
		a22.setMnemonic(KeyEvent.VK_B);
		a22.setActionCommand("01");
		a22.setSelected(false);
		a22.addActionListener(this);
		poltronas.add(a22);
		
		 a23 = new JRadioButton("23");
		a23.setMnemonic(KeyEvent.VK_B);
		a23.setActionCommand("01");
		a23.setSelected(false);
		a23.addActionListener(this);
		poltronas.add(a23);
		
		 a24 = new JRadioButton("24");
		a24.setMnemonic(KeyEvent.VK_B);
		a24.setActionCommand("01");
		a24.setSelected(false);
		a24.addActionListener(this);
		poltronas.add(a24);
		
		 a25 = new JRadioButton("25");
		a25.setMnemonic(KeyEvent.VK_B);
		a25.setActionCommand("01");
		a25.setSelected(false);
		a25.addActionListener(this);
		poltronas.add(a25);
		
		 a26 = new JRadioButton("26");
		a26.setMnemonic(KeyEvent.VK_B);
		a26.setActionCommand("01");
		a26.setSelected(false);
		a26.addActionListener(this);
		poltronas.add(a26);
		
		 a27 = new JRadioButton("27");
		a27.setMnemonic(KeyEvent.VK_B);
		a27.setActionCommand("01");
		a27.setSelected(false);
		a27.addActionListener(this);
		poltronas.add(a27);
		
		 a28 = new JRadioButton("28");
		a28.setMnemonic(KeyEvent.VK_B);
		a28.setActionCommand("01");
		a28.setSelected(false);
		a28.addActionListener(this);
		poltronas.add(a28);
		
		 a29 = new JRadioButton("29");
		a29.setMnemonic(KeyEvent.VK_B);
		a29.setActionCommand("01");
		a29.setSelected(false);
		a29.addActionListener(this);
		poltronas.add(a29);
		
		ButtonGroup gpoltronas= new ButtonGroup();
		gpoltronas.add(a01);
		gpoltronas.add(a02);
		gpoltronas.add(a03);
		gpoltronas.add(a04);
		gpoltronas.add(a05);
		gpoltronas.add(a06);
		gpoltronas.add(a07);
		gpoltronas.add(a08);
		gpoltronas.add(a09);
		gpoltronas.add(a10);
		gpoltronas.add(a11);
		gpoltronas.add(a12);
		gpoltronas.add(a13);
		gpoltronas.add(a14);
		gpoltronas.add(a15);
		gpoltronas.add(a16);
		gpoltronas.add(a17);
		gpoltronas.add(a18);
		gpoltronas.add(a19);
		gpoltronas.add(a20);
		gpoltronas.add(a21);
		gpoltronas.add(a22);
		gpoltronas.add(a23);
		gpoltronas.add(a24);
		gpoltronas.add(a25);
		gpoltronas.add(a26);
		gpoltronas.add(a27);
		gpoltronas.add(a28);
		gpoltronas.add(a29);
		
		JPanel fileiras = new JPanel();
		fileiras.setLayout(new GridLayout(1,0));
		
		fileira = new JLabel(bn.getString("acentos.fileira"));
		fileiras.add(fileira);
		
		fa = new JRadioButton("A");
		fa.setMnemonic(KeyEvent.VK_B);
		fa.setActionCommand("A");
		fa.setSelected(false);
		fa.addActionListener(this);
		fileiras.add(fa);
		
		fb = new JRadioButton("B");
		fb.setMnemonic(KeyEvent.VK_B);
		fb.setActionCommand("B");
		fb.setSelected(false);
		fb.addActionListener(this);
		fileiras.add(fb);
		
		fc = new JRadioButton("C");
		fc.setMnemonic(KeyEvent.VK_B);
		fc.setActionCommand("C");
		fc.setSelected(false);
		fc.addActionListener(this);
		fileiras.add(fc);
		
		fd = new JRadioButton("D");
		fd.setMnemonic(KeyEvent.VK_B);
		fd.setActionCommand("D");
		fd.setSelected(false);
		fd.addActionListener(this);
		fileiras.add(fd);
		
		fe = new JRadioButton("E");
		fe.setMnemonic(KeyEvent.VK_B);
		fe.setActionCommand("E");
		fe.setSelected(false);
		fe.addActionListener(this);
		fileiras.add(fe);
		
		ff = new JRadioButton("F");
		ff.setMnemonic(KeyEvent.VK_B);
		ff.setActionCommand("F");
		ff.setSelected(false);
		ff.addActionListener(this);
		fileiras.add(ff);
		
		ButtonGroup gfileira = new ButtonGroup();
		gfileira.add(fa);
		gfileira.add(fb);
		gfileira.add(fc);
		gfileira.add(fd);
		gfileira.add(fe);
		gfileira.add(ff);
		
		JPanel botoes = new JPanel();
		botoes.setLayout(new GridLayout(1,0));
		
		comprar = new JButton(bn.getString("acentos.comprar"));
		comprar.addActionListener(this);
		botoes.add(comprar);
		
		voltar = new JButton(bn.getString("acentos.voltar"));
		voltar.addActionListener(this);
		botoes.add(voltar);
		
		poltrona = new JLabel(bn.getString("acentos.poltrona"));
		
		JPanel sul = new JPanel();
		sul.setLayout(new GridLayout(4,1));
		sul.add(poltrona);
		sul.add(poltronas);
		sul.add(fileiras);
		sul.add(botoes);
		
		JPanel img = new JPanel();
		img.setLayout(new GridLayout(1,0));
		img.setOpaque(true);
		img.add(new Fundo());
		
		tela.add(sul, BorderLayout.SOUTH);
		tela.add(img, BorderLayout.CENTER);
		getContentPane().add(tela);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String acento = null;
		String fileira = null;
		String poltrona = null;
		
		if(a01.isSelected())
		{
			acento = "01";
		}
		
		if(a02.isSelected())
		{
			acento = "02";
		}
		
		if(a03.isSelected())
		{
			acento = "03";
		}
		
		if(a04.isSelected())
		{
			acento = "04";
		}
		
		if(a05.isSelected())
		{
			acento = "05";
		}
		
		if(a06.isSelected())
		{
			acento = "06";
		}
		
		if(a07.isSelected())
		{
			acento = "07";
		}
		
		if(a08.isSelected())
		{
			acento = "08";
		}
		
		if(a09.isSelected())
		{
			acento = "09";
		}
		
		if(a10.isSelected())
		{
			acento = "10";
		}
		
		if(a11.isSelected())
		{
			acento = "11";
		}
		
		if(a12.isSelected())
		{
			acento = "12";
		}
		
		if(a13.isSelected())
		{
			acento = "13";
		}
		
		if(a14.isSelected())
		{
			acento = "14";
		}
		
		if(a15.isSelected())
		{
			acento = "15";
		}
		
		if(a16.isSelected())
		{
			acento = "16";
		}
		
		if(a17.isSelected())
		{
			acento = "17";
		}
		
		if(a18.isSelected())
		{
			acento = "18";
		}
		
		if(a19.isSelected())
		{
			acento = "19";
		}
		
		if(a20.isSelected())
		{
			acento = "20";
		}
		
		if(a21.isSelected())
		{
			acento = "21";
		}
		
		if(a22.isSelected())
		{
			acento = "22";
		}
		
		if(a23.isSelected())
		{
			acento = "23";
		}
		
		if(a24.isSelected())
		{
			acento = "24";
		}
		
		if(a25.isSelected())
		{
			acento = "25";
		}
		
		if(a26.isSelected())
		{
			acento = "26";
		}
		
		if(a27.isSelected())
		{
			acento = "27";
		}
		
		if(a28.isSelected())
		{
			acento = "28";
		}
		
		if(a29.isSelected())
		{
			acento = "29";
		}
		
		if(fa.isSelected())
		{
			fileira = "A";
		}
		
		if(fb.isSelected())
		{
			fileira = "B";
		}
		
		if(fc.isSelected())
		{
			fileira = "C";
		}
		
		if(fd.isSelected())
		{
			fileira = "D";
		}
		
		if(fe.isSelected())
		{
			fileira = "E";
		}
		
		if(ff.isSelected())
		{
			fileira = "F";
		}
		
		if(e.getSource() == comprar)
		{
			if(acento == null && fileira == null)
			{
				JOptionPane.showMessageDialog(null, bn.getString("acentos.erro1"));
			}
			else
			{
				poltrona = fileira + " " + acento;
				boolean i = false;
				
				if(fileira == null || acento == null)
				{
					JOptionPane.showMessageDialog(null,bn.getString("acentos.erro2") + poltrona);
				}
				else
				{
					Passagem p = new Passagem();
					p.escolherAcento(poltrona);
				
					PassagemDAO pdao = new PassagemDAO();
					pdao.InserirPassagemDAO();
				
					new MenuPassagem();
					dispose();
				}
				
			}
		}
		
		if(e.getSource() == voltar)
		{
			new ComprarPassagem();
			dispose();
		}	
	}
	
	public static void main(String [] args){
		Acentos a = new Acentos();
	}
}
