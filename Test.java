import java.util.Scanner;

public class Test  {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); // scanner object

        

        System.out.println("Please enter your Account Balance "); 
        double b1=in.nextDouble(); // to take amount of balance

       
        for (int i=0; i<100000 ; i++) { // TO CHECK THAT ENTERED BALANCE IS NOT NEGATIVE AND IF ITS NEGATIVE IT ASKS USER TO ENTER AGAIN.
            if (b1<0) {
             System.out.println("Balance cannot be negative. Please enter it again. ");
             b1=in.nextDouble();
         }
         else {
            System.out.println( "Your account balance is $ " +b1);
            break;
     
        } 
    }

        System.out.println("Please enter your Annual Interest Rate for account "); 
        double i1=in.nextDouble();          // TO TAKE INPUT FOR INTEREST
        System.out.println("your annual interest rate is " + i1);

       SavingAccount account1 = new SavingAccount(b1, i1); // NEW ACCOUNT1 OBJECT OF SAVINGSACCOUNT

       System.out.printf("The Balance after Monthly Interest = $ % .2f %n", account1.calcInterest(i1));

       
       System.out.println("Please enter the amount you want to withdraw.");
       double w=in.nextDouble();
       System.out.println("Please enter the amount you want to deposit.");
       double d=in.nextDouble();

       account1.status();

       System.out.printf("The balance after withdrawl = $ % .2f %n", account1.withdraw(w));
       System.out.printf("The balance after deposit = $ % .2f %n", account1.deposit(d));

       for (int i=0; i<1000000 ; i++) // TO ASK USER IF USER WANTS TO WITHDRWAL AGAIN OR NOT
        { 
           System.out.println("Do you want to make any more withdrawals? If yes please enter 1 and if no please enter 0");
           int z=in.nextInt();
           if (z==1) { 
            System.out.println("Please enter the amount you want to withdraw.");
            w=in.nextDouble();
            account1.monthlyprocess();
            System.out.printf("The balance after withdrawl = $ % .2f %n", account1.withdraw(w));
            account1.status();
        
        } else 
           break;
       }
   
       for (int i=0; i<1000000 ; i++) // TO ASK USER IF USER WANTS TO WITHDRWAL AGAIN OR NOT
       {
        System.out.println("Do you want to make any more deposits? If yes please enter 1 and if no please enter 0");
        int z=in.nextInt();
        if (z==1) { 
         System.out.println("Please enter the amount you want to deposit.");
         d=in.nextDouble();
         System.out.printf("The balance after deposit = $ % .2f %n", account1.deposit(d));
         account1.status();
        
        } else 
        break;  
    } 

 
   account1.nothing(); 
      in.close(); // SCANNER CLOSED
    }
    
}
             