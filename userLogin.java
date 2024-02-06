
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

public class userLogin extends JFrame {
    
          Container c;
          JLabel what, p1, p2, p3, p4, p5, p6, p7, p8, p9 ;
          Font f;
          JButton b1, b2, b3, b4, b5, b6, b7;
          ImageIcon img1, img2, img3, img4, img5, img6;
          Cursor cursor;
          
    userLogin(){
    
           c = this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.white);
              //getContentPane().setBackground(new java.awt.Color(White));
        
              
           f = new Font("F", Font.CENTER_BASELINE, 15);  
                          
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
           
           
           img1 = new ImageIcon(getClass().getResource("iphone.jpg"));
           img2 = new ImageIcon(getClass().getResource("rsz_headphn.jpg"));
           img3 = new ImageIcon(getClass().getResource("_death.jpg"));
           img4 = new ImageIcon(getClass().getResource("rsz_macbook.jpg"));
           img5 = new ImageIcon(getClass().getResource("rsz_geforce.jpg"));
           
          
           cursor = new Cursor(Cursor.HAND_CURSOR);
           
            b1 = new JButton(img1);
            b1.setCursor(cursor);
            b1.setBounds(10, 70, 120, 120);
            c.add(b1);
            b1.setBackground(Color.CYAN);
            
            b2 = new JButton(img2);
            b2.setCursor(cursor);
            b2.setBounds(220, 70, 120, 120);
            c.add(b2);
            b2.setBackground(Color.CYAN);
            
            b3 = new JButton(img3);
            b3.setCursor(cursor);
            b3.setBounds(420, 70, 120, 120);
            c.add(b3);
            b3.setBackground(Color.CYAN);
            
            b4 = new JButton(img4);
            b4.setCursor(cursor);
            b4.setBounds(620, 70, 120, 120);
            c.add(b4);
            b4.setBackground(Color.CYAN);
            
            b5 = new JButton(img5);
            b5.setCursor(cursor);
            b5.setBounds(10, 250, 120, 120);
            c.add(b5);
            b5.setBackground(Color.CYAN);
            
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
            b7.setBackground(Color.CYAN);
            
            p1 = new JLabel();
            p1.setText("IPHONE 13");
            p1.setFont(f);
            c.add(p1);
            p1.setBounds(35, 175 , 150, 50);
            
            p2 = new JLabel();
            p2.setText("Havit Gaming");
            p2.setFont(f);
            c.add(p2);
            p2.setBounds(220, 175 , 200, 50);
            
            p7 = new JLabel();
            p7.setText("headphone");
            p7.setFont(f);
            c.add(p7);
            p7.setBounds(220, 190 , 200, 50);
               
            p3 = new JLabel();
            p3.setText("Razer DeathAdder");
            p3.setFont(f);
            c.add(p3);
            p3.setBounds(415, 175 , 300, 50);
            
            p4 = new JLabel();
            p4.setText("Apple MacBook Air");
            p4.setFont(f);
            c.add(p4);
            p4.setBounds(610, 175 , 300, 50);
            
            p5 = new JLabel();
            p5.setText("Gaming Mouse");
            p5.setFont(f);
            c.add(p5);
            p5.setBounds(422, 190 , 300, 50);
            
            p6 = new JLabel();
            p6.setText("ZOTAC GAMING");
            p6.setFont(f);
            c.add(p6);
            p6.setBounds(10, 355 , 300, 50);
            
            p7 = new JLabel();
            p7.setText("GeForce GTX 1660");
            p7.setFont(f);
            c.add(p7);
            p7.setBounds(10, 380 , 300, 50);
            
            
            
            
            b1.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Iphone frame = new Iphone();
                     frame.setVisible(true);
                      
               }
               });
            
             b2.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Havit h = new Havit();
                     h.setVisible(true);
                      
               }
               });
             
             b3.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Razer frame = new Razer();
                     frame.setVisible(true);
                      
               }
               });
             
              b4.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Mac frame = new Mac();
                     frame.setVisible(true);
                      
               }
               });
              
              b5.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Zotac frame = new Zotac();
                     frame.setVisible(true);
                      
               }
               });
             
             
             b6.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     Frame frame = new Frame();
                     frame.setVisible(true);
                      
               }
               });
             
             b7.addActionListener(new ActionListener(){
                   
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
    
        userLogin f = new userLogin();
        f.setVisible(true);
    }
}
   