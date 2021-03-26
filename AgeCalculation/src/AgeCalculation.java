import javax.swing.JOptionPane;
public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String inputBirthday = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY)");
String inputDate = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY)");	


String subYearBday = inputBirthday.substring(6,10);
String subYearDate = inputDate.substring(6,10);
String subMonthBday = inputBirthday.substring(0,2);
String subMonthDate = inputDate.substring(0,2);
String subDayBday = inputBirthday.substring(3,5);
String subDayDate = inputDate.substring(3,5);	


int intYearBday = Integer.parseInt(subYearBday);
int intYearDate = Integer.parseInt(subYearDate);
int intMonthBday = Integer.parseInt(subMonthBday);
int intMonthDate = Integer.parseInt(subMonthDate);
int intDayBday = Integer.parseInt(subDayBday);
int intDayDate = Integer.parseInt(subDayDate);


int year = (intYearDate - intYearBday);
int month = (intMonthDate - intMonthBday);
int day = (intDayDate - intDayBday);
if(month < 0) month = 12 - Math.abs(month);
if(intMonthDate <= intMonthBday)
{
	year = year - 1;
}
if(intDayDate < intDayBday) 
{
	month = month - 1;
}
//else 
//{
//	month = month + 1;
//}

JOptionPane.showMessageDialog(null, "You are " +(year)+" years and " +(month )+" moth(s) old");
	}

}
