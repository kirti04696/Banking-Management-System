/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Kirti Sharma
 */
public class Account {
    private long acc_no;
    private int acc_holder;
    private Date opening_date;
    private int created_by;
    private int balance;

    public Account(long acc_no, int acc_holder, Date opening_date, int created_by, int balance) {
        this.acc_no = acc_no;
        this.acc_holder = acc_holder;
        this.opening_date = opening_date;
        this.created_by = created_by;
        this.balance = balance;
    }

    public Account() {
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public int getAcc_holder() {
        return acc_holder;
    }

    public void setAcc_holder(int acc_holder) {
        this.acc_holder = acc_holder;
    }

    public Date getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(Date opening_date) {
        this.opening_date = opening_date;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "acc_no=" + acc_no + ", acc_holder=" + acc_holder + ", opening_date=" + opening_date + ", created_by=" + created_by + ", balance=" + balance + '}';
    }
    
    
    
           
}
