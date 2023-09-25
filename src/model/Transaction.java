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
public class Transaction {
    private int trans_id;
    private String trans_type;
    private Date date;
    private int trans_from;
    private int trans_to;
    private int amount;
    private int transfer_by;

    public Transaction(int trans_id, String trans_type, Date date, int trans_from, int trans_to, int amount, int transfer_by) {
        this.trans_id = trans_id;
        this.trans_type = trans_type;
        this.date = date;
        this.trans_from = trans_from;
        this.trans_to = trans_to;
        this.amount = amount;
        this.transfer_by = transfer_by;
    }

    public Transaction() {
    }

    public int getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }

    public String getTrans_type() {
        return trans_type;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTrans_from() {
        return trans_from;
    }

    public void setTrans_from(int trans_from) {
        this.trans_from = trans_from;
    }

    public int getTrans_to() {
        return trans_to;
    }

    public void setTrans_to(int trans_to) {
        this.trans_to = trans_to;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTransfer_by() {
        return transfer_by;
    }

    public void setTransfer_by(int transfer_by) {
        this.transfer_by = transfer_by;
    }

    @Override
    public String toString() {
        return "Transaction{" + "trans_id=" + trans_id + ", trans_type=" + trans_type + ", date=" + date + ", trans_from=" + trans_from + ", trans_to=" + trans_to + ", amount=" + amount + ", transfer_by=" + transfer_by + '}';
    }
    
    
    
}
