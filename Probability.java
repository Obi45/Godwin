import java.util.Scanner;
public class Probability{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Guess a number");
int number = input.nextInt();


if (number == 1 ){
System.out.println("tail is correct");
}
if ( number > 1 ){
System.out.println(" incorrect");
}
if (number == 0){
System.out.println(" head is correct");
}
if (" number < 0 "){
System.out.println("incorrect");
}


}


}