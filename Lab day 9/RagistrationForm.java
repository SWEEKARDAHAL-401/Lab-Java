import java.awt.Color;
import javax.swing.*;
class RagistrationForm {
    public static void main(String [] args) {
        JFrame f = new JFrame();
        JLabel userLabel = new JLabel("UserName :");
        JLabel PassLabel = new JLabel("Password :");
        JTextField userTextField = new JTextField();
        JPasswordField p = new JPasswordField();
        JButton b = new JButton("Login");
        userLabel.setToolTipText("UserName :");
        PassLabel.setToolTipText("UserName :");
        userLabel.setBounds(50, 100, 95, 20);
        PassLabel.setBounds(50, 150, 95, 20);
        userTextField.setBounds(200, 100, 100, 40);
        PassLabel.setForeground(Color.WHITE);
        userLabel.setForeground(Color.WHITE);
        p.setBounds(200, 150, 100, 40);
        b.setBounds(120, 200, 100, 30);
        f.add(userLabel);
        f.getContentPane().setBackground(Color.BLACK);
        f.add(userTextField);
        f.add(PassLabel);
        f.add(p);
        f.add(b);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
