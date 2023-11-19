import java.util.Scanner;
public class MonthDisplay{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter an integer");
	int number = scanner.nextInt();


	if (number == 1){
	System.out.printf("january");
	}
	if (number == 2){
	System.out.printf("february");
	}
	if (number ==3){
	System.out.printf("march");
	}
	if (number ==4){
	System.out.printf("April");
	}
	if (number == 5){
	System.out.printf("May");
	}
	if (number == 6){
	System.out.printf("June");
	}
	if (number == 7){
	System.out.printf("July");
	}
	if (number == 8){
	System.out.printf("August");
	}
	if ( number == 9){
	System.out.printf("September");
	}
	if ( number == 10){
	System.out.printf("October");
	}
	if ( number == 11){
	System.out.printf("November");
	}
	if ( number == 12){
	System.out.printf("December");
	}
	



}
}