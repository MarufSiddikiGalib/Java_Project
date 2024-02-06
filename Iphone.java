
package newpackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Iphone extends JFrame {
            
            Container c;
            ImageIcon img;
            JLabel name, price, j;
            JButton b1, b2, b3, b4;
            Font f;
            Cursor cursor;
    Iphone(){
        
           c = this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.white);
           
           
              img = new ImageIcon(getClass().getResource("iphn-13.png"));
               //img.setImage(img.getImage().getScaledInstance(30, 30, ImageIcon.SCALE_DEFAULT));
               j = new JLabel(img);
               j.setBounds(300, 0, 250, 500);
               c.add(j);
               
       
           
            f = new Font("F", Font.CENTER_BASELINE, 15);
           
            
           name = new JLabel();
           name.setText("Name :      IPHONE 13 512GB");
           name.setFont(f);
           c.add(name);
           name.setBounds(35, 10 , 250, 50);
                   
           price = new JLabel();
           price.setText("Price :     109900 TK");
           price.setFont(f);
           c.add(price);
           price.setBounds(35, 60, 155, 50);
        
           cursor = new Cursor(Cursor.HAND_CURSOR);
          
           b1 = new JButton();
           b1.setCursor(cursor);
           b1.setBounds(80, 300, 100, 30);
           b1.setText("Buy now");
           c.add(b1);
           b1.setBackground(Color.CYAN);
           
           b2 = new JButton();
           b2.setCursor(cursor);
           b2.setBounds(80, 350, 100, 30);
           b2.setText("Add to cart");
           c.add(b2);
           b2.setBackground(Color.CYAN);
           
           b3 = new JButton();
           b3.setCursor(cursor);
           b3.setBounds(80, 400, 100, 30);
           b3.setText("Go back");
           c.add(b3);
           b3.setBackground(Color.CYAN);
           
           b4 = new JButton();
           b4.setCursor(cursor);
           b4.setBounds(60, 150, 150, 30);
           b4.setText("Specifications");
           c.add(b4);
           b4.setBackground(Color.CYAN);
           
            b1.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                    dispose();
                   BuyNow frame = new BuyNow();
                   frame.setVisible(true);
                                     
               }
               });
           
           b2.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                  JOptionPane.showMessageDialog(null,"Added to cart" , "Information", 1); 
                      
               }
               });
           
            b3.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                    dispose();
                   userLogin f = new userLogin();
                   f.setVisible(true);
                                     
               }
               });
            
             b4.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                    dispose();
                   IphoneSpec frame = new IphoneSpec();
                   frame.setVisible(true);
                                     
               }
               });
           
          this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          this.setBounds(400,100,600,500);
          this.setTitle("");
          this.setResizable(false);
    }

public static void main(String args[]){

    Iphone frame = new Iphone();
    frame.setVisible(true);
}
}