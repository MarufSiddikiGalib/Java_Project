
package newpackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BuyNow extends JFrame{
             
              Container c;
              JLabel adress, phnNo, email, pay;
              JTextField tf1, tf2, tf3;
              Font f;
              JButton b1,b2;
              Cursor cursor;
              JComboBox cb;
              //String[] payment = {"BKASH", "NAGAD" };
              
    BuyNow(){
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.pink);
         
         
         f = new Font("F", Font.CENTER_BASELINE, 15);
         
         adress = new JLabel();
         adress.setText("Billing adress :");
         adress.setFont(f);
         c.add(adress);
         adress.setBounds(35, 10 , 250, 50);
         
         phnNo = new JLabel();
         phnNo.setText("Contract number :");
         phnNo.setFont(f);
         c.add(phnNo);
         phnNo.setBounds(35, 80, 155, 50);
         
         email = new JLabel();
         email.setText("Email :");
         email.setFont(f);
         c.add(email);
         email.setBounds(35, 150, 155, 50);
         
         //pay = new JLabel();
         //pay.setText("Payment method :");
         //pay.setFont(f);
         //c.add(pay);
         //pay.setBounds(310, 10 , 250, 50);
         
         //cb = new JComboBox(payment);
         //cb.setBounds(450, 28, 100,20);
         //c.add(cb);
         
         
         tf1 = new JTextField();
         tf1.setBounds(180, 28, 100,20);
         c.add(tf1);
         
         tf2 = new JTextField();
         tf2.setBounds(180, 95, 100,20);
         c.add(tf2);
         
         tf3 = new JTextField();
         tf3.setBounds(180, 162, 100,20);
         c.add(tf3);
         
         cursor = new Cursor(Cursor.HAND_CURSOR);
         
         b1 = new JButton();
         b1.setCursor(cursor);
         b1.setBounds(300, 250, 120, 30);
         b1.setText("Pay now");
         c.add(b1);
         b1.setBackground(Color.CYAN);
         
         b2 = new JButton();
         b2.setCursor(cursor);
         b2.setBounds(120, 250, 120, 30);
         b2.setText("Go back");
         c.add(b2);
         b2.setBackground(Color.CYAN);
         
         
         b1.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                   
                    String adress = tf1.getText();
                    String phnNo = tf2.getText();                   
                    String email = tf3.getText();
                      
                      if(adress.equals("") && phnNo.equals("") && email.equals("")){
                          
                          
                          
                         JOptionPane.showMessageDialog(null,"Enter valid imformation " , "Information", 1);
                      }
                         else{
                          
                             Payment f = new Payment();
                             f.setVisible(true);
                         
                        }         
                     
               }
               });
         
          b2.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                   
                     dispose();
                    userLogin f = new userLogin();
                    f.setVisible(true);
                                     
               }
               });
        
        
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         this.setBounds(400,100,600,400);
         this.setTitle("Dashboard");
         this.setResizable(false);
    
    
    
    
    
    }
    public static void main(String args[]){

    BuyNow frame = new BuyNow();
    frame.setVisible(true);
}
}
