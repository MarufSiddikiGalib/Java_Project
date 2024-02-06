
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

public class RazerSpec extends JFrame{
          
            Container c;
            ImageIcon img;
            JLabel j, jl1, jl2, jl3, jl4, jl5, jl6, jl7;
            JButton b1;
            Font f;
            Cursor cursor;
    
     RazerSpec(){
       
           c = this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.white);
           
               img = new ImageIcon(getClass().getResource("death.jpg"));
               j = new JLabel(img);
               j.setBounds(300, 0, 250, 500);
               c.add(j);
           
          this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          this.setBounds(400,100,600,500);
          this.setTitle("Dashboard");
          this.setResizable(false);
     
           jl1 = new JLabel();
           jl1.setText("MPN: RZ01-03850100-R3M1");
           jl1.setFont(f);
           c.add(jl1);
           jl1.setBounds(35, 10 , 250, 50);
           
           jl2 = new JLabel();
           jl2.setText("True 6,400 DPI Optical Sensor");
           jl2.setFont(f);
           c.add(jl2);
           jl2.setBounds(35, 60 , 250, 50);
           
           jl3 = new JLabel();
           jl3.setText("Ergonomic Form Factor");
           jl3.setFont(f);
           c.add(jl3);
           jl3.setBounds(35, 110 , 250, 50);
           
           jl4 = new JLabel();
           jl4.setText("5 Hyperesponse Buttons");
           jl4.setFont(f);
           c.add(jl4);
           jl4.setBounds(35, 160 , 250, 50);
           
           jl5 = new JLabel();
           jl5.setText("10 million-click life cycle");
           jl5.setFont(f);
           c.add(jl5);
           jl5.setBounds(35, 210 , 250, 50);
           
           jl6 = new JLabel();
           jl6.setText("Cable Length 1.8m / 5.91 ft");
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
                  Razer frame = new Razer();
                  frame.setVisible(true);
                                     
               }
               });
           
           
     
     }
    public static void main(String args[]){

    RazerSpec frame = new RazerSpec();
    frame.setVisible(true);
}
    
}
