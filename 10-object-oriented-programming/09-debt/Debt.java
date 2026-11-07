/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BakaPrince
 */
public class Debt {
    private double balance;
    private double intrestRate;
    public Debt(double initialBalance, double initialInterestRate){
        this.balance=initialBalance;
        this.intrestRate=initialInterestRate;
    }
    public void printBalance(){
        System.out.println(this.balance);
        
    }
    public void waitOneYear(){
        this.balance=this.balance*this.intrestRate;
    }
}
