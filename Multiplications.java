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

	int remainder = tripple % multiple;
	if(remainder == 0 ){
	System.out.printf("%d is a multiple of %d", number1, number2);
	} else{
	System.out.println("%d is not a multiple of %d", number1, number2);
	}
}

}