/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author angel
 */
public class SavingsAccount extends Account{
    
    //Atributes
    private String initialDate;
    private int months;
    private float interest;
    
    public static Binnacle log = new Binnacle();
    
    //Builder

    public SavingsAccount(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingsAccount(String initialDate, int months, float interest, String accountNumber, double balance, Client client, String bank) {
        super(accountNumber, balance, client, bank);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
     
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
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
        
        log.record("deposit", this.getAccountNumber(), this.getClient().getId(), amount, this.getBalance());
    
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
        total = this.getMonths()
                *super.getBalance()
                *this.getInterest();
        
        return super.getBalance()+total;
        
                //End interest calculation       
    }

    @Override
    public String toString() {
        String result = "\nAccount Type: SAVING ACCOUNT"
                +"\n----------------------------------"
                +"\n Initial date of account: "+this.getInitialDate()
                +"\n Months of saving: "+this.getMonths()
                +"\n Interest: "+this.getInterest()
                +"\n Gained Interest: "+((this.getMonths()
                                       *super.getBalance()/100)
                                       *this.getInterest()
                )
                +"\n Balance after interest: "+this.getBalance()+ ((this.getMonths()
                                       *super.getBalance()/100)
                                       *this.getInterest()
                );
                
                return super.toString()+result;
                }
 }
    
    
    

