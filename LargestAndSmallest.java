import java.util.Scanner;
public class LargestAndSmallest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("enter the first integer");
int number1 = input.nextInt();

System.out.println("enter second integer");
int number2 = input.nextInt();

System.out.println("enter the third integer");
int number3 = input.nextInt();

System.out.println("enter the fourth integer");
int number4 = input.nextInt();

System.out.println("enter the fifth integer");
int number5 = input.nextInt();

int numberx = Integer.MAX_;

if(number1 > numberx){
numberx = number1;
}
if(number2 > numberx){
numberx = number2;
}
if(number3 > numberx){
numberx = number3;
}
if(number4 > numberx){
numberx =number4;
}
if(number5 > numberx){
numberx = number5;
}
System.out.printf("the largest number is:%d%n",numberx);


}


}