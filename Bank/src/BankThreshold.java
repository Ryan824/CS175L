import java.util.Scanner;
public class BankThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.print("Enter the amount you want to start the bank account with: ");
double startBal = in.nextDouble();
System.out.print("Enter the interest rate for the account: ");
double interestAmount = in.nextDouble();
BankAccount myBankAccount = new BankAccount(startBal,interestAmount);
System.out.print("Enter the threshold for your account balance to reach or 'end': ");
while (in.hasNextDouble())
{
	double thresholdBal = in.nextDouble();
	int months = 0;
	while (myBankAccount.getBalance() < thresholdBal)
	{
		myBankAccount.calcInterest();
		months++;
	}	
	myBankAccount.resetBalance(startBal);
	
	System.out.println("It will take " +months+ " months to reach the threshold");
}
			}

		}
