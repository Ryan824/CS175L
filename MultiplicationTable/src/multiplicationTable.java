import java.util.Scanner;
public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
int number = 1; 
int integer = 1;
int value = 0;

for(number = 1; number <= 10; number++)
{
	for(integer = 1; value < 10 * number; integer++)
	{
		value = number * integer;
		System.out.printf("%10d" , value);
	}
	System.out.println("");
}
	

	}

}
