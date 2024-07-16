package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.border.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login,signup,password;
    JTextField tfusername, tfpassword;
    
    Login(){
        
        setSize(850,400);
        setLocation(350,200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel pl = new JPanel();
        pl.setBackground(new Color(131, 193, 233));
        pl.setBounds(0,0,400,400);
        pl.setLayout(null);
        add(pl); 
        URL location = ClassLoader.getSystemResource("icons/login.png");
        if(location == null){
            System.err.println("image not founf");
            return;
        }
        ImageIcon IM = new ImageIcon(location);
        Image i2 = IM.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        pl.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 25);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 110, 100, 25);
        lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(new Color(133, 193, 233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133, 193, 233)));
        login.addActionListener(this);
        p2.add(login);
        
        signup = new JButton("Signup");
        signup.setBounds(230, 200, 130, 30);
        signup.setBackground(new Color(133, 193, 233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133, 193, 233)));
        signup.addActionListener(this);
        p2.add(signup);
        
        password = new JButton("Forget Password");
        password.setBounds(130, 250, 130, 30);
        password.setBackground(new Color(133, 193, 233));
        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(133, 193, 233)));
        password.addActionListener(this);
        p2.add(password);
        
        JLabel text = new JLabel("Trouble in login....");
        text.setBounds(300,250 ,150 ,20 );
        text.setForeground(Color.red);
        p2.add(text);
        
        setVisible(true);
      
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == signup){
            setVisible(false);
            new Signup();
        }else if(ae.getSource() == password){
            setVisible(false);
            new ForgetPassword();
        }else if (ae.getSource() == login){
            try{
                String username = tfusername.getText();
                String pass = tfpassword.getText();
                
                String query = "select * from account where username = '"+username+"' AND password = '"+pass+"'";
                Conn c = new Conn();
                ResultSet rs =c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loding(username);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
               // String query = "select * from account where username = '"+u+"'"
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    
    public static void main(String[] args) {
      Login l =  new Login();
    }
    
}
