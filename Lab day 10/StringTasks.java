import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringTasks {
    String convert(String S) {
        String x = "";
        for(int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if(Character.isUpperCase(ch)) {
                x += Character.toLowerCase(ch);
            } else {
                x += Character.toUpperCase(ch);
            }
        }
        return x;
    }
    String reverse(String S) {
        String rev = "";
        for(int i = S.length() -1; i>=0;i--) {
            rev+=S.charAt(i);
        }
        return rev;
    }
    int checkVowel(String S) {
        int v=0;
        int c = 0;
        S = S.toLowerCase();
        for(int i = S.length()-1; i>=0; i--) {
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' ||S.charAt(i) == 'u') {
                v++;
            }else {
                c++;
            }
        }
        return v;
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        StringTasks S = new StringTasks();
        JLabel enter = new JLabel("Enter The String :");
        JLabel out = new JLabel("Hello");
        JTextField inp = new JTextField();
        JTextField outf = new JTextField();
        JButton rev = new JButton("Reverse");
        JButton caps = new JButton("IN CAPS");
        JButton small = new JButton("IN SMALL");
        JButton vowel = new JButton("VOWELS");
        JButton convert = new JButton("CONVERT CASE");
        
        enter.setBounds(80, 50, 150, 30);
        inp.setBounds(230, 50, 150, 30);
        out.setBounds(80, 120, 150, 30);
        outf.setBounds(230, 120, 150, 30);
        rev.setBounds(80, 300, 100, 30);
        caps.setBounds(180, 330, 100, 30);
        small.setBounds(280, 300, 100, 30);
        vowel.setBounds(380, 330, 100, 30);
        convert.setBounds(480, 300, 150, 30);



        rev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.add(outf);
                f.add(out);
                out.setText("Reverse Of String");
                String x = inp.getText();
                x = S.reverse(x);
                outf.setText(x);
            }
        });
        vowel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.add(outf);
                f.add(out);
                out.setText("No of Vowels");
                String x = inp.getText();
                int val = S.checkVowel(x);
                outf.setText(String.valueOf(val));
            }
        });
        caps.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.add(outf);
                f.add(out);
                out.setText("In UpperCase");
                String x = inp.getText();
                x = x.toUpperCase();
                outf.setText(x);
            }
        });
        small.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.add(outf);
                f.add(out);
                out.setText("In LowerCase");
                String x = inp.getText();
                x = x.toLowerCase();
                outf.setText(x);
            }
        });
        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.add(outf);
                f.add(out);
                out.setText("CHANGED CASE");
                String x = inp.getText();
                x = S.convert(x);
                outf.setText(x);
            }
        });

        f.getContentPane().setBackground(Color.GRAY);
        f.add(convert);
        f.add(rev);
        f.add(caps);
        f.add(small);
        f.add(vowel);
        f.add(enter);
        f.add(inp);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
