import java.util.Scanner;
public class Multiplications{
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("enter fisrt integer");
	int number1 = input.nextInt();
	
	System.out.println("enter second integer");
	int number2 = input.nextInt();

	int tripple = number1 * number1 * number1;
	int multiple = number2 * number2;

	int result = number1 * number1 * number1 / number2 * number2;
	if(remainder == 0 ){
	System.out.printf("result %d is a multiple of number2", result);
	}
	else{
	System.out.printf("result %d is not a multiple number2", result);
	}
}

}