
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetail, viewPersonalDetail, updatePersonalDetail,checkpackages, bookpackages;
    JButton viewpackages, viewhotels, destination, bookhotel, viewBookedhotel,payments;
    JButton calculater, notepad, about,deletePersonalDetail;
    Dashboard(String username){
        this.username = username;
        
        //setBounds(0, 0, 1650, 1050);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        URL location = ClassLoader.getSystemResource("icons/dashboard.png");
        if(location == null){
            System.err.println("image not founf");
            return;
        }
        ImageIcon IM = new ImageIcon(location);
        Image i2 = IM.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addPersonalDetail = new JButton("Add Personal Detail");
        addPersonalDetail.setBounds(0, 0, 300, 50);
        addPersonalDetail.setBackground(new Color(0, 0, 102));
        addPersonalDetail.setForeground(Color.WHITE);
        addPersonalDetail.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetail.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetail.addActionListener(this);
        p2.add(addPersonalDetail);
        
        updatePersonalDetail = new JButton("Update Personal Detail");
        updatePersonalDetail.setBounds(0, 50, 300, 50);
        updatePersonalDetail.setBackground(new Color(0, 0, 102));
        updatePersonalDetail.setForeground(Color.WHITE);
        updatePersonalDetail.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetail.setMargin(new Insets(0, 0, 0, 30));
        updatePersonalDetail.addActionListener(this);
        p2.add(updatePersonalDetail);
        
        viewPersonalDetail = new JButton("View Detail");
        viewPersonalDetail.setBounds(0, 100, 300, 50);
        viewPersonalDetail.setBackground(new Color(0, 0, 102));
        viewPersonalDetail.setForeground(Color.WHITE);
        viewPersonalDetail.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetail.setMargin(new Insets(0, 0, 0, 130));
        viewPersonalDetail.addActionListener(this);
        p2.add(viewPersonalDetail);
        
        deletePersonalDetail = new JButton("Delete Person Detail");
        deletePersonalDetail.setBounds(0, 150, 300, 50);
        deletePersonalDetail.setBackground(new Color(0, 0, 102));
        deletePersonalDetail.setForeground(Color.WHITE);
        deletePersonalDetail.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetail.setMargin(new Insets(0, 0, 0, 50));
        deletePersonalDetail.addActionListener(this);
        p2.add(deletePersonalDetail);
        
        checkpackages = new JButton("Check Package");
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0, 100));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackages = new JButton("Book Package");
        bookpackages.setBounds(0, 250, 300, 50);
        bookpackages.setBackground(new Color(0, 0, 102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0, 0, 0, 110));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        viewpackages = new JButton("View Package");
        viewpackages.setBounds(0, 300, 300, 50);
        viewpackages.setBackground(new Color(0, 0, 102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0, 0, 0, 110));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 125));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 400, 300, 50);
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0, 0, 0, 130));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewBookedhotel = new JButton("View Booked Hotel");
        viewBookedhotel.setBounds(0, 450, 300, 50);
        viewBookedhotel.setBackground(new Color(0, 0, 102));
        viewBookedhotel.setForeground(Color.WHITE);
        viewBookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedhotel.setMargin(new Insets(0, 0, 0, 65));
        viewBookedhotel.addActionListener(this);
        p2.add(viewBookedhotel);
        
        destination = new JButton("Destinations");
        destination.setBounds(0, 500, 300, 50);
        destination.setBackground(new Color(0, 0, 102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destination.setMargin(new Insets(0, 0, 0, 125));
        destination.addActionListener(this);
        p2.add(destination);

        payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 150));
        payments.addActionListener(this);
        p2.add(payments);

        calculater = new JButton("Calculater");
        calculater.setBounds(0, 600, 300, 50);
        calculater.setBackground(new Color(0, 0, 102));
        calculater.setForeground(Color.WHITE);
        calculater.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculater.setMargin(new Insets(0, 0, 0, 150));
        calculater.addActionListener(this);
        p2.add(calculater);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);
        
        URL loc = ClassLoader.getSystemResource("icons/home.jpg");
        if (loc == null){
            System.err.println("Image not found");
            return;
        }
        ImageIcon imageIcon = new ImageIcon(loc);
        Image i4 = imageIcon.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel image = new JLabel(i5);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma", Font.PLAIN, 55));
        image.add(text);











        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetail){
            new AddCustomer(username);
        }else if (ae.getSource() == viewPersonalDetail){
            new ViewCustomer(username);
        }else if (ae.getSource() == updatePersonalDetail){
            new UpdateCustomer(username);
        }else if(ae.getSource() == checkpackages){
            new CheckPackage();
        }else if(ae.getSource() == bookpackages){
            new BookPackage(username);
        }else if(ae.getSource() == viewpackages){
            new ViewPackage(username);
        }else if(ae.getSource() == viewhotels){
            new CheckHotels();
        }else if (ae.getSource() == destination){
            new Destination();
        }else if(ae.getSource() == bookhotel){
            new BookHotel(username);
        }else if(ae.getSource() == viewBookedhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource() == payments){
            new Payment();
        }else if(ae.getSource() == calculater){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == about){
            new About();
        }else if(ae.getSource() == deletePersonalDetail){
          new DeleteDetails(username);
        
    }
        
    }
    
    
    public static void main(String[] args) {
        new Dashboard("");
    }
    
}