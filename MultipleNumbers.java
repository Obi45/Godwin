import java.util.Scanner;
public class MultipleNumbers{
public static void main(String[] args){


Scanner scanner = new Scanner(System.in);
System.out.println("enter an integer");
int number = scanner.nextInt();
int n = 10;

if ( number % n == 0 ){
System.out.printf(" zero");
}
if( number <= n ){
System.out.printf("positive");
}
if (number < n){
System.out.printf("negative");
}




}
}





