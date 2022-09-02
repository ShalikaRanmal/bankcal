package com.Banks;

import com.bank.Bank;

public class Sampath extends Bank {
    public Sampath(double rate, double deposit){
        this.rate = rate;
        this.deposit = deposit;
    }
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    private double rate;

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    private double deposit;

    @Override
    public double rateCalculate(){
        return this.deposit * this.rate;
    }

}
