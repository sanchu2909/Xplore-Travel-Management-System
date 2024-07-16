
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class About extends JFrame implements ActionListener{
    JButton back;
    
    About(){
        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("About");
        l1.setBounds(200, 10, 100, 50);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
        
        String S ="The Travel Tourism Management System (TTMS) is a comprehensive software solution designed to streamline and enhance the operations of travel agencies and tour operators. This system integrates various functionalities into a single platform, facilitating efficient management of bookings, customer relationships, inventory, and finances.\n" + " \n"+

"Key Features:\n"+"\n"+
"Booking Management: Real-time reservations for flights, hotels, and car rentals, along with customizable tour packages and secure payment processing.\n"+"\n"+
"Customer Relationship Management (CRM): Detailed customer profiles, automated communication tools, and integrated support for a personalized customer experience.\n"+"\n"+
"Inventory Management: Efficient allocation and management of resources, including tour guides, vehicles, and accommodation, as well as supplier management.\n"+"\n"+
"Financial Management: Comprehensive financial tracking, invoicing, and dynamic pricing capabilities to optimize profitability.\n"+"\n"+
"Reporting and Analytics: Advanced reporting tools to provide insights into business performance, customer preferences, and market trends.\n"+"\n"+
"TTMS is designed to provide a seamless and efficient experience for both travel businesses and their customers, enhancing operational efficiency and customer satisfaction.";







        
        TextArea area = new TextArea(S, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);
        
        back = new JButton("BACK");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);

        
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
       
            setVisible(false);
        }

    
    
    
    public static void main(String[] args) {
        new About();
    }
    
}