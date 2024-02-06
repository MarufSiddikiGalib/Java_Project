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


public class Frame extends JFrame{
	  
	 ImageIcon icon, img;       
         Container c;
         JLabel UserL, PassL;
         Font f;
         JTextField tf1;
         JPasswordField pf;
         JButton b1, b2, b3, b4, b5;
         JLabel j;
         Cursor cursor;
          
    Frame(){
        
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setBounds(280,70,800,534);
       this.setTitle("Login page");
       this.setResizable(false);

           initComponents();       
	   
	}
	
           public void initComponents(){
              
               
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
               b1.setBounds(180, 320, 90, 30);
               b1.setText("Log in➤");
               j.add(b1);
               b1.setBackground(Color.cyan);
               
               b2= new JButton();
               b2.setCursor(cursor);
               b2.setBounds(480, 390, 90, 30);
               b2.setText("Clear");
               b2.setBackground(Color.orange);
               j.add(b2);
               
               b3= new JButton();
               b3.setCursor(cursor);
               b3.setBounds(180, 390, 90, 30);
               b3.setText("⮜Exit");
               b3.setBackground(Color.orange);
               j.add(b3);
               
               b4= new JButton();
               b4.setCursor(cursor);
               b4.setBounds(480, 320, 90, 30);
               b4.setText("Sign up✎");
               b4.setBackground(Color.cyan);
               j.add(b4);
               
               b5= new JButton();
               b5.setCursor(cursor);
               b5.setBounds(600, 10, 130, 30);
               b5.setText("Admin Login➤");
               b5.setBackground(Color.CYAN);
               j.add(b5);
               
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
                      
                      
                      if(UserN.equals("Galib") && Pass.equals("pass")){
                          
                          
                          
                         
                           dispose();
                            userLogin f = new userLogin();
                            f.setVisible(true);
                            
                             JOptionPane.showMessageDialog(null,"You are successfully logged in " , "Information", 1);
                            
                      }
                      
                      else if(UserN.equals("Meraz") && Pass.equals("pass")){
                          
                        
                         
                           dispose();
                            userLogin f = new userLogin();
                            f.setVisible(true);
                            
                             JOptionPane.showMessageDialog(null,"You are successfully logged in " , "Information", 1);
                            
                      }
                      
                      else if(UserN.equals("Rudro") && Pass.equals("pass")){
                          
                    
                         
                           dispose();
                            userLogin f = new userLogin();
                            f.setVisible(true);
                            
                             JOptionPane.showMessageDialog(null,"You are successfully logged in " , "Information", 1);
                            
                      }
                      
                      else{
                      
                      JOptionPane.showMessageDialog(null,"Wrong username or password " , "Information", 1);
                      
                      }
                      
               }
               });
               
              
               
              
               
                
               
               
               b4.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                       dispose();
                      SignUp f = new SignUp();
                      f.setVisible(true);
                      
               }
               });
               
                b3.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                      
                      System.exit(0);
                      
               }
               });
                
               b5.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                  
                  dispose();
                AdminLogin frame = new AdminLogin();
                frame.setVisible(true);
                      
                 
               }
               });
               
               
           }
	
           
public static void main(String args[]){

    Frame frame = new Frame();
    frame.setVisible(true);
    
   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // frame.setSize(500,300);
   // frame.setLocationRelativeTo(null);
   // frame.setLocation(300,150);
   // frame.setBounds(400,150,600,400);
  //  frame.setTitle("Login Page");
    frame.setResizable(false);

}
}
