package model;

import java.util.List;

/**
 * Created by stonezhang on 2017/7/7.
 */
public class BackTest {
    private double balance;
    private String date;

    public BackTest(double balance, String date) {
        this.balance = balance;
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
