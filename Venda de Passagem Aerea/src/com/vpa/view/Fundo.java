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

import javax.imageio.ImageIO;
import javax.swing.*;  

import java.awt.*;  
import java.awt.geom.Rectangle2D;  
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;  
import java.util.Locale;
import java.util.ResourceBundle;
  
public class Fundo extends JPanel
{  
        BufferedImage b;  
        Rectangle2D rect;  
        private ResourceBundle bn = ResourceBundle.getBundle("messages", Locale.getDefault());
          
        public Fundo()
        {   
            try 
            {  
               
            	b = ImageIO.read(new File("poltronas.jpg")); 
            		
            	
                 
                 //C:\Users\Gabriel\Desktop
                  
                //cria uma imagem do tamanho 130x130,   
                //que vai se repetir ao longo do fundo, o tamanho é você quem escolhe. 
                
                rect  = new Rectangle(0,0,638,300);                                   
                  
            } catch (IOException ex) {  
                JOptionPane.showMessageDialog(null, bn.getString("fundo.erro"), "Erro",JOptionPane.WARNING_MESSAGE); 
            }  
        }  
          
        @Override   
        public void paintComponent(Graphics g){    
            /* 
             * Se você quiser que a imagem seja uma só (extendida ao tamanho da tela, não replicada 
             * tire os comentários da proxima linha 
             */  
              
        	rect = new Rectangle(0,0,this.getWidth(),this.getHeight());  
              
              
            TexturePaint p = new TexturePaint(b,rect);  
            Graphics2D g2 = (Graphics2D) g;  
            g2.setPaint(p);  
            g2.fillRect(0,0,this.getWidth(),this.getHeight());  
   
        }  
    }  