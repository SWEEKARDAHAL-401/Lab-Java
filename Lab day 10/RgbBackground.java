import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class RgbBackground {
    public static void main (String [] a) {
        JFrame f = new JFrame();
        JLabel red = new JLabel("Red");
        JLabel green = new JLabel("Green");
        JLabel blue = new JLabel("Blue");
        JButton u1 = new JButton("▼");
        JButton u2 = new JButton("▼");
        JButton u3 = new JButton("▼");
        JButton out = new JButton("Output");
        JTextField r = new JTextField();
        JTextField g = new JTextField();
        JTextField b = new JTextField();
        red.setBounds(90, 20, 80, 25);
        green.setBounds(210, 20, 80, 25);
        blue.setBounds(320, 20, 80, 25);
        u1.setBounds(50, 50, 50, 25);
        r.setBounds(110, 50, 50, 25);
        u2.setBounds(170, 50, 50, 25);
        g.setBounds(230, 50, 50, 25);
        u3.setBounds(290, 50, 50, 25);
        b.setBounds(350, 50, 50, 25);
        out.setBounds(180, 100, 100, 35);
        out.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                int r1 = Integer.parseInt(r.getText());
                int g1 = Integer.parseInt(g.getText());
                int b1= Integer.parseInt(b.getText());
                if ((r1 < 256 && r1 >= 0) && (g1 < 256 && g1 >= 0) && (b1 < 256 && b1 >= 0)) {
                    f.getContentPane().setBackground(Color.getHSBColor(r1, g1, b1));
                }
            }
        });
        u1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(r.getText());
                x++;
                r.setText(String.valueOf(x));
            }
        });
        u2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(g.getText());
                x++;
                g.setText(String.valueOf(x));
            }
        });
        u3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(b.getText());
                x++;
                b.setText(String.valueOf(x));
            }
        });
        red.setForeground(Color.RED);
        green.setForeground(Color.GREEN);
        blue.setForeground(Color.BLUE);


        f.add(u1);
        f.add(u2);
        f.add(u3);
        f.add(red);
        f.add(green);
        f.add(blue);
        f.add(r);
        f.add(g);
        f.add(b);
        f.add(out);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}