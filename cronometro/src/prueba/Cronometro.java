/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Manana
 */
public class Cronometro extends JLabel{
    Timer time;
    int segundos=0;
    
    public Cronometro(){

    super("00:00");
    time= new Timer(1000, (ActionEvent e) -> {
        segundos++;
        int m=segundos/60;
        int h=m/24;
        setText( ((m<10) ? "0" : "")+ m + ":" + ((segundos<10) ? "0" : "") + segundos);
        
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
        
    });

    }
   public void start(){
   time.start();
   }
   
   public void stop(){
   time.stop();
   }
   
   public void reset(){
   time.restart();
   
   }
}

