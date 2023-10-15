import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Age_Calculator extends JFrame implements ActionListener
{
    JTextField tf1; JTextField tf2; JButton b ;JTextField tf3; JLabel l;
    
    Age_Calculator()
    {
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        b = new JButton("Convert");
        JLabel l1 = new JLabel("Birth Year :");
        JLabel l2 = new JLabel("Birth Month :");
        l=new JLabel("AGE CALCULATOR");
        //Adding Button
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b);
        add(tf3);
        add(l);
        tf3.setVisible(false);
        
        //Setting Bounds
        l.setBounds(120,20,200,50);
        l1.setBounds(20,80,100,50);
        tf1.setBounds(90,80,100,50);
        l2.setBounds(200,80,100,50);
        tf2.setBounds(280,80,100,50);
        tf3.setBounds(100,260,200,50);
        b.setBounds(100,200,200,50);
        b.setFocusable(false);

        b.addActionListener(this);
        //EXTRA
        l.setForeground(Color.BLUE);
        l.setFont(new Font("Arial",Font.BOLD,20));

        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
        int yr = Integer.parseInt(tf1.getText());
        int mnth = Integer.parseInt(tf2.getText());
        int mnth_now = 10;
        int age = 2023 - yr;
        tf3.setVisible(true);
        tf3.setForeground(Color.RED);


        if(mnth <= mnth_now)
        {
            mnth = mnth_now - mnth;
            String ag = age+"";
            tf3.setText("Your age is " +ag+"Yr and "+mnth+"Months");
            
        }
        else
        {
            age--;
            tf3.setText("Your Age is "+age+" Yr and " +mnth_now+" Months");
            // System.out.println(age +","+mnth_now);
        }

    }

    public static void main(String args[])
    {
        new Age_Calculator();
    }
}