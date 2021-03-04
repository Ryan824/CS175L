import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) 
	{
Scanner in = new Scanner(System.in);
System.out.print("Enter the amount you want to start the bank account with: ");
double startBal = in.nextDouble();
BankAccount myBankAccount = new BankAccount(startBal);
System.out.print("How much money would you like to withdraw: ");
double withdrawAmount = in.nextDouble();
myBankAccount.withdraw(withdrawAmount);
System.out.print("How much money would you like to deposit: ");
double depositAmount = in.nextDouble();
myBankAccount.deposit(depositAmount);
System.out.print(myBankAccount.getBalance());

	}

}
