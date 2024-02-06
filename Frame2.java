package newpackage;


import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Frame2 extends JFrame {
         
        private Container c;
        private JLabel pid, pn, pq, pp, cat;
        private JTextField tf1, tf2, tf3, tf4;
        private JButton b1, b2, b3, b4, b5;
        private ImageIcon icon;
        private Cursor cursor;
        private JTable table;
        private DefaultTableModel model;
        private JScrollPane scroll;
        
        private String[] col = {"Product id", "Product name", "Quantity", "Product price"};
        private String[] row = new String[4];
        
    Frame2(){
        
       initComponents();
               
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setBounds(300,80,700,500);
       this.setTitle("Dashboard");
       this.setResizable(false);
      
    }
    
    public void initComponents(){
        
          c = this.getContentPane();
          c.setLayout(null);
          c.setBackground(Color.blue);
          getContentPane().setBackground(new java.awt.Color(51-153-255));
          
    
          pid = new JLabel();
          pid.setText("Product ID : ");
          c.add(pid);
          pid.setBounds(30, 20, 150, 50);
          
          tf1 = new JTextField();
          tf1.setBounds(140, 35, 120,20);
          c.add(tf1);
          
          
          pn = new JLabel();
          pn.setText("Product Name : ");
          c.add(pn);
          pn.setBounds(30, 55, 150, 50);
          
          tf2 = new JTextField();
          tf2.setBounds(140, 72, 120, 20);
          c.add(tf2);
          
     
          pq = new JLabel();
          pq.setText("Quantity : ");
          c.add(pq);
          pq.setBounds(330, 20, 150, 50);
          
          tf3 = new JTextField();
          tf3.setBounds(440, 35, 120,20);
          c.add(tf3);
          
          
          pp = new JLabel();
          pp.setText("Product Price : ");
          c.add(pp);
          pp.setBounds(330, 55, 150, 50);
          
          tf4 = new JTextField();
          tf4.setBounds(440, 72, 120,20);
          c.add(tf4);
          
          
          cat = new JLabel();
          cat.setText("Category : ");
          c.add(cat);
          cat.setBounds(30, 90, 150, 50);
          
          cursor = new Cursor(Cursor.HAND_CURSOR);
          
          b1 = new JButton("Add");
          b1.setCursor(cursor);
          c.add(b1);
          b1.setBounds(100, 350, 80, 30);
          // b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("icon-36.png")));
          b1.setBackground(Color.CYAN);
          
          b2 = new JButton("Edit");
          b2.setCursor(cursor);
          c.add(b2);
          b2.setBounds(200, 350, 80, 30);
          b2.setBackground(Color.CYAN);
          
          b3 = new JButton("Delete");
          b3.setCursor(cursor);
          c.add(b3);
          b3.setBounds(300, 350, 80, 30);
          b3.setBackground(Color.CYAN);
          
          b4 = new JButton("Clear");
          b4.setCursor(cursor);
          c.add(b4);
          b4.setBounds(400, 350, 80, 30);
          b4.setBackground(Color.CYAN);
                  
          b5 = new JButton("Go back");
          b5.setCursor(cursor);
          c.add(b5);
          b5.setBounds(280, 400, 90, 30);
          b5.setBackground(Color.CYAN);
          
          table = new JTable();
          model = new DefaultTableModel();
          
          model.setColumnIdentifiers(col);
          table.setModel(model);
          table.setSelectionBackground(Color.GREEN);
          table.setRowHeight(30);
          
          scroll = new JScrollPane(table);
          scroll.setBounds(45, 150, 600, 180);
          c.add(scroll);
          
          
          
          table.addMouseListener(new MouseAdapter(){
          
                public void MouseClicked(MouseEvent e){
                
                  int NumberOfRow = table.getSelectedRow();
                
                    String pid = model.getValueAt(NumberOfRow, 0).toString();
                    String pn = model.getValueAt(NumberOfRow, 1).toString();
                    String pq = model.getValueAt(NumberOfRow, 3).toString();
                    String pp = model.getValueAt(NumberOfRow, 4).toString();
                     
                      tf1.setText(pid);
                      tf2.setText(pn);
                      tf3.setText(pq);
                      tf4.setText(pp);
                  
                }
          
          });
          
          
          
          b1.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                     
                   row[0] = tf1.getText();
                   row[1] = tf2.getText();
                   row[2] = tf3.getText();
                   row[3] = tf4.getText();
                   model.addRow(row);
                   
                      
               }
               });
    
          
           b3.addActionListener(new ActionListener(){
                   
               @Override
               public void actionPerformed(ActionEvent e){
                     
                  int numberOfRow =  table.getSelectedRow();
                  
                    if(numberOfRow >= 0){
                        
                        model.removeRow(numberOfRow);
                    
                    }
                    else{
                    
                        JOptionPane.showMessageDialog(null,"No row has been selected " , "Information", 1);
                    
                    }
                        
               }
               });
          
          
          
            b4.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                      tf1.setText("");
                      tf2.setText("");
                      tf3.setText("");
                      tf4.setText("");
                      
                      
               }
               });
             b5.addActionListener(new ActionListener(){
                   
               public void actionPerformed(ActionEvent e){
                   
                      dispose();
                     AdminLogin frame = new AdminLogin();
                     frame.setVisible(true);
                      
               }
               });
    
    }
    
    
    
    public static void main(String args[]){
    
        Frame2 f = new Frame2();
        f.setVisible(true);

    
    
    
}   
}
