import java.util.Scanner;
public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

String creditCardNumber = " ";
System.out.println("Enter a Credit Card number or -99 to end:");	

while (in.hasNextLine())
{
	creditCardNumber = in.nextLine(); 
	if (creditCardNumber.equals("-99"))
	{
		System.out.println("Goodbye");
		break;
	}


int i = 0;
while (i < creditCardNumber.length())
{
	char creditCard = creditCardNumber.charAt(i);
	if (creditCard == ' ' || creditCard == '-')
	{
		String creditCardBefore = creditCardNumber.substring(0, i);
		String creditCardAfter = creditCardNumber.substring(i + 1);
		creditCardNumber = creditCardBefore + creditCardAfter;
	}
	else
	{
		i++;
	}
}

System.out.println(creditCardNumber);
System.out.println("Enter a Credit Card number or -99 to end:");
	
	}
	}
}
