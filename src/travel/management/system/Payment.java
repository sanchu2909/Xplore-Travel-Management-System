
package travel.management.system;
import java.awt.Image;
import java.net.URL;
import javax.swing.*;
import java.awt.event.*;



public class Payment extends JFrame implements ActionListener{
    
    JButton pay,back;
    
    
    Payment(){
        
        setBounds(500, 200, 800, 600);
        setLayout(null);
        
        URL location = ClassLoader.getSystemResource("icons/paytm.jpeg");
        if(location == null){
            System.err.println("image not found");
            return;
        }
        ImageIcon IM = new ImageIcon(location);
        Image i2 = IM.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        
        pay = new JButton("PAY");
        pay.setBounds(420, 0, 80, 40);
        pay.addActionListener(this);
        image.add(pay);
        
        back = new JButton("BACK");
        back.setBounds(520, 0, 80, 40);
        back.addActionListener(this);
        image.add(back);
        
        
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == pay){
            
        }else{
            setVisible(false);
        }
    }
    
    
    
    public static void main(String[] args) {
        new Payment();
    }
    
}