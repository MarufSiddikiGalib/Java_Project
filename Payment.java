
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

public class Payment extends JFrame {
    
          Container c;
          JLabel what, j, p1, p2, p3, p4, p5, p6, p7, p8, p9 ;
          Font f;
          JButton b1, b2, b3, b4, b5, b6, b7;
          ImageIcon img1, img2, img3, img4, img5, img6;
          Cursor cursor;
          
    Payment(){
    
           c = this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.white);
           
        
              
           f = new Font("F", Font.CENTER_BASELINE , 15);  
                          
           what = new JLabel();
           what.setText("What are you looking for today");
           what.setBounds(320, 0, 250, 50);
           what.setFont(f);
           c.add(what);
           
            //  img6 = new ImageIcon(getClass().getResource("online-.jpg"));
               //img.setImage(img.getImage().getScaledInstance(30, 30, ImageIcon.SCALE_DEFAULT));
              // j = new JLabel(img6);
              // j.setBounds(0, 0, 800, 534);
              // c.add(j);
           
           
           img1 = new ImageIcon(getClass().getResource("card.png"));
           img2 = new ImageIcon(getClass().getResource("roket.png"));
           img3 = new ImageIcon(getClass().getResource("rsz_bkash.png"));
           img4 = new ImageIcon(getClass().getResource("cash.png"));
           img5 = new ImageIcon(getClass().getResource("install.png"));
           
          
           cursor = new Cursor(Cursor.HAND_CURSOR);
           
            b1 = new JButton(img1);
            b1.setCursor(cursor);
            b1.setBounds(10, 70, 120, 120);
            c.add(b1);
            b1.setBackground(Color.white);
            
            b2 = new JButton(img2);
            b2.setCursor(cursor);
            b2.setBounds(220, 70, 120, 120);
            c.add(b2);
            b2.setBackground(Color.white);
            
            b3 = new JButton(img3);
            b3.setCursor(cursor);
            b3.setBounds(420, 70, 120, 120);
            c.add(b3);
            b3.setBackground(Color.white);
            
            b4 = new JButton(img4);
            b4.setCursor(cursor);
            b4.setBounds(620, 70, 120, 120);
            c.add(b4);
            b4.setBackground(Color.white);
            
            b5 = new JButton(img5);
            b5.setCursor(cursor);
            b5.setBounds(10, 250, 120, 120);
            c.add(b5);
            b5.setBackground(Color.white);
            
            b6 = new JButton();
            b6.setCursor(cursor);
            b6.setText("⮜Go back");
            b6.setBounds(25, 450, 100, 30);
            c.add(b6);
            b6.setBackground(Color.CYAN);
            
            b7 = new JButton();
            b7.setCursor(cursor);
            b7.setText("Log out");
            b7.setBounds(670, 5, 100, 30);
            c.add(b7);
            b7.setBackground(Color.cyan);
            
            p1 = new JLabel();
            p1.setText("Credit/Debit Card");
            p1.setFont(f);
            c.add(p1);
            p1.setBounds(10, 175 , 150, 50);
            
            p2 = new JLabel();
            p2.setText("Rocket");
            p2.setFont(f);
            c.add(p2);
            p2.setBounds(220, 175 , 200, 50);
               
            p4 = new JLabel();
            p4.setText("Cash On Delivery");
            p4.setFont(f);
            c.add(p4);
            p4.setBounds(610, 175 , 300, 50);
            
            p5 = new JLabel();
            p5.setText("bKash");
            p5.setFont(f);
            c.add(p5);
            p5.setBounds(422, 175, 300, 50);
            
            p6 = new JLabel();
            p6.setText("Installment");
            p6.setFont(f);
            c.add(p6);
            p6.setBounds(10, 355 , 300, 50);
            
            
            b1.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                         card frame = new card();
                         frame.setVisible(true);
                      
               }
               });
            
             b2.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                       Roket frame = new Roket();
                       frame.setVisible(true);
                      
               }
               });
             
             b3.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Bkash frame = new Bkash();
                     frame.setVisible(true);
                      
               }
               });
             
             
             
             
             b6.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Frame frame = new Frame();
                     frame.setVisible(true);
                      
               }
               });
             
             b7.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Frame frame = new Frame();
                     frame.setVisible(true);
                      
               }
               });
           
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setBounds(250, 70, 800, 534);
       this.setTitle("");
       this.setResizable(false);
    
    
    
    
    }
    
   public static void main(String args[]){
    
        Payment f = new Payment();
        f.setVisible(true);
    }
}
   