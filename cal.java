import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class smallcalc2 extends JFrame implements ActionListener {
    JButton b1, b2,b3,b4,b5;
    JTextField t1, t2, t3;

    smallcalc2() {
        setVisible(true);
        setSize(600, 600);
        setLayout(null);
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        b5 = new JButton("%");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        t1.setBounds(20, 50, 100, 30);
        t2.setBounds(20, 100, 100, 30);
        t3.setBounds(20, 250, 100, 30);
        b1.setBounds(20, 150, 100, 50);
        b2.setBounds(120, 150, 100, 50);
        b3.setBounds(220, 150, 100, 50);
        b4.setBounds(320, 150, 100, 50);
        b5.setBounds(420, 150, 100, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        if (e.getSource() == b1)
            t3.setText(Integer.parseInt(s1) + Integer.parseInt(s2) + "");
        else if(e.getSource()== b2)
            t3.setText(Integer.parseInt(s1) - Integer.parseInt(s2) + "");
        else if(e.getSource()== b3)
            t3.setText(Integer.parseInt(s1) * Integer.parseInt(s2) + "");
        else if(e.getSource()== b4)
            t3.setText(Integer.parseInt(s1) / Integer.parseInt(s2) + "");
        else 
            t3.setText(Integer.parseInt(s1) % Integer.parseInt(s2) + "");
    }

    public static void main(String[] args) {
        smallcalc2 w = new smallcalc2();
    }
}