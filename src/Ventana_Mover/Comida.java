/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana_Mover;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class Comida {
      ImageIcon imagen2 = new ImageIcon("2.png");
       JLabel comida = new JLabel(imagen2);
       int x ,y;
   public Comida(){
          x = (int)(Math.random()*500);
        y = (int)(Math.random()*500);
       comida.setBounds(x, y, 12, 12);
       
   }
   public void Aleatorio(){
       x = (int)(Math.random()*500);
         y = (int)(Math.random()*500);
       comida.setBounds(x, y, 12, 12);
   }
   
   public JLabel getLabel(){
       return comida;
   }
   public int getX(){
       return x;
   }
   public int getY(){
       return y;
   }
   
  
}
