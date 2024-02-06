package newpackage;


import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
                  
public class SignUp extends JFrame {
          JLabel name, email, pass, rptPass, phnNo;
          JTextField tf1, tf2, tf3;
          JPasswordField pf1, pf2;
          JButton b1, b2, b3;
          Container c;
          Font f;
          Cursor cursor;
    SignUp(){
        
              c = this.getContentPane();
              c.setLayout(null);
              c.setBackground(Color.white);
              //getContentPane().setBackground(new java.awt.Color(White));
        
                 f = new Font("F", Font.ITALIC, 15);
               
               name = new JLabel();
               name.setText("Name : ");
               name.setFont(f);
               c.add(name);
               name.setBounds(150, 20, 150, 50);
               
               tf1 = new JTextField();
               tf1.setBounds(300, 38, 100,20);
               c.add(tf1);
               
               
               email = new JLabel();
               email.setText("Email : ");
               email.setFont(f);
               c.add(email);
               email.setBounds(150, 80, 150, 50);
               
               tf2 = new JTextField();
               tf2.setBounds(300, 98, 100,20);
               c.add(tf2);
               
               
               pass = new JLabel();
               pass.setText("Password : ");
               pass.setFont(f);
               c.add(pass);
               pass.setBounds(150, 140, 150, 50);
               
               pf1 = new JPasswordField();
               pf1.setBounds(300, 158, 100, 20);
               c.add(pf1);
               
               
               rptPass = new JLabel();
               rptPass.setText("Reapeat password : ");
               rptPass.setFont(f);
               c.add(rptPass);
               rptPass.setBounds(150, 200, 150, 50);
               
               pf2 = new JPasswordField();
               pf2.setBounds(300, 218, 100, 20);
               c.add(pf2);
               
               
               phnNo = new JLabel();
               phnNo.setText("Phone no : ");
               phnNo.setFont(f);
               c.add(phnNo);
               phnNo.setBounds(150, 260, 150, 50);
               
               tf3 = new JTextField();
               tf3.setBounds(300, 278, 100,20);
               c.add(tf3);
               
               cursor = new Cursor(Cursor.HAND_CURSOR);
               
               b1 = new JButton();
               b1.setCursor(cursor);
               b1.setBounds(250, 320, 100, 30);
               b1.setText("Register");
               c.add(b1);
               b1.setBackground(Color.CYAN);
               
               b2 = new JButton();
               b2.setCursor(cursor);
               b2.setBounds(370, 320, 100, 30);
               b2.setText("Clear");
               c.add(b2);
               b2.setBackground(Color.CYAN);
               //b2.setBackground(Color.decode("#2E75B6"));
               
               b3 = new JButton();
               b3.setCursor(cursor);
               b3.setBounds(130, 320, 100, 30);
               b3.setText("Go back");
               c.add(b3);
               b3.setBackground(Color.CYAN);
               
               
               b1.addActionListener(new ActionListener (){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                      String UserN = tf1.getText();
                      String Email = tf2.getText();
                      String Pass = pf1.getText();
                      String rptpass = pf2.getText();
                      String phnNo = tf3.getText();
                      
                      if(UserN.equals("") && Email.equals("") && rptpass.equals("") && Pass.equals("") && phnNo.equals("")){
                          
                          
                          
                         JOptionPane.showMessageDialog(null,"Enter valid imformation " , "Information", 1);
                         
                          
                            
                      }
                      
                      
                      else{
                        
                            try{
                      
                          File file = new File("SignUpData.txt");
                            if (!file.exists()) {
                            file.createNewFile();
                        }
                            
                          
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);
                        
                        pw.println("             ## Registered user data ##");
                        pw.println("User Name : " + UserN);
                        pw.println("Email : " + Email);
                        pw.println("Password : " + Pass);
                        pw.println("reapeat password : " + rptpass);
                        pw.println("Phone no : " + phnNo);                      
                        pw.println("===============================================");
                        pw.close();
                        
                          
                      }
                      
                      catch(IOException ex){
                      
                          System.out.println(ex);
                      }
                          
                    
                      JOptionPane.showMessageDialog(null,"You are succesfully registered " , "Information", 1);
                      
                      }
                      
               }
               });
               
                
               b2.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                      tf1.setText("");
                      tf2.setText("");
                      tf3.setText("");
                      pf1.setText("");
                      pf2.setText("");
                      
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
               
               
               
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setBounds(400,150,600,400);
       this.setTitle("Dashboard2");
       this.setResizable(false);
    }
    
    public static void main(String args[]){
    
        SignUp f = new SignUp();
        f.setVisible(true);
    }
    } 