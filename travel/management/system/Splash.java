package travel.management.system;

import java.awt.Image;
import javax.swing.*;
import java.net.URL;
//import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash(){
//        setSize(1000, 600);
//        setLocation(200,150);
//        setVisible(true);
        
        URL location = ClassLoader.getSystemResource("icons/splash2.jpg");
        if (location == null){
            System.err.println("Image not found");
            return;
        }
        ImageIcon IM = new ImageIcon(location);
        Image i2 = IM.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jgp"));
//        JLabel image = new JLabel(i1);
//        add(image);
        setVisible(true);
        thread = new Thread(this);
        thread.start();
        
    }
    public void run(){
        try{
            Thread.sleep(3000);
            new Login();
            setVisible(false);
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
      Splash frame = new Splash();
      int x = 1;
      for(int i = 1 ; i<= 640; x+=6, i+=10){
          frame.setLocation(550-(x+i)/3,400-(i/2));
          frame.setSize(x+ i, i);
          try{
              Thread.sleep(10);
          }catch(Exception e){}
          
      }
      
    
    }
}