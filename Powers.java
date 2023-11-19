import java.util.Scanner;
import java.lang.Math;
public class Powers{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("enter first integer");
	
	double number1 = input.nextDouble();

	System.out.println("enter second integer");
	double number2 = input.nextDouble();

	double result = Math.pow(number1,number2);
	System.out.printf("the result is: %.2f", result);
	


}
}