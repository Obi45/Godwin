import java.util.Scanner;
public class DaysInMonth{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number for month");
int number1 = scanner.nextInt();

System.out.println("Enter a number for year");
int number2 = scanner.nextInt();


if( number1 == 1 ){
System.out.printf("%d january has 31days", number2);
}
if ( number1 == 2 && number2%4 == 0 ){
System.out.printf("%d february has 29days", number2);
}
if ( number1 == 2 && number2%4> = 1 ){
System.out.printf("%d february has 28days", number2);
}
if (number1 == 3 ){
System.out.printf("%d march has 31days"number2);
}

if ( number1 == 4 ){
System.out.printf("%d april has 30days", number2);
}
if ( number1 == 5){
System.out.printf("%d may has 31days", number2); 
}
if ( number1 == 6 ){
System.out.printf("%d june has 30days", number2);
} 
if ( number1 == 7){
System.out.printf("%d july has 31days",number2);
} 
if ( number1 == 8 ){
System.out.printf("%d august has 31days",number2);
}
if ( number1 == 9){
System.out.printf("%d september has 30days",number2);
}
if ( number1 == 10 ){
System.out.printf("%d october has 31days", number2);
} 
if ( number1 == 11 ){
System.out.printf("%d november has 30days",number2);
}
if ( number1 == 12 ){
System.out.printf(%s year december has 31days",number2);
}

} 
}




