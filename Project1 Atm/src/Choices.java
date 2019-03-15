
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class Choices extends JFrame implements ActionListener {

    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JLabel ll2 ;
    JLabel ln ;
    JLabel lp ;
    
    Atm a1 ;
   
    
  
    Choices(User u) {
          a1= new Atm(u);
        setLayout(null);
        btn1 = new JButton("Deposit");
        btn1.setBackground(Color.PINK);
        btn1.setForeground(Color.BLACK);
        btn1.setBounds(230,240, 230, 30);
        add(btn1);
        btn2 = new JButton("Withdraw");
        btn2.setBackground(Color.PINK);
        btn2.setForeground(Color.BLACK);
        btn2.setBounds(230, 280, 230, 30);
        add(btn2);
        btn3 = new JButton("Current Balance");
        btn3.setBackground(Color.PINK);
        btn3.setForeground(Color.BLACK);
        btn3.setBounds(230, 200, 230, 30);
        add(btn3);
        btn4 = new JButton("Next");
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        btn4.setBounds(230,320, 230, 30);
        add(btn4);
        btn5 = new JButton("Previous");
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        btn5.setBounds(230, 360, 230, 30);
        add(btn5);
         
        ll2 = new JLabel("   << YOUR BALANCE >>");
        ll2.setFont(new Font("Oswaard", Font.BOLD, 18));
        ll2.setBounds(230, 50, 530, 130);
        add(ll2); 
        
     ln =new JLabel("*********");
      ln.setFont(new Font("Oswaard", Font.BOLD, 18));
        ln.setBounds(500,320, 530, 30);
        add(ln); 
       
        lp =new JLabel("*********");
      lp.setFont(new Font("Oswaard", Font.BOLD, 18));
        lp.setBounds(500,360, 530, 30);
        add(lp); 
        
        btn5.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                 lp.setText(a1.prev());
              }
          });
        
         btn4.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                 ln.setText(a1.next());
              }
          });
         


        getContentPane().setBackground(Color.WHITE);
        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Withdraw w = new Withdraw(a1);
                w.setVisible(true);
                w.setSize(750, 750);

            }
        });

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Deposit d = new Deposit(a1);
                d.setVisible(true);
                d.setSize(750, 750);

            }
        });
          
        btn3.addActionListener (new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
       ll2.setText(u.getBalance()+"");
       System.out.println(u.getBalance());
      
      
        
    }});   

  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
