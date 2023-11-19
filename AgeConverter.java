import java.util.Scanner;
public class AgeConverter{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("enter the users age in year");
int number = input.nextInt();

int days = 365;
int years = number;
int results = days * years;
System.out.printf(" the results is:%d%n", results);

}






}