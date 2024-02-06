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

public class ZotacSpec extends JFrame{
          
            Container c;
            ImageIcon img;
            JLabel j, jl1, jl2, jl3, jl4, jl5, jl6, jl7;
            JButton b1;
            Font f;
            Cursor cursor;
    
     ZotacSpec(){
       
           c = this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.white);
           
               img = new ImageIcon(getClass().getResource("geforce.jpg"));
               j = new JLabel(img);
               j.setBounds(250, 0, 500, 500);
               c.add(j);
           
          this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          this.setBounds(320,100,750,515);
          this.setTitle("Dashboard");
          this.setResizable(false);
     
           jl1 = new JLabel();
           jl1.setText("Model: Zotac GeForce GTX 1660 Super");
           jl1.setFont(f);
           c.add(jl1);
           jl1.setBounds(35, 10 , 600, 50);
           
           jl2 = new JLabel();
           jl2.setText("Dual Offset Fan");
           jl2.setFont(f);
           c.add(jl2);
           jl2.setBounds(35, 60 , 350, 50);
           
           jl3 = new JLabel();
           jl3.setText("4K / HDR / VR Ready");
           jl3.setFont(f);
           c.add(jl3);
           jl3.setBounds(35, 110 , 250, 50);
           
           jl4 = new JLabel();
           jl4.setText("Size: 6GB");
           jl4.setFont(f);
           c.add(jl4);
           jl4.setBounds(35, 160 , 250, 50);
           
           jl5 = new JLabel();
           jl5.setText("Connectors: 8-pin");
           jl5.setFont(f);
           c.add(jl5);
           jl5.setBounds(35, 210 , 300, 50);
           
           jl6 = new JLabel();
           jl6.setText("Memory Clock: 14 Gbps");
           jl6.setFont(f);
           c.add(jl6);
           jl6.setBounds(35, 260 , 250, 50);
           
           b1 = new JButton();
           b1.setCursor(cursor);
           b1.setBounds(80, 400, 100, 30);
           b1.setText("⮜Go back");
           c.add(b1);
           b1.setBackground(Color.CYAN);
           
           
            b1.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                    dispose();
                  Zotac frame = new Zotac();
                  frame.setVisible(true);
                                     
               }
               });
           
           
     
     }
    public static void main(String args[]){

    ZotacSpec frame = new ZotacSpec();
    frame.setVisible(true);
}
}