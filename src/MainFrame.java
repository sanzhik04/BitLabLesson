//MainFrame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame  extends JFrame {
    private JButton button;
    public JLabel label;
    public int X ;
    public int Y;
    ThreadSample ts;
    boolean check;



    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
        setLayout(null);

        label = new JLabel("#");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        button = new JButton("FIRE");
        button.setSize(300,30);
        button.setLocation(100,100);

        X = 100;
        Y = 100;


        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){





            }
        });
        add(button);

    }


}
