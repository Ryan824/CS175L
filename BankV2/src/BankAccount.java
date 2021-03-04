/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
	//Instance variable
   private double balance;
   private double interestPct;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double startBal,double intrPct)
   {
      balance = startBal;
      interestPct = intrPct;
      System.out.println("	Created a new account with "+startBal+" balance and an interest rate of "+intrPct);
   }
   
   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double depositAmount)
   {
      balance = balance + depositAmount;
      System.out.println("	Deposited: "+depositAmount);
   }
   
   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double withdrawAmount)
   {
   if(balance >= withdrawAmount)
   
      {balance = balance - withdrawAmount;
      System.out.println("	Withdrew: "+withdrawAmount);}
   else
	   {System.out.println("	Insufficient Funds to support withdrawl");}
   }
	   
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
  
   public void calcInterest()
   {
	   double interestAmount = balance * interestPct;
	   balance = balance + interestAmount;
	   {System.out.println("	Interest: "+interestAmount);}
   }
     
   
   public double getBalance()
   {
      return balance;
   }
}
