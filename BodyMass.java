import java.util.Scanner;
public class BodyMass{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("enter a number for weight");
int weightInPounds = scanner.nextInt();

System.out.println("enter a number for height");
int height = scanner.nextInt();

int Bmi = (weightInPounds) / height * height;

System.out.printf("the number for Bmi is:%d",weightInPounds, height);








}



}