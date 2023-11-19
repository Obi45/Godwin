 import java.util.Scanner;

public class WindChillTemperature{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
       
	System.out.println("enter first double");
	double temperature = input.nextDouble();

	System.out.println("enter second double");
	double velocity = input.nextDouble();

	double tempvelo = 35.74 + 0.6215*temperature-35.75*
Math.pow(velocity,0.16);




 double tws = tempvelo + 0.4275 * temperature *Math.pow(velocity,0.16);



System.out.printf("the result is %d%n and the tws rate is %d%n, tempvelo, tws");
}
	

}