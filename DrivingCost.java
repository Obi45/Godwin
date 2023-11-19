import java.util.Scanner;
public class DrivingCost{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("enter a number for distance");
double distance = input.nextDouble();

System.out.println("enter a number for miles");
double miles = input.nextDouble();

System.out.println("enter a number for price");
double price = input.nextDouble();

double costofdriving = distance * miles / price;

System.out.printf("the cost of driving is:%.2f and %.2f", miles ,costofdriving);



}


}