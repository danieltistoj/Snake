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

public class Mover implements ActionListener{
    private int x=300, y=300, aux=0;
   
    
    JFrame ventana;
    JPanel panelVentana;
  Comida comida = new Comida();
 Timer tiempo = new Timer(5, this);
    ArrayList<JLabel> cuadro;
    
    public Mover(){
        
        ventana = new JFrame("Mover Objeto");
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        //ventana.setResizable(false);
        
        panelVentana=new JPanel();
        panelVentana.setSize(ventana.getSize());
        panelVentana.setLayout(null);
        //panelVentana.setBackground(Color.red);
        
        cuadro =new ArrayList<JLabel>();
       ImageIcon imagen = new ImageIcon("3.png");
       JLabel aux = new JLabel(imagen);
       aux.setBounds(290, 290, 12, 12);
       aux.setVisible(true);
       cuadro.add(aux);
       panelVentana.add(comida.getLabel());
       panelVentana.add(cuadro.get(0),0);
       panelVentana.setVisible(true);
       ventana.add(panelVentana);
       
       
       ventana.setVisible(true);
       tiempo.start();
      
    }//final del constructor 
  
    public void Movimiento(){
       
       
    ventana.addKeyListener(new KeyListener() {
      
        
      
          @Override
          public void keyTyped(KeyEvent e) {
              //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void keyPressed(KeyEvent e) {
              //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              if(e.getKeyCode()==KeyEvent.VK_UP){
                
               cuadro.get(0).setBounds(x, y--, 12, 12);
                Mover();
                if(aux==0){
                   tiempo.start();
                   aux=1;
                }
               }
                  
                  if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    
                 cuadro.get(0).setBounds(x, y++, 12, 12);
                 Mover();
                     if(aux==0){
                   tiempo.start();
                   aux=1;
                }  
              }
                    
              
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                cuadro.get(0).setBounds(x++, y, 12, 12);
                Mover();
                
              }
               if(e.getKeyCode()==KeyEvent.VK_LEFT){
               cuadro.get(0).setBounds(x--, y, 12, 12);
               Mover();
                if(aux==0){
                   tiempo.start();
                   aux=1;
                }
              }
                
          }

          @Override
          public void keyReleased(KeyEvent e) {
              //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
    });

     
         
    }//final del metodo

     
    public void Mover(){
        if(x==comida.getLabel().getX()&&y==comida.getLabel().getY()){
            comida.Aleatorio();
            
        }
       if(x==-1){
          x=0;
          y=0;
           
       }
       if(y==-1){
            x=0;
            y=0;
           
       }
       if(y==600){
            x=0;
            y=0;
          
       }
       if(x==600){
            x=0;
            y=0;
          
       }
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    
    
    
    
    
    
    
}//fin de la clase..
