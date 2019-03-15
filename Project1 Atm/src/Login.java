
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.getFont;
import java.awt.FontMetrics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.text.StyleConstants.Bold;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class Login extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t4;
    JButton btn1;
    JPasswordField p10;
    User u = new User(10000, "12345");
    Atm a1 = new Atm(u) ;
    
    static boolean check;
    

    Login() {
        

        setLayout(null);
        l1 = new JLabel("Welcome To Atm");
        l1.setFont(new Font("Oswaard", Font.BOLD, 38));

        l2 = new JLabel("ACCOUNT ID :");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));

        p10 = new JPasswordField(15);

        btn1 = new JButton("LOGIN");
        btn1.setBackground(Color.PINK);
        btn1.setForeground(Color.BLACK);

        l1.setBounds(175, 50, 450, 200);
        add(l1);

        l2.setBounds(125, 150, 375, 200);
        add(l2);

        p10.setFont(new Font("Arial", Font.BOLD, 14));
        p10.setBounds(330, 230, 230, 30);
        add(p10);
        btn1.setBounds(330, 270, 230, 30);

        add(btn1);

        btn1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String x = p10.getText();
        check = a1.login(x);
        if (check) {
            Choices c = new Choices(u);
            c.setVisible(true);
        }

    }
    

    public static void main(String[] args) {
        Login m = new Login();
        m.setVisible(true);

    }
    

}
