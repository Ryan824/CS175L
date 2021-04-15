import java.util.Random;
public class randArrayAndSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Random generator = new Random();

int [] numbers = new int[50];
for (int i = 0; i < numbers.length; i++)
{
	numbers[i] = 1 + generator.nextInt(25);
	System.out.print(numbers[i] + ",");
}
System.out.println("");

double largest = numbers[0];
for (int i = 1; i < numbers.length; i++)
{
	if (numbers[i] > largest)
	{
		largest = numbers[i];
	}

}
System.out.println("The largest value is: "+ largest);
	
double smallest = numbers[0];
for (int i = 1; i < numbers.length; i++)
{
	if (numbers[i] < smallest)
	{
		smallest = numbers[i];
	}

}	
System.out.println("The smallest value is: "+ smallest);

double sum = (largest * smallest); 
System.out.println("The product of the largest and smallest values is: "+ sum);
	
	
	}

}
