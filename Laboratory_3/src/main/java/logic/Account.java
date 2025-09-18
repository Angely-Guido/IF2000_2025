/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author angel
 */
public abstract class Account {
    
        //attributes
    private String accountNumber;
    private double balance;
    private Client client;
    
    private String bank;

    public Account() {
        
    }

    public Account(String accountNumber, double balance, Client client, String bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
        this.bank = bank;
    
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    
    

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

   
    //Methods  for polimorfism
    
    public abstract void deposit(double amount);
    public abstract void  withdraw(double amount);
    public abstract double interestsCalculation();

    @Override
    public String toString() {
        String result = "\n BANK Account INFORMATION:"
        +"\n ---------------------------------------"
        +"\nAccount Number:" + this.getAccountNumber()
        +"\nBalance:"+this.getBalance()
        + "\nBank: " + bank
        +"\nAccount Owern:\n "+ this.getClient().toString();
     return result;
       
    }
    
}
