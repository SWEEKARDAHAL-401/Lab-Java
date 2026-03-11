import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculator {
    public static void main(String [] a) {
        JFrame f = new JFrame();
        JLabel x = new JLabel("X : ");
        JLabel y = new JLabel("Y :");
        JLabel res = new JLabel("Result : ");
        JTextField xn = new JTextField();
        JTextField yn = new JTextField();
        // JTextField resn = new JTextField();
        JLabel resx = new JLabel("");
        JButton add = new JButton("Add");
        JButton mul = new JButton("MUL");
        JButton sub = new JButton("SUB");
        JButton div = new JButton("DIV");
        x.setToolTipText("X :");
        y.setToolTipText("Y :");
        res.setToolTipText("Result :");
        x.setBounds(30, 30, 40, 20);
        xn.setBounds(70, 30, 70, 20);
        y.setBounds(200, 30, 40, 20);
        yn.setBounds(260, 30, 70, 20);
        add.setBounds(30, 60, 80, 20);
        mul.setBounds(120, 60, 80, 20);
        sub.setBounds(220, 60, 80, 20);
        div.setBounds(320, 60, 80, 20);
        res.setBounds(100, 120, 60, 20);
        // resn.setBounds(180, 120, 60, 20);
        resx.setBounds(180, 120, 60, 20);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a,b,resu;
                a = Integer.parseInt(xn.getText());
                b = Integer.parseInt(yn.getText());
                resu = a+b;
                // resn.setText(String.valueOf(resu));
                resx.setOpaque(true);
                resx.setBackground(Color.BLACK);
                resx.setForeground(Color.WHITE);
                resx.setText(String.valueOf(resu));
            }
        });
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a,b,resu;
                a = Integer.parseInt(xn.getText());
                b = Integer.parseInt(yn.getText());
                resu = a*b;
                // resn.setText(String.valueOf(resu));
                resx.setOpaque(true);
                resx.setBackground(Color.BLACK);
                resx.setForeground(Color.WHITE);
                resx.setText(String.valueOf(resu));
            }
        });
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a,b,resu;
                a = Integer.parseInt(xn.getText());
                b = Integer.parseInt(yn.getText());
                resu = a-b;
                // resn.setText(String.valueOf(resu));
                resx.setOpaque(true);
                resx.setBackground(Color.BLACK);
                resx.setForeground(Color.WHITE);
                resx.setText(String.valueOf(resu));
            }
        });
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a,b,resu;
                a = Integer.parseInt(xn.getText());
                b = Integer.parseInt(yn.getText());
                resu = a/b;
                // resn.setText(String.valueOf(resu));
                resx.setOpaque(true);
                resx.setBackground(Color.BLACK);
                resx.setForeground(Color.WHITE);
                resx.setText(String.valueOf(resu));
            }
        });

        f.add(x);
        f.add(xn);
        f.add(y);
        f.add(yn);
        f.add(add);
        f.add(mul);
        f.add(sub);
        f.add(div);
        f.add(res);
        // f.add(resn);
        f.add(resx);
        f.setSize(600 ,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
