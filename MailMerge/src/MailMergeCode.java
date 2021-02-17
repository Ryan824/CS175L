import java.util.Scanner;
public class MailMergeCode {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String replaceText1 = "Dear <firstName> <lastName>,";
String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
String replaceText3 = "Your answer is: <yORn> Goodbye!";
String promptText1 = "Please enter your first name: ";
System.out.print(promptText1);
String firstName = in.next();
String promptText2 = "Please enter your last name: ";
System.out.print(promptText2);
String lastName = in.next();
String promptText3 = "Please enter your house number: ";
System.out.print(promptText3);
String houseNumber = in.next();
String promptText4 = "Please enter your street: ";
System.out.print(promptText4);
String street = in.next();
replaceText1 = replaceText1.replace("<firstName>",firstName);
replaceText1 = replaceText1.replace("<lastName>",lastName);
System.out.println(replaceText1);
replaceText2 = replaceText2.replace("<houseNumber>",houseNumber);
replaceText2 = replaceText2.replace("<street>",street);
System.out.println(replaceText2);
String promptText5 = "Is this address correct? ";
System.out.print(promptText5);
String answer = in.next();
replaceText3 = replaceText3.replace("<yORn>",answer);
System.out.print(replaceText3);

	}

}
