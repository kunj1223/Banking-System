

public class SavingAccount extends BankAccount { // declaring bankaccount class as uper class and savings account as sub class
    
    public void status() // to check if account is active or not
     {
        if (getbalance()<25) {
            System.out.println("Your account is currently inactive.");
        }
        else {
             System.out.println(" Your account is currently Active.");
        }
    }

   public SavingAccount(double b, double i) // constructor
    {
      setbalance(b);
      setAnnualinterestrate(i);
   }

    public double deposit(double d) // method which calculates total balance after deposits and also updates the number of deposits to keep track.
    {
       setbalance(getbalance()+d);
       numberOfDeposits++;
       return getbalance();
    }

    public double withdraw(double w) // method which calculates total balance after withdraw and also updates the number of deposits to keep track.
    {
        setbalance(getbalance()-w);
        numberOfWithdrawls++;
        return getbalance();
     }

     public int countforwithdrwals =0;  // variable to keep track how much time user has charged extra after exceeding 4 withdrwals.
      

   public void monthlyprocess() { // to keep charge 1 after 4 withdrwals
     if (numberOfWithdrawls <=4) {
       System.out.println("You have not exceeded maximum number od withdrwals");
     } else {
       System.out.println("you will be charged $1 for this transaction.");
       setbalance(getbalance()-1);
       countforwithdrwals++;
     }
   }

  
        
        
    

     public void nothing() { // TO PRINT END RESULT
       System.out.println(" Total number of deposits made " + (numberOfDeposits-1));
       System.out.println(" Total nuber of withdrals made " + (numberOfWithdrawls-1));
       System.out.println(" Number of service charged " + countforwithdrwals);
     }   
      
  
 }