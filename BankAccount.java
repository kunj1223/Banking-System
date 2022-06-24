public abstract class BankAccount { // declaring BankAccount class abstract


    private double balance; // variable for balance
    public int numberOfDeposits=1; // variable to count number of deposits
    public int numberOfWithdrawls=1; // variable to count number of wiithdrawals
    private double annualInterestRate; // variable for Annual interets rate

    public BankAccount()  // no arg constuctor 
    {

    }

    public BankAccount(double balance, double I) // arg constructor with balance and intereset rate.
    {
        this.balance=balance;
        this.annualInterestRate=I;
    }

    public void setbalance(double b) // setter method for balance
    {
        this.balance =b;
    }

    public double getbalance() // getter method for balance
    {
        return balance;
    }

    public void setAnnualinterestrate(double R)  // setter method for annual interest rate

    {
        this.annualInterestRate =R;
    }

    public double getAnnualinterestrate() // getter method for annual interest rate
     {
        return annualInterestRate;
    }

    public double calcInterest(double I) // method to calculate interest and to display total balance after adding interest
    {
         balance += balance*(annualInterestRate/12);
         return getbalance();
    }

    public abstract double deposit(double d); // abstract method for deposit
    public abstract double withdraw(double w); // abstract method for withdrawls
   


}