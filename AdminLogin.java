
package newpackage;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AdminLogin extends JFrame{
	  
	 ImageIcon icon, img;       
         Container c;
         JLabel UserL, PassL;
         Font f;
         JTextField tf1;
         JPasswordField pf;
         JButton b1, b2, b3, b4;
         JLabel j;
         Cursor cursor;
          
    AdminLogin(){
        
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setBounds(280,70,800,534);
       this.setTitle("Dashboard");
       this.setResizable(false);
         
         
               
              c = this.getContentPane();
              c.setLayout(null);
              c.setBackground(Color.MAGENTA);
              //getContentPane().setBackground(new java.awt.Color(White));
              
               img = new ImageIcon(getClass().getResource("phone.jpg"));
               j = new JLabel(img);
               j.setBounds(0, 0, 800, 534);
               c.add(j);
               
               
               
           
               icon = new ImageIcon(getClass() . getResource("shopIcon.png"));
               this.setIconImage(icon.getImage());
               
              
               
               f = new Font("F", Font.BOLD, 15);
               
               UserL = new JLabel();
               UserL.setText("Username : ");
               UserL.setFont(f);
               j.add(UserL);
               UserL.setBounds(125, 20, 150, 50);
               
               PassL = new JLabel();
               PassL.setText("Password : ");
               PassL.setFont(f);
               j.add(PassL);
               PassL.setBounds(125, 60, 150, 50);
               
               tf1 = new JTextField();
               tf1.setBounds(230, 37, 150,20);
               j.add(tf1);
              
               pf = new JPasswordField();
               pf.setBounds(230, 77, 150, 20);
               j.add(pf);
               
               cursor = new Cursor(Cursor.HAND_CURSOR);
               
               b1 = new JButton();
               b1.setCursor(cursor);
               b1.setBounds(180, 320, 100, 30);
               b1.setText("Log in➤");
               j.add(b1);
               b1.setBackground(Color.cyan);
               
               b2= new JButton();
               b2.setCursor(cursor);
               b2.setBounds(480, 390, 100, 30);
               b2.setText("Clear");
               b2.setBackground(Color.orange);
               j.add(b2);
               
               b3= new JButton();
               b3.setCursor(cursor);
               b3.setBounds(180, 390, 100, 30);
               b3.setText("⮜Go back");
               b3.setBackground(Color.orange);
               j.add(b3);
               
           
               
               
               b2.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                      tf1.setText("");
                      pf.setText("");
                      
               }
               });
               
               b1.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                      String UserN = tf1.getText();
                      String Pass = pf.getText();
                      
                      
                      if(UserN.equals("Admin") && Pass.equals("pass")){
                          
                        
                         
                           dispose();
                           Frame2 f = new Frame2();
        
                           f.setVisible(true);
                           
                           JOptionPane.showMessageDialog(null,"You are successfully logged in " , "Information", 1);
                            
                      }
                      
                      
                      else{
                      
                      JOptionPane.showMessageDialog(null,"Wrong username or password " , "Information", 1);
                      
                      }
                      
               }
               });
               
               
                b3.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                      
                   
                      dispose();
                      Frame frame = new Frame();
                      frame.setVisible(true);
                      
               }
               });
               
               
           }

                  
           
public static void main(String args[]){

    AdminLogin frame = new AdminLogin();
    frame.setVisible(true);
   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // frame.setSize(500,300);
   // frame.setLocationRelativeTo(null);
   // frame.setLocation(300,150);
   // frame.setBounds(400,150,600,400);
   // frame.setTitle("Login Page");
   // frame.setResizable(true);

}
}
    
    
    
    
    
    
    
    

