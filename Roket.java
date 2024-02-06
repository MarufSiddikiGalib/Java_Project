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
import javax.swing.JTextField;

public class Roket extends JFrame {

    Container c;
    ImageIcon img1, img2;
    JLabel j, jl1, jl2, jl3;
    JTextField tf1, tf2, tf3;
    JButton b1, b2;
    Font f;
    Cursor cursor;

    Roket() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        //img1 = new ImageIcon(getClass().getResource("visa.png"));
        //j = new JLabel(img1);
        // j.setBounds(200, 0, 500, 250);
        //c.add(j);
        img2 = new ImageIcon(getClass().getResource("roket.png"));
        j = new JLabel(img2);
        j.setBounds(200, 55, 500, 250);
        c.add(j);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(360, 100, 550, 500);
        this.setTitle("Dashboard");
        this.setResizable(false);

        jl1 = new JLabel();
        jl1.setText("*Roket account number");
        jl1.setFont(f);
        c.add(jl1);
        jl1.setBounds(150, 50, 600, 50);

        tf1 = new JTextField();
        c.add(tf1);
        tf1.setBounds(150, 90, 150, 30);

        jl2 = new JLabel();
        jl2.setText("*Rocket account pin");
        jl2.setFont(f);
        c.add(jl2);
        jl2.setBounds(150, 130, 350, 50);

        tf2 = new JTextField();
        c.add(tf2);
        tf2.setBounds(150, 170, 150, 30);

        jl3 = new JLabel();
        jl3.setText("*Give comfirmation code");
        jl3.setFont(f);
        c.add(jl3);
        jl3.setBounds(150, 200, 250, 50);

        tf3 = new JTextField();
        c.add(tf3);
        tf3.setBounds(150, 240, 150, 30);

        b1 = new JButton();
        b1.setCursor(cursor);
        b1.setBounds(80, 400, 100, 30);
        b1.setText("⮜Go back");
        c.add(b1);
        b1.setBackground(Color.CYAN);

        b2 = new JButton();
        b2.setCursor(cursor);
        b2.setBounds(300, 400, 150, 30);
        b2.setText("complete payment");
        c.add(b2);
        b2.setBackground(Color.CYAN);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                Payment f = new Payment();
                f.setVisible(true);

            }
        });

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String cn = tf1.getText();
                String cN = tf2.getText();
                String ed = tf3.getText();
                String cv = tf3.getText();

                if (cn.equals("") && cN.equals("") && ed.equals("") && cv.equals("")) {

                    JOptionPane.showMessageDialog(null, "Enter valid imformation ", "Information", 1);
                } else {

                    JOptionPane.showMessageDialog(null, "Your Payment has been complete wait for our confirmation email  ", "Information", 1);

                }

            }
        });

    }

    public static void main(String args[]) {

        Roket frame = new Roket();
        frame.setVisible(true);
    }
}
