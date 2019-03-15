
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Withdraw extends JFrame implements ActionListener {
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn0;
    JLabel l1;
    JTextField j1 ;
    JButton btn22 ;
    
    Atm a1 ;
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   Withdraw(Atm u)
{   
    a1=u;
     
    setLayout(null);
        l1 = new JLabel("Withdraw");
        l1.setFont(new Font("Oswaard", Font.BOLD, 38));
        l1.setBounds(100, 50, 450, 200);
        add(l1);
        j1 = new JTextField(15);
        j1.setBounds(100, 190, 100, 50);
        add(j1);
        btn1 = new JButton("0");
        btn1.setBackground(Color.PINK);
        btn1.setForeground(Color.BLACK);
        btn1.setBounds(330, 470, 100, 30);
        add(btn1);
        btn2 = new JButton("1");
        btn2.setBackground(Color.PINK);
        btn2.setForeground(Color.BLACK);
        btn2.setBounds(330, 110, 100, 30);
        add(btn2);
        btn3 = new JButton("2");
        btn3.setBackground(Color.PINK);
        btn3.setForeground(Color.BLACK);
        btn3.setBounds(330, 150, 100, 30);
        add(btn3);
        btn4 = new JButton("3");
        btn4.setBackground(Color.PINK);
        btn4.setForeground(Color.BLACK);
        btn4.setBounds(330, 190, 100, 30);
        add(btn4);
        btn5 = new JButton("4");
        btn5.setBackground(Color.PINK);
        btn5.setForeground(Color.BLACK);
        btn5.setBounds(330, 230, 100, 30);
        add(btn5);
        btn6 = new JButton("5");
        btn6.setBackground(Color.PINK);
        btn6.setForeground(Color.BLACK);
        btn6.setBounds(330, 270, 100, 30);
        add(btn6);
        btn7 = new JButton("6");
        btn7.setBackground(Color.PINK);
        btn7.setForeground(Color.BLACK);
        btn7.setBounds(330, 310, 100, 30);
        add(btn7);
        btn8 = new JButton("7");
        btn8.setBackground(Color.PINK);
        btn8.setForeground(Color.BLACK);
        btn8.setBounds(330, 350, 100, 30);
        add(btn8);
        btn9 = new JButton("8");
        btn9.setBackground(Color.PINK);
        btn9.setForeground(Color.BLACK);
        btn9.setBounds(330, 390, 100, 30);
        add(btn9);
        btn0 = new JButton("9");
        btn0.setBackground(Color.PINK);
        btn0.setForeground(Color.BLACK);
        btn0.setBounds(330, 430, 100, 30);
        add(btn0);
        btn22 = new JButton("Done");
        btn22.setBackground(Color.PINK);
        btn22.setForeground(Color.BLACK);
        btn22.setBounds(100, 270, 100, 30);
        add(btn22);
        
        setSize(750, 750);
        setLocation(500, 200);
        
        btn1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             j1.setText(j1.getText()+"0");
         }
     });
        btn0.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
           j1.setText(j1.getText()+"9");  
         }});
     
        btn2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"1"); 
         }
     });
         btn3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"2"); 
         }
     });
          btn4.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"3"); 
         }
     });
           btn5.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"4"); 
         }
     });
            btn6.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"5"); 
         }
     });
             btn7.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"6"); 
         }
     });
              btn8.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"7"); 
         }
     });
               btn9.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              j1.setText(j1.getText()+"8"); 
         }
     });
          btn22.addActionListener(new ActionListener() {

         @Override
         public  void actionPerformed(ActionEvent e) {
             
            a1.withdraw(j1.getText());
             setVisible(false);
           
         }
         

         private String getText(JTextField j1) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
                    
 
}

}