import java.util.Scanner;


public class CurrencyExchange{
 	public static void main(String[] args){
		// Prompts user to enter exchange rate USD -> RMB
		// 0: USD -> RMB
		// 1: RMB -> USD
		// Prompt user to enter amount depending on what selection is made above







		Scanner input = new Scanner(System.in);

		System.out.println("enter the exchange value: ");
		double rate = input.nextDouble();

		System.out.println("0: USD -> RMB || 1: RMB -> USD");
		int selectionNumber = input.nextInt();

		if ( selectionNumber == 0){
			System.out.println("Enter the dollar amount"); 
			double dollar = input.nextDouble();
			double yuan = (dollar * rate);
			System.out.printf("your $ %f is %fRMD ",dollar,yuan);

		}
		if ( selectionNumber == 1){
			System.out.println("Enter the yaun amount");
			double yaun = input.nextDouble();
			double dollar = rate /yaun;
			 }
}
}   