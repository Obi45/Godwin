import java.util.Scanner;
public class DisplayTime{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter an integer for seconds");
	int seconds = input.nextInt();

	int minutes = seconds / 60;
	int remainingSeconds = seconds % 60;

	System.out.println("the number of minutes is %d%n, the 	number of remainingSeconds is %d%n", minutes, 	remainingSeconds);

	
	
}

}