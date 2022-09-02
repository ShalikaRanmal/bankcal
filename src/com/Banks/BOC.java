package com.Banks;

import com.bank.Bank;

public class BOC extends Bank {
    public BOC(double rate, double deposit){
        rate = rate;
        deposit = deposit;
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
        return deposit*rate;
    }
}
