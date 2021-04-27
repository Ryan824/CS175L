import java.util.ArrayList;
public class BankAccountTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BankAccount2 gil = new BankAccount2("Gil",500);
	BankAccount2 joe = new BankAccount2("Joe",1000);
	BankAccount2 fred = new BankAccount2("Fred",2000);
	BankAccount2 sally = new BankAccount2("Sally",2500);
	ArrayList<BankAccount2> accountList= new ArrayList<>();
	accountList.add(gil);
	accountList.add(joe);
	accountList.add(fred);
	for(BankAccount2 Account:accountList)
	{
		System.out.println(Account.getAccount());
	}
	accountList.add(sally);
	
	double highBal = 0;
	String info = " ";
	for(BankAccount2 Account:accountList)
	{
		if(Account.getBalance() > highBal)
		{
			highBal = Account.getBalance();
			info = Account.getAccount();
		}
	}
	
	for(BankAccount2 Account:accountList)
	{
		if(Account.getBalance() > highBal)
		{
			highBal = Account.getBalance();
			info = Account.getAccount();
		}
	}
	
	System.out.println("The account with the highest balance once Sally is added is: "+info);
	accountList.remove(sally);
	
	highBal = 0;
	info = " ";
	for(BankAccount2 Account:accountList)
	{
		if(Account.getBalance() > highBal)
		{
			highBal = Account.getBalance();
			info = Account.getAccount();
		}
	}
	
	System.out.println("The account with the highest balance once Sally is removed is: "+ info);
	
	
	}
		}
