import java.util.Scanner;
public class SeparatingDigits{	
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a five digit number");
int value = input.nextInt();

int number1 = value / 10000; 
int remainder = value % 10000;

int number2 = remainder / 1000;
 remainder = remainder % 1000;

int number3 = remainder / 100;
 remainder = remainder % 100;

int number4 = remainder / 10;
 remainder = remainder % 10;

int number5 = remainder  % 10;

System.out.printf("the value is:%d %d %d %d %d", number1 ,number2 ,number3 ,number4 ,number5);
}





}