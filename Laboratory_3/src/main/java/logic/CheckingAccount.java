/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public class CheckingAccount extends Account{
    
    private float interest;
    
    public static Binnacle log = new Binnacle();
    
    
    public CheckingAccount() {
    }

    public CheckingAccount(float interest) {
        this.interest = interest;
    }

    public CheckingAccount(float interest, String accountNumber, double balance, Client client, String bank) {
        super(accountNumber, balance, client, bank);
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    @Override
    public void deposit(double amount) {
        super.setBalance(this.getBalance()+amount);
        
       log.record("Deposit", this.getAccountNumber(), this.getClient().getId(), amount, this.getBalance());
    
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=this.getBalance())
        super.setBalance(this.getBalance()-amount);
        else
            System.out.println("You dont have enough money");
        
        log.record("withdraw", this.getAccountNumber(), this.getClient().getId(), amount, this.getBalance());
    }

    @Override
    public double interestsCalculation () {
        double total;
        total = (this.getBalance()*interest)/12;      
        return super.getBalance()+total;
        
                //End interest calculation  
    }

    @Override
    public String toString() {
    double interestEarned = (getBalance() * interest) / 12;
    double finalBalance = getBalance() + interestEarned;

    String result = "\nACCOUNT TYPE: CURRENT ACCOUNT"
        + "\n---------------------------------------------"
        + "\nMonthly Interest Rate: " + interest
        + "\nInterest Earned: " + interestEarned
        + "\nBalance After Interest: " + finalBalance
        + "\n---------------------------------------------";
    return super.toString()+result;
    }
    
    
     
}
