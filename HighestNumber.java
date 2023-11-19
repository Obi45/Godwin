import java.util.Scanner;
public class HighestNumber{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number");
	int number1 = input.nextInt();

	System.out.println("Enter the second number");
	int number2 = input.nextInt();

	System.out.println("Enter third number");
	int number3 = input.nextInt();


	if (number1 > number2 && number1 > number3)
	System.out.println("number1");

	if (number2 > number1 && number2 > number3)
	System.out.println("number2");

	if (number3 > number1 && number3 > number2)
	System.out.println("number3");



}
}