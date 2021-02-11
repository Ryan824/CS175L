import java.util.Scanner;
public class houseCode {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int length = 0;
		int width = 0;
		int height = 0;
		int numDoors = 0;
		int doorLength = 0;
		int doorHeight = 0;
		int numWindow = 0;
		int windowLength = 0;
		int windowHeight = 0;
		int doorTotal = 0;
		int windowTotal = 0;
		int sqFtNorm = 0;
		int sqFtPeak = 0;
		int sqFttoPaint = 0;
		double costPersqft = 0;
		double costTotal = 0;
		//Input all the values of the dimensions of the house 
		System.out.println("Input length of house: ");
		length = in.nextInt();
		System.out.println("Input width of house: ");
		width = in.nextInt();
		System.out.println ("Input the height of house");
		height = in.nextInt();
		System.out.println ("Input the number of doors ");
		numDoors = in.nextInt();
		System.out.println ("Input the length of the door ");
		doorLength = in.nextInt();
		System.out.println ("Input the width of the door ");
		doorHeight = in.nextInt();
		System.out.println ("Input the number of windows ");
		numWindow = in.nextInt();
		System.out.println("Input the length of the window ");
		windowLength = in.nextInt();
		System.out.println("Input the width of the window ");
		windowHeight = in.nextInt();
		System.out.println("Input cost to paint square foot: ");
		costPersqft = in.nextInt();
		// Equations to solve for doors, windows, and sqFtNormSide and sqFtPeakside
		doorTotal = numDoors * doorLength * doorHeight;
		windowTotal = numWindow * windowLength * windowHeight;
		sqFtNorm = (length * width)*2;
		sqFtPeak = ((length * width)+((length*(height-width))/2))*2;
		//Use the answers from the equations above to find the sqFttoPaint and the sqFttoPaint total to find the total cost.
		sqFttoPaint = ((sqFtNorm+sqFtPeak)-(windowTotal+doorTotal));
		costTotal = sqFttoPaint * costPersqft;
		//Output the total area to paint and how much it would cost to paint.
		System.out.println("Your total paintable surface area is " + sqFttoPaint + " square feet. ");
		System.out.println("Cost to paint the house is " + costTotal + " dollars. ");
		in.close();
	}

}