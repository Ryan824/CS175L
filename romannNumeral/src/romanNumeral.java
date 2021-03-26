import java.util.Scanner;
public class romanNumeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner in = new Scanner(System.in);
System.out.print("Enter a positve integer up to 3999: ");
String date = in.next();
int numeralDate = Integer.parseInt(date);
int Thousands = (numeralDate / 1000)%10;;
int Hundreds = (numeralDate / 100)%10;
int Tens = (numeralDate / 10)%10; 
int Ones = (numeralDate / 1)%10; 
String numeral = "";


if(numeralDate > 3999)
	System.out.print("Invalid number");
if(Thousands >= 3)
{
	numeral  = numeral + "MMM";
}
else if(Thousands >= 2)
{
	numeral = numeral + "MM";
}
else if(Thousands >= 1)
{
	numeral = numeral + "M";
}
if(Hundreds >= 9)
{
	numeral = numeral + "CM";
}
else if(Hundreds >= 8)
{
	numeral = numeral + "DCCC";
}
else if(Hundreds >= 7)
{
	numeral = numeral + "DCC";
}
else if(Hundreds >= 6)
{
	numeral = numeral + "DC";		
}
else if(Hundreds >= 5)
{
	numeral = numeral + "D";
}
else if(Hundreds >= 4)
{
	numeral = numeral + "CD";
}
else if(Hundreds >= 3)
{
	numeral = numeral + "CCC";
}
else if(Hundreds >= 2)
{
	numeral = numeral + "CC";
}
else if(Hundreds >= 1)
{
	numeral = numeral + "C";
}
if(Tens >= 9)
{
	numeral = numeral + "XC";
}
else if(Tens >= 8)
{
	numeral = numeral + "LXXX";
}
else if(Tens >= 7)
{
	numeral = numeral + "LXX";
}
else if(Tens >= 6)
{
	numeral = numeral + "LX";		
}
else if(Tens >= 5)
{
	numeral = numeral + "L";
}
else if(Tens >= 4)
{
	numeral = numeral + "XL";
}
else if(Tens >= 3)
{
	numeral = numeral + "XXX";
}
else if(Tens >= 2)
{
	numeral = numeral + "XX";
}
else if(Tens >= 1)
{
	numeral = numeral + "X";
}
if(Ones >= 9)
{
	numeral = numeral + "IX";
}
else if(Ones >= 8)
{
	numeral = numeral + "VIII";
}
else if(Ones >= 7)
{
	numeral = numeral + "VII";
}
else if(Ones >= 6)
{
	numeral = numeral + "VI";		
}
else if(Ones >= 5)
{
	numeral = numeral + "V";
}
else if(Ones >= 4)
{
	numeral = numeral + "IV";
}
else if(Ones >= 3)
{
	numeral = numeral + "III";
}
else if(Ones >= 2)
{
	numeral = numeral + "II";
}
else if(Ones >= 1)
{
	numeral = numeral + "I";
}


System.out.print(numeral);

	}

}
