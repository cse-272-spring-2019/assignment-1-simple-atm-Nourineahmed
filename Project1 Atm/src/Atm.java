
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class Atm implements MyAtm {

    User u;
    int cnt = 0;
    double currentbal;
    String Password;
    ArrayList<String> History = new ArrayList<String>();

    public boolean login(String Password) {

        return this.u.getCardNum().equals(Password);
    }

    public void Account(String P, double cb) {
        Password = P;
        currentbal = cb;
    }

    public Atm(User u) {
        this.u = u;
    }

    /**
     *
     * @return
     */
    @Override
    public String getCurrentBalance() {

        return u.getBalance() + "";
    }

    /**
     *
     * @param amount
     */
    public void withdraw(String amount) {
        double x = Double.parseDouble(amount);
        if (u.getBalance() > x) {
            double currentbal = u.getBalance();
            u.setBalance(currentbal - x);
            History.add("Withdrawn " + amount);
            cnt++;
        }

    }

    @Override
    public void deposit(String amount) {
        double dep = Double.parseDouble(amount);
        double currentbalance = u.getBalance();
        u.setBalance(currentbalance + dep);
        History.add("Added " + amount);
        cnt++;

    }

    @Override
    public String prev() {
        
        if (cnt == 0) {
            
            return ("NO MORE");
        }
        return History.get(--cnt);

    }

    @Override
    public String next() {
       
        if (cnt == History.size()-1) {
           
            return("NO MORE");
        }
        return History.get(++cnt);

    }

}
