import java.util.Scanner;
public class Game{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the first name");
String name1 = scanner.nextLine();

System.out.println("Enter the second name");
String name2 = scanner.nextLine();

System.out.println("enter a number from 0,1 or 2"); 
int person1 = scanner.nextInt();

System.out.println("enter a number from 0,1 or 2");
int person2 = scanner.nextInt();

int scissor = 0;   
int rock = 1;
int paper =2; 
if (person1 == rock && person2 == rock){
System.out.printf("%s draw %s", name1, name2);
}
if (person1 == scissor && person2 == scissor){
System.out.printf("%s draws%s", name1, name2);
}
if (person1 == paper && person2 ==paper){
System.out.printf("%s draws%s", name1, name2);
}
if (person2==rock && person1==scissor);{
System.out.printf("%s wins %s", name1, name2);
}
if (person2 ==rock && person1 == paper){
System.out.printf("%s wins%s", name1, name2);
}
if (person2 == paper && person1 ==rock){
System.out.printf("%s wins %s", name1, name2);
}
}
}