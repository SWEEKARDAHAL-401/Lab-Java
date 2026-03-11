import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Buttons {
    public static void main(String [] args) {
      JFrame f = new JFrame();
      JButton b1 = new JButton("Red");
      JButton b2 = new JButton("Green");
      b1.setBounds(50,100,100,30);
      b2.setBounds(200, 100, 100, 30);
      b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f.getContentPane().setBackground(Color.RED);
        }
      });
      b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f.getContentPane().setBackground(Color.GREEN);
        }
      });
        f.add(b1);
        f.add(b2);
        f.setSize(600, 900);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
