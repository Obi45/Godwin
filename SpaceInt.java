import java.util.Scanner;
public class SpaceInt{

public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number:");
  
    int numberToReverse = input.nextInt();
 int fifthNO =  numberToReverse %10;
int remainder4 =  numberToReverse /10;
   
int fourthNo= remainder4 % 10; 
int remainder3 = remainder4 / 10;
 
int thirdNo= remainder3 % 10;
int remainder2 = remainder3/10;

int secondNo = remainder2%10;
int remainder1 = remainder2/10;

int firstNo = remainder1% 10;
 
System.out.printf("%d   %d   %d  %d  %d " , firstNo, secondNo, thirdNo, fourthNo, fifthNO);











}













}
 